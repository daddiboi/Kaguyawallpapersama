package com.infinitysensei.kaguyawallpapersama;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;

public class MainActivity extends AppCompatActivity {
 Button set1;
 Button set2;
 Button set3;
 Button set4;
    private InterstitialAd mInterstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-3940256099942544/1033173712");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());


        set1=findViewById(R.id.set1);
        set1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                    Intent intent1 = new Intent(MainActivity.this,Activity1_1.class);
                    startActivity(intent1);
                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                    Intent intent1 = new Intent(MainActivity.this,Activity1_1.class);
                    startActivity(intent1);
                }
            }
        });

        set2=findViewById(R.id.set2);
        set2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                    Intent intent1 = new Intent(MainActivity.this,Activity2_1.class);
                    startActivity(intent1);
                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                    Intent intent1 = new Intent(MainActivity.this,Activity2_1.class);
                    startActivity(intent1);
                }
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
        AdView banner1 = new AdView(this);
        banner1.setAdSize(AdSize.BANNER);

        banner1.setAdUnitId(getString(R.string.bannerid));
        RelativeLayout layout=(RelativeLayout)findViewById(R.id.banner1);
        layout.addView(banner1);
        AdRequest adRequest=new AdRequest.Builder().build();
        banner1.loadAd(adRequest);




    }
}