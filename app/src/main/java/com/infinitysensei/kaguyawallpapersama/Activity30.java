package com.infinitysensei.kaguyawallpapersama;

import androidx.appcompat.app.AppCompatActivity;

import android.app.WallpaperManager;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.io.IOException;

public class Activity30 extends AppCompatActivity {
    Button button1;
    Button button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_30);
        Button button=findViewById(R.id.button);
        button1= findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        button2= findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(Activity30.this,p30.class);
                startActivity(intent1);
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setWallpaper();
            }
        });

    }
    private void setWallpaper() {
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.w30);
        WallpaperManager manager = WallpaperManager.getInstance(getApplicationContext());
        try {
            manager.setBitmap(bitmap);
            Toast.makeText(this, "Wallpaper set !", Toast.LENGTH_SHORT).show();
        } catch (IOException e) {
            Toast.makeText(this, "OOPS!", Toast.LENGTH_SHORT).show();

        }
    }}