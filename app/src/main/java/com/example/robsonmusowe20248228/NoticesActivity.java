package com.example.robsonmusowe20248228;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class NoticesActivity extends AppCompatActivity {

    private static final String TAG = "KamulangaApp";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "NoticesActivity: onCreate");
        setContentView(R.layout.activity_notices);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "NoticesActivity: onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "NoticesActivity: onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "NoticesActivity: onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "NoticesActivity: onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "NoticesActivity: onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "NoticesActivity: onRestart");
    }
}