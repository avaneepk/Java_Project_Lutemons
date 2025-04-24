package com.example.lutemon;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle b) {
        super.onCreate(b);
        setContentView(R.layout.activity_home);

        // Bottom navigation
        BottomNavigationView nav = findViewById(R.id.bottom_nav);
        nav.setSelectedItemId(R.id.nav_home);
        nav.setOnItemSelectedListener(this::onNav);

        // Card listeners
        findViewById(R.id.card_lutedex).setOnClickListener(v ->
                startActivity(new Intent(this, LutedexActivity.class)));

        findViewById(R.id.card_training).setOnClickListener(v ->
                startActivity(new Intent(this, TrainingActivity.class)));

        findViewById(R.id.card_battle).setOnClickListener(v ->
                startActivity(new Intent(this, BattleFieldActivity.class)));
    }

    private boolean onNav(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.nav_back:    // acts like system back
                finish();
                return true;
            case R.id.nav_home:
                // already here
                return true;
            case R.id.nav_settings:
                startActivity(new Intent(this, SettingsActivity.class));
                return true;
            default: return false;
        }
    }
}
