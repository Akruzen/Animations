package com.example.animations;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void bart(View view) {
        Log.i("Info", "bartImageView");
        ImageView bartImageView = (ImageView) findViewById(R.id.bartImageView);
        ImageView homerImageView = (ImageView) findViewById(R.id.homerimageView);
        bartImageView.animate().scaleX(0.5f).scaleY(0.5f).translationXBy(-500).setDuration(1000);
        bartImageView.animate().alpha(1).scaleX(0.5f).scaleY(0.5f).rotationBy(1800).translationXBy(0).setDuration(2000);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}