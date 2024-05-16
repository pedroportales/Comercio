package com.example.comercio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void telaDois(View view) {
        Intent in = new Intent(this, TelaCadastro.class);
        startActivity(in);
    }

    public void teste(View view) {
        Intent in = new Intent(this, Teste.class);
        startActivity(in);
    }
}