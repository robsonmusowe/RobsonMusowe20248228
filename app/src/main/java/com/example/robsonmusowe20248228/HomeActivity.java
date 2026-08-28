package com.example.robsonmusowe20248228;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {

    private static final String TAG = "KamulangaApp";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "HomeActivity: onCreate");
        setContentView(R.layout.activity_home);

        Button timetableButton = findViewById(R.id.buttonTimetable);
        Button noticesButton = findViewById(R.id.buttonNotices);
        Button logoutButton = findViewById(R.id.buttonLogout);

        timetableButton.setOnClickListener(v -> {
            Intent intent = new Intent(HomeActivity.this, TimetableActivity.class);
            startActivity(intent);
        });

        noticesButton.setOnClickListener(v -> {
            Intent intent = new Intent(HomeActivity.this, NoticesActivity.class);
            startActivity(intent);
        });

        logoutButton.setOnClickListener(v -> {
            Intent intent = new Intent(HomeActivity.this, MainActivity.class);
            startActivity(intent);
            finish();
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "HomeActivity: onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "HomeActivity: onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "HomeActivity: onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "HomeActivity: onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "HomeActivity: onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "HomeActivity: onRestart");
    }
}