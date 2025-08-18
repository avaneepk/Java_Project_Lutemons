package com.example.lutemon;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;

public class LoadingActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle b) {
        super.onCreate(b);
        setContentView(R.layout.activity_loading);

        // Simulate work; then open Home
        new Handler().postDelayed(() ->
                        startActivity(new Intent(this, HomeActivity.class))
                , 800);
    }
}
