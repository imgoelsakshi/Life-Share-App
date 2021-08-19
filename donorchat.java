package com.example.homepage;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;

import com.firebase.client.Firebase;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class donorchat extends AppCompatActivity {

    EditText editText;
    ImageView image;
    ListView listview;
    message msg;
    ArrayList<String> msglist;
    ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donorchat);
        //retrieve data from firebase ad display that data in my app
        listview = (ListView)findViewById(R.id.listview123);
        msg = new message();
        msglist = new ArrayList<>();
        adapter =new ArrayAdapter<String>(this,R.layout.list_layout,R.id.text,msglist);
        FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
        DatabaseReference databaseReference = firebaseDatabase.getReference("chat");
        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                msglist.clear();
                for(DataSnapshot ds:dataSnapshot.getChildren())
                {
                    msg = ds.getValue(message.class);
                    msglist.add(msg.getName()+":"+"\n"+msg.getMessage());
                }
                listview.setAdapter(adapter);
            }
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        });
        //inserting data into firebase
        Firebase.setAndroidContext(this);
        final Firebase ref = new Firebase("https://life-share-b6cff.firebaseio.com/chat");
        editText = (EditText)findViewById(R.id.editText);
        image = (ImageView)findViewById(R.id.send);
        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                message message = new message("Recipient", editText.getText().toString());
                ref.push().setValue(message);
                editText.setText("");
            }
        });

    }
}