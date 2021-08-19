package com.example.homepage;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.Manifest;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class Forgot extends AppCompatActivity {
    ImageView ig,ig1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot);
        ig=(ImageView)findViewById(R.id.message12);
        ig1=(ImageView)findViewById(R.id.call12);
        ig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager=getSupportFragmentManager();
                FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
                MessageFragment firstFragment=new MessageFragment();
                fragmentTransaction.replace(R.id.frame,firstFragment,null);
                fragmentTransaction.commit();
            }
        });
        ig1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ActivityCompat.requestPermissions(Forgot.this,new  String[]{Manifest.permission.CALL_PHONE},1);
                String dial="tel:2341689500";
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
            }
        });
    }
}