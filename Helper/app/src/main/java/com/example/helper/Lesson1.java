package com.example.helper;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Lesson1 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lesson1);

        @SuppressLint("WrongViewCast") Button backButton = findViewById(R.id.imageButton4);
        backButton.setOnClickListener(v -> finish()); // вернуться назад
    }
}
