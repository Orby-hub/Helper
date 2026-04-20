package com.example.helper;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Tel extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tel);

        @SuppressLint("WrongViewCast") Button backButton = findViewById(R.id.imageButton4);
        backButton.setOnClickListener(v -> finish()); // вернуться назад
    }
}