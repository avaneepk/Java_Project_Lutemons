package com.example.javaprojectlutemons;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;

import com.example.javaprojectlutemons.SplashActivity;

import java.util.Timer;
import java.util.TimerTask;

public class LoadingActivity extends AppCompatActivity {

    Timer timer;
    @Override
    protected void onCreate(Bundle b) {
        super.onCreate(b);
        setContentView(R.layout.activity_loading);

        timer = new Timer();
        timer.schedule(new TimerTask(){
            @Override
            public void run() {
                Intent intent = new Intent(LoadingActivity.this, com.example.javaprojectlutemons.HomeActivity.class);
                startActivity(intent);
                finish();
            }
        }, 3000);


    }
}
