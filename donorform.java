package com.example.homepage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class donorform extends AppCompatActivity {

    EditText e1,e2,e3,e4,e5,e6,e7,e8;
    Button b1;
    DatabaseReference reff;
    Donor donor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donorform);

        e1=(EditText)findViewById(R.id.firstName);
        e2=(EditText)findViewById(R.id.lastName);
        e3=(EditText)findViewById(R.id.p_date);
        e4=(EditText)findViewById(R.id.bloodgroup);
        e5=(EditText)findViewById(R.id.p_address);
        e6=(EditText)findViewById(R.id.p_mobilenumber);
        e7=(EditText)findViewById(R.id.p_placetodonate);
        e8=(EditText)findViewById(R.id.p_message);

        b1=(Button)findViewById(R.id.sub1234);

        donor=new Donor();
        reff= FirebaseDatabase.getInstance().getReference().child("Donor");

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                donor.setFirst(e1.getText().toString().trim());
                donor.setLast(e2.getText().toString().trim());
                donor.setBirth(e3.getText().toString().trim());
                donor.setGroup(e4.getText().toString().trim());
                donor.setAdd(e5.getText().toString().trim());
                donor.setPhone(e6.getText().toString().trim());
                donor.setPlace(e7.getText().toString().trim());
                donor.setMsg123(e8.getText().toString().trim());

                reff.push().setValue(donor);
                Toast.makeText(getApplicationContext(),"data inserted",Toast.LENGTH_LONG).show();
            }
        });

    }
}