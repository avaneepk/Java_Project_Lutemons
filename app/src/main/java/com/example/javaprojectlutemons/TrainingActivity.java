package com.example.javaprojectlutemons;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;
public class TrainingActivity extends AppCompatActivity {

    @Override protected void onCreate(Bundle b) {
        super.onCreate(b);
        setContentView(R.layout.activity_training);

        BottomNavigationView nav = findViewById(R.id.bottom_nav);
        nav.setSelectedItemId(R.id.nav_home);
        nav.setOnItemSelectedListener(this::onNav);

        findViewById(R.id.btn_train).setOnClickListener(v -> {
            // TODO training logic
        });
        findViewById(R.id.btn_potions).setOnClickListener(v -> {
            // TODO choose potions
        });
    }

    private boolean onNav(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.nav_back:     finish(); return true;
            case R.id.nav_home:     startActivity(new Intent(this, HomeActivity.class)); return true;
            case R.id.nav_settings: startActivity(new Intent(this, SettingsActivity.class)); return true;
            default: return false;
        }
    }
}
