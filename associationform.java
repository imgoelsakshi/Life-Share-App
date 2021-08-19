package com.example.homepage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class associationform extends AppCompatActivity {

    EditText e1,e2,e3,e4,e5,e6;
    Button b1;
    DatabaseReference reff;
    Associate_insert associate_insert;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_associationform);

        e1=(EditText)findViewById(R.id.o_name);
        e2=(EditText)findViewById(R.id.o_date);
        e3=(EditText)findViewById(R.id.o_address);
        e4=(EditText)findViewById(R.id.o_mobilenumber);
        e5=(EditText)findViewById(R.id.o_camplocation);
        e6=(EditText)findViewById(R.id.o_message);

        b1=(Button)findViewById(R.id.sub98756);

        associate_insert=new Associate_insert();
        reff= FirebaseDatabase.getInstance().getReference().child("Camp Details");

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                associate_insert.setCompany_name(e1.getText().toString().trim());
                associate_insert.setEst_date(e2.getText().toString().trim());
                associate_insert.setAddress_12(e3.getText().toString().trim());
                associate_insert.setMob_number(e4.getText().toString().trim());
                associate_insert.setLocation_12(e5.getText().toString().trim());
                associate_insert.setMessage_123(e6.getText().toString().trim());

                reff.push().setValue(associate_insert);
                Toast.makeText(getApplicationContext(),"camp details inserted",Toast.LENGTH_LONG).show();
            }
        });
    }
}