package com.example.javaprojectlutemons;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle b) {
        super.onCreate(b);
        setContentView(R.layout.activity_home);

        Button viewLutedex = findViewById(R.id.btn_view_lutedex);
        viewLutedex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, LutedexActivity.class);
                startActivity(intent);
            }
        });

        Button viewTraining = findViewById(R.id.btn_view_training);
        viewTraining.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, TrainingActivity.class);
                startActivity(intent);
            }
        });

        Button viewBattleField = findViewById(R.id.btn_view_battlefield);
        viewBattleField.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, BattleFieldActivity.class);
                startActivity(intent);
            }
        });


        Button viewCreateNewLutemon = findViewById(R.id.btn_view_createnew);
        viewCreateNewLutemon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, CreateLutemonActivity.class);
                startActivity(intent);
            }
        });


    }
}
