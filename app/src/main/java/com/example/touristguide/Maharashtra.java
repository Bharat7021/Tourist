package com.example.touristguide;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Maharashtra extends AppCompatActivity {
    private ImageView mu, pu, n, a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maharashtra);
        mu = findViewById(R.id.mum);
        pu = findViewById(R.id.pune);
        n = findViewById(R.id.nasik);
        a = findViewById(R.id.aur);
        mu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mum = new Intent(Maharashtra.this, Mumbai.class);
                startActivity(mum);
            }
        });
        pu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent p = new Intent(Maharashtra.this, Pune.class);
                startActivity(p);
            }
        });
        n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nas = new Intent(Maharashtra.this, Nashik.class);
                startActivity(nas);
            }
        });
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent aur = new Intent(Maharashtra.this, Aurangabad.class);
                startActivity(aur);
            }
        });
    }
}