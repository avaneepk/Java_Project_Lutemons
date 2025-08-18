package com.example.javaprojectlutemons;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        // Simulate brief splash then go to Loading
        new Handler().postDelayed(() ->
                        startActivity(new Intent(this, LoadingActivity.class))
                , 1200);
    }
}
