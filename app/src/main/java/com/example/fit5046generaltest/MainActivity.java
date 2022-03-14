package com.example.fit5046generaltest;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.fit5046generaltest.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Button TestButton = findViewById(R.id.Btn);

//        TestButton.setOnClickListener(view -> TestButton.setText("Hello!"));

        binding = ActivityMainBinding.inflate(getLayoutInflater());

        View view = binding.getRoot();

        setContentView(view);

        binding.Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                binding.editMessage.setText("Hello");
            }
        });

    }
}