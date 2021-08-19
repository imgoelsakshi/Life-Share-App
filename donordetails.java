package com.example.homepage;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class donordetails extends AppCompatActivity {

    TextView a,b,c,d,e,f,g,h,i;
    Button bf,btn;
    DatabaseReference reff1,reff2,reff3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donordetails);

        a=(TextView)findViewById(R.id.nameView);
        b=(TextView)findViewById(R.id.bgView);
        c=(TextView)findViewById(R.id.placeView);

        d=(TextView)findViewById(R.id.nameView2);
        e=(TextView)findViewById(R.id.bgView2);
        f=(TextView)findViewById(R.id.placeView2);

        g=(TextView)findViewById(R.id.nameView3);
        h=(TextView)findViewById(R.id.bgView3);
        i=(TextView)findViewById(R.id.placeView3);
        btn=(Button)findViewById(R.id.retrieve);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                reff1= FirebaseDatabase.getInstance().getReference().child("Donor").child("-MKdhZ-9WruSeuvMS1Lh");
                reff1.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {

                        String name=snapshot.child("first").getValue().toString();
                        String bg=snapshot.child("group").getValue().toString();
                        String local=snapshot.child("place").getValue().toString();
                        a.setText(name);
                        b.setText(bg);
                        c.setText(local);
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });
                reff2= FirebaseDatabase.getInstance().getReference().child("Donor").child("-MKd_M1w1AHlKMffRmW-");
                reff2.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {

                        String name2=snapshot.child("first").getValue().toString();
                        String bg2=snapshot.child("group").getValue().toString();
                        String local2=snapshot.child("place").getValue().toString();
                        d.setText(name2);
                        e.setText(bg2);
                        f.setText(local2);
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });
                reff3= FirebaseDatabase.getInstance().getReference().child("Donor").child("-MKdnU4iJZMpDHqxclv8");
                reff3.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {

                        String name3=snapshot.child("first").getValue().toString();
                        String bg3=snapshot.child("group").getValue().toString();
                        String local3=snapshot.child("place").getValue().toString();
                        g.setText(name3);
                        h.setText(bg3);
                        i.setText(local3);
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });
            }
        });

        bf=(Button)findViewById(R.id.button357);
        bf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iNew1=new Intent(donordetails.this, donorchat.class);
                startActivity(iNew1);
                finish();
            }
        });
    }
}