package com.example.javaprojectlutemons;

import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle b) {
        super.onCreate(b);
        setContentView(R.layout.activity_home);

        LinearLayout lutdexLayout = findViewById(R.id.goToLutedex);
        lutdexLayout.setOnClickListener(view -> {
            startActivity(new Intent(HomeActivity.this, LutedexActivity.class));
        });

        LinearLayout trainingLayout = findViewById(R.id.goToTraining);
        trainingLayout.setOnClickListener(view -> {
            startActivity(new Intent(HomeActivity.this, TrainingActivity.class));
        });

        LinearLayout battleLayout = findViewById(R.id.goToBattle);
        battleLayout.setOnClickListener(view -> {
            startActivity(new Intent(HomeActivity.this, BattleFieldActivity.class));
        });


    }
}
