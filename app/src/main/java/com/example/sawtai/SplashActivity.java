package com.example.sawtai;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import java.util.Timer;
import java.util.TimerTask;

public class SplashActivity extends AppCompatActivity {
private LinearLayout splashLayout;
    Timer timer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        //click splash
        splashLayout = findViewById(R.id.splashLL);
        splashLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SplashActivity.this, Home.class);
                startActivity(intent);
                finish();
            }// on Click
        });

        //Timer for splash
        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                    Intent intent = new Intent(SplashActivity.this, Home.class);
                    startActivity(intent);
                    finish();
            }
        }, 2000);


    }//onCreate()



    }//end class

