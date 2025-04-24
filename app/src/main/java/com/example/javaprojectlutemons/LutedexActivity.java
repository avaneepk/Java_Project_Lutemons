package com.example.javaprojectlutemons;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import java.util.Arrays;
import java.util.List;

public class LutedexActivity extends AppCompatActivity {

    @Override protected void onCreate(Bundle b) {
        super.onCreate(b);
        setContentView(R.layout.activity_lutedex);

        BottomNavigationView nav = findViewById(R.id.bottom_nav);
        nav.setSelectedItemId(R.id.nav_home);
        nav.setOnItemSelectedListener(this::onNav);

        RecyclerView rv = findViewById(R.id.recycler_lutedex);
        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setAdapter(new LutemonAdapter(dummyData()));
    }

    private boolean onNav(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.nav_back:     finish(); return true;
            case R.id.nav_home:     startActivity(new Intent(this, HomeActivity.class)); return true;
            case R.id.nav_settings: startActivity(new Intent(this, SettingsActivity.class)); return true;
            default: return false;
        }
    }

    /* ---- quick dummy adapter so the screen renders ---- */
    private List<String> dummyData() {
        return Arrays.asList("Red", "Orange", "Gray", "Blue");
    }

    private static class LutemonAdapter extends RecyclerView.Adapter<LutemonAdapter.VH> {
        private final List<String> data;
        LutemonAdapter(List<String> d){ data=d; }

        @NonNull @Override
        public VH onCreateViewHolder(@NonNull android.view.ViewGroup p, int v) {
            android.view.View row = android.view.LayoutInflater.from(p.getContext())
                    .inflate(R.layout.item_lutemon, p, false);
            return new VH(row);
        }
        @Override public void onBindViewHolder(@NonNull VH h, int i) {
            h.name.setText(data.get(i));
        }
        @Override public int getItemCount(){ return data.size(); }

        static class VH extends RecyclerView.ViewHolder {
            android.widget.TextView name;
            VH(@NonNull android.view.View v){ super(v);
                name = v.findViewById(R.id.tv_name);
            }
        }
    }
}
