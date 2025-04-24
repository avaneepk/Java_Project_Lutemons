package com.example.javaprojectlutemons;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;
public class SettingsActivity extends AppCompatActivity {
    @Override protected void onCreate(Bundle b) {
        super.onCreate(b);
        setContentView(R.layout.activity_settings);

        BottomNavigationView nav = findViewById(R.id.bottom_nav);
        nav.setSelectedItemId(R.id.nav_settings);
        nav.setOnItemSelectedListener(this::onNav);

        findViewById(R.id.btn_close_game).setOnClickListener(v -> finishAffinity());
    }

    private boolean onNav(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.nav_back: finish(); return true;
            case R.id.nav_home: startActivity(new Intent(this, HomeActivity.class)); return true;
            case R.id.nav_settings: return true;
            default: return false;
        }
    }
}
