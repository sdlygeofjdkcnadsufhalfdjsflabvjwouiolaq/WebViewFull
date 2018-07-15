package com.stek.ca_ltd.webviewfull;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Farewell extends AppCompatActivity {

    private static int SPLASH_TIME_OUT = 4000;
    boolean connected = false;

    TextView mauncher;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_farewell);
        final MediaPlayer mSound3 = new MediaPlayer().create(this, R.raw.fyi);
        mSound3.start();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
           /*     if(connected = true){
                Intent welcomeintent = new Intent(WelcomeActivity.this, MainActivity.class);
                startActivity(welcomeintent);}
                else if(connected = false){
                    Intent welcomeintent = new Intent(WelcomeActivity.this, ConnectionActivity.class);
                    startActivity(welcomeintent);
                }   */
                System.exit(0);
                System.exit(1);
                System.exit(2);

             //   finish();
            }
        },SPLASH_TIME_OUT);
    }
}

