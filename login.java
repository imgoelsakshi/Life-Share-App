package com.example.homepage;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class login extends AppCompatActivity {

    private TextView tv,tv1,Info;
    private EditText email,password;
    private Button l;
    private int counter=5;
    private FirebaseAuth firebaseAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        firebaseAuth=FirebaseAuth.getInstance();

        tv=(TextView)findViewById(R.id.new12);
        tv1=(TextView)findViewById(R.id.pass);
        Info=(TextView)findViewById(R.id.tvInfo);
        l=(Button)findViewById(R.id.login);
        email=(EditText)findViewById(R.id.Text100);
        password=(EditText)findViewById(R.id.Text200);



        Info.setText("No of attempts is 5");

        l.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent login12=new Intent(login.this,homepage.class);
                startActivity(login12);
                finish();
            }
        });
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(login.this, uregistration.class);
                startActivity(i);
                finish();
            }
        });
        tv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ball=new Intent(login.this, Forgot.class);
                startActivity(ball);
                finish();
            }
        });


    }
}