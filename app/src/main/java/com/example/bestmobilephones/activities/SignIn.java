package com.example.bestmobilephones.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.bestmobilephones.R;
import com.google.firebase.auth.FirebaseAuth;

public class SignIn extends AppCompatActivity {

    Button btnSignIn;
    Button btnSignUp;
    EditText etEmail,etPassword;
    FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        btnSignIn= findViewById (R.id.btnSignIn);
        btnSignUp= findViewById (R.id.btnSignUp);
        etEmail= findViewById (R.id.etEmail);
        etPassword=findViewById(R.id.etPassword);

        mAuth = FirebaseAuth.getInstance();


        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(SignIn.this, SignUp.class);
                startActivity(intent);
            }
        });
    }
}
