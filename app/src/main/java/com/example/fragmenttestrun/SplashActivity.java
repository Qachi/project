package com.example.fragmenttestrun;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {
    ImageView logoSlide;
    TextView qachi;
    Intent intent;
    private int SPLASH_TIME_OUT= 4000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        logoSlide = findViewById(R.id.logoSplash);
        qachi = findViewById(R.id.qachi);
        Animation animation = AnimationUtils.loadAnimation(this,R.anim.anim_slide);
        logoSlide.startAnimation(animation);
        qachi.startAnimation(animation);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                intent = new Intent(SplashActivity.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        },SPLASH_TIME_OUT);
    }
}
