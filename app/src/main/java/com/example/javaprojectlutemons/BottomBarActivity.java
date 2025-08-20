package com.example.javaprojectlutemons;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import java.util.Arrays;
import java.util.List;

public class BottomBarActivity extends AppCompatActivity {

    @Override protected void onCreate(Bundle b) {
        super.onCreate(b);
        setContentView(R.layout.include_bottom_bar);

        ImageButton backButton = findViewById(R.id.btn_back);
        backButton.setOnClickListener(v -> {
            Intent intent = new Intent(BottomBarActivity.this, HomeActivity.class);
            startActivity(intent);
        });

        ImageButton homeButton = findViewById(R.id.btn_home);
        homeButton.setOnClickListener(v -> {
            Intent intent = new Intent(BottomBarActivity.this, HomeActivity.class);
            startActivity(intent);
        });

        ImageButton settingsButton = findViewById(R.id.btn_settings);
        settingsButton.setOnClickListener(v -> {
            Intent intent = new Intent(BottomBarActivity.this, SettingsActivity.class);
            startActivity(intent);
        });

    }
}
