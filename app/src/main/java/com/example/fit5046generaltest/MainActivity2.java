package com.example.fit5046generaltest;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.fit5046generaltest.databinding.ActivityMain2Binding;
import com.example.fit5046generaltest.databinding.ActivityMainBinding;

public class MainActivity2 extends AppCompatActivity {

    private ActivityMain2Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        binding = ActivityMain2Binding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.startButton.setOnClickListener(view1 -> {
            Intent intent = new Intent(MainActivity2.this, MainActivity.class);
            startActivity(intent);
        });
    }
}