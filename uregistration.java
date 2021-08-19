package com.example.homepage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;

import java.lang.reflect.Member;

public class uregistration extends AppCompatActivity {

    TextView abc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uregistration);
        abc=(TextView)findViewById(R.id.editText90);
        abc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i123=new Intent(uregistration.this, blood.class);
                startActivity(i123);
                finish();
            }
        });
    }
}

