package com.example.bestmobilephones.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.bestmobilephones.R;
import com.google.firebase.auth.FirebaseAuth;

public class SplashScreen extends AppCompatActivity {

    FirebaseAuth mAuth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        mAuth = FirebaseAuth.getInstance();
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {


                if (mAuth.getCurrentUser()==null){
                    startActivity(new Intent(SplashScreen.this, SignIn.class));
                    finish();
                }   else {
                    startActivity(new Intent(SplashScreen.this, SignUp.class));
                    finish();
                }


            }
        },4000);
    }
}
