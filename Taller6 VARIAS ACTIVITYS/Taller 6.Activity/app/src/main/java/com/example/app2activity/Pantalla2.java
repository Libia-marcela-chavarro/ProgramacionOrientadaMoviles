package com.example.app2activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Pantalla2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla2);

        Intent intent = getIntent();
        TextView close = (TextView) findViewById(R.id.close);
        String msn = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        close.setText("HOLA " + msn);
    }

    public void salir(View v) {
        finish();
    }
}