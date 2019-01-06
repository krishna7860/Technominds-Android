package com.udacity.krishna.newsapp.ui;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.udacity.krishna.newsapp.R;

public class SplashActivity extends AppCompatActivity {
    private final Handler handler = new Handler();
    private final Runnable startMain = () -> {
        startActivity(new Intent(this, MainActivity.class));
        finish();
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        handler.postDelayed(startMain, 4000);
    }

    @Override
    protected void onDestroy() {
        handler.removeCallbacks(startMain);
        super.onDestroy();
    }
}
