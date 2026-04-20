package com.example.helper;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);

        @SuppressLint("WrongViewCast") Button btnOption1 = findViewById(R.id.imageButton1);
        @SuppressLint("WrongViewCast") Button btnOption2 = findViewById(R.id.imageButton2);
        @SuppressLint("WrongViewCast") Button btnOption3 = findViewById(R.id.imageButton3);

        btnOption1.setOnClickListener(v -> {
            startActivity(new Intent(this, Option1Activity.class));
        });

        btnOption2.setOnClickListener(v -> {
            startActivity(new Intent(this, Option2Activity.class));
        });

        btnOption3.setOnClickListener(v -> {
            startActivity(new Intent(this, Option3Activity.class));
        });

        @SuppressLint("WrongViewCast") Button backButton = findViewById(R.id.imageButton4);
        backButton.setOnClickListener(v -> finish());
    }
}