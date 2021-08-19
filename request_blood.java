package com.example.homepage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class request_blood extends AppCompatActivity {


    Button g;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_request_blood);

        g=(Button)findViewById(R.id.button786);
        g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent news12=new Intent(request_blood.this, donordetails.class);
                startActivity(news12);
                finish();
            }
        });

    }
}