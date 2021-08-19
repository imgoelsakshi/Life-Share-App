package com.example.homepage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class homepage extends AppCompatActivity {
    LinearLayout l1,l2,l3,l4,l5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);
        l1=(LinearLayout)findViewById(R.id.buttonb1);
        l5=(LinearLayout)findViewById(R.id.buttonb2);
        l2=(LinearLayout)findViewById(R.id.buttonb8);
        l3=(LinearLayout)findViewById(R.id.buttonb6);
        l4=(LinearLayout)findViewById(R.id.buttonb4);


        l1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inew=new Intent(homepage.this, donorform.class);
                startActivity(inew);
                finish();
            }
        });
        l2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent(homepage.this, userfeedback.class);
                startActivity(i1);
                finish();
            }
        });
        l3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inew1=new Intent(homepage.this, associationform.class);
                startActivity(inew1);
                finish();
            }
        });
        l4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inew2=new Intent(homepage.this, facts.class);
                startActivity(inew2);
                finish();
            }
        });
        l5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inew289=new Intent(homepage.this, request_blood.class);
                startActivity(inew289);
                finish();
            }
        });
    }
}