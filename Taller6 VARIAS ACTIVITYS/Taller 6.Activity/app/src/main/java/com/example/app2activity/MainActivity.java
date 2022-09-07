package com.example.app2activity;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.example.app2activity.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void saludar(View v) {
        Intent intent = new Intent(this, Pantalla2.class);
        EditText name = (EditText) findViewById(R.id.inpNombre);
        String msn = name.getText().toString();

        intent.putExtra(EXTRA_MESSAGE, msn);
        startActivity(intent);
    }
}