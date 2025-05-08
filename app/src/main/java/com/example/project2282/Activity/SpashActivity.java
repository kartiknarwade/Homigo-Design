package com.example.project2282.Activity;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.example.project2282.databinding.ActivitySpashBinding;

public class SpashActivity extends AppCompatActivity {
    private ActivitySpashBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        binding=ActivitySpashBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.startBtn.setOnClickListener(view ->
                startActivity(new Intent(SpashActivity.this, MainActivity.class)));

    }
}