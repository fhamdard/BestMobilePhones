package com.example.bestmobilephones.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.bestmobilephones.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public static class OnBoardingFlow extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_on_boarding_flow);
        }
    }
}
