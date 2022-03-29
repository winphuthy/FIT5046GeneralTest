package com.example.fit5046generaltest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

import com.example.fit5046generaltest.databinding.ActivityMain3Binding;
import com.example.fit5046generaltest.databinding.ActivityMainBinding;

public class MainActivity3 extends AppCompatActivity {
    private ActivityMain3Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMain3Binding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        binding.viewButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                replaceFragment(new ViewFragment());
            }
        });
        binding.addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                replaceFragment(new AddFragment());
            }
        });
    }

    private void replaceFragment(Fragment nextFragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragment_container_view, nextFragment);
        fragmentTransaction.commit();
    }
}