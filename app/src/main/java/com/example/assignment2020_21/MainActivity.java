package com.example.assignment2020_21;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView fbImage = findViewById(R.id.facebookImage);
    ImageView igImage = findViewById(R.id.instagramImage);
    ImageView tImage = findViewById(R.id.twitterImage);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fbImage.setImageResource(R.drawable.facebook);
        igImage.setImageResource(R.drawable.instagram);
        tImage.setImageResource(R.drawable.twitter);
    }
}