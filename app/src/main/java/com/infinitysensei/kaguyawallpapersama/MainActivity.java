package com.infinitysensei.kaguyawallpapersama;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
 Button set1;
 Button set2;
 Button set3;
 Button set4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        set1=findViewById(R.id.set1);
        set1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(MainActivity.this,Activity1_1.class);
                startActivity(intent1);
            }
        });
        set2=findViewById(R.id.set2);
        set2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(MainActivity.this,Activity2_1.class);
                startActivity(intent1);
            }
        });
        set3=findViewById(R.id.set3);
        set3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(MainActivity.this,privacypolicy.class);
                startActivity(intent1);
            }
        });
        set4=findViewById(R.id.set4);
        set4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(MainActivity.this,sendfeedback.class);
                startActivity(intent1);
            }
        });

    }
}