package com.example.javaprojectlutemons;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class BattleFieldActivity extends AppCompatActivity {
    private TextView log;

    @Override protected void onCreate(Bundle b) {
        super.onCreate(b);
        setContentView(R.layout.activity_battle);

        log = findViewById(R.id.tv_log);

        BottomNavigationView nav = findViewById(R.id.bottom_nav);
        nav.setSelectedItemId(R.id.nav_home);
        nav.setOnItemSelectedListener(this::onNav);

        findViewById(R.id.btn_choose_fight).setOnClickListener(v -> append("Fight chosen"));
        findViewById(R.id.btn_next_attack).setOnClickListener(v -> append("Attack!"));
        findViewById(R.id.btn_end_battle).setOnClickListener(v -> append("Battle ended"));
    }

    private void append(String s){ log.append("\n" + s); }

    private boolean onNav(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.nav_back:     finish(); return true;
            case R.id.nav_home:     startActivity(new Intent(this, HomeActivity.class)); return true;
            case R.id.nav_settings: startActivity(new Intent(this, SettingsActivity.class)); return true;
            default: return false;
        }
    }
}
