package com.example.myfoodapp.activitis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import com.example.myfoodapp.MainActivity;
import com.example.myfoodapp.R;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_login);
    }

    public void DangKy(View view) {
        startActivity(new Intent(LoginActivity.this, RegisterActivity.class));
    }

    public void MainActivity_main(View view) {
        startActivity(new Intent(LoginActivity.this, MainActivity.class));
    }
}