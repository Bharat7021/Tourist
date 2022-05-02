package com.example.touristguide;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private ImageView m, g, r, h;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        m = findViewById(R.id.maha);
        g = findViewById(R.id.guj);
        r = findViewById(R.id.raj);
        h = findViewById(R.id.him);
        m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mah = new Intent(MainActivity.this, Maharashtra.class);
                startActivity(mah);
            }
        });
        g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent guj = new Intent(MainActivity.this, Gujarat.class);
                startActivity(guj);
            }
        });
        r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent raj = new Intent(MainActivity.this, Rajasthan.class);
                startActivity(raj);
            }
        });
        h.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent him = new Intent(MainActivity.this, Himachal.class);
                startActivity(him);
            }
        });
    }
}