package com.example.loginsesion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public static final String USER = "marcela";
    public static final String PASS = "marcela123";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public boolean validateCredentials(String pUser, String pPass) {

        if (pUser.equals(USER) || pPass.equals(PASS)){
            return true;
        } else {
            return false;
        }
    }

    public void transfer(){
        Intent intent = new Intent(this, sesionSuccess.class);
        startActivity(intent);
    }

    public void signIn(View v){
        EditText valUser = (EditText)findViewById(R.id.inpUser);
        EditText valPass = (EditText)findViewById(R.id.inpPass);

        String valUserStr = valUser.getText().toString();
        String valPassStr = valPass.getText().toString();
        boolean valSuccess = validateCredentials(valUserStr+"", valPassStr+"");
        System.out.println(valSuccess);

        if (valSuccess == true) {
            transfer();
        } else {
            Toast.makeText(this, "Error: Usuario y contraseña incorrectos", Toast.LENGTH_LONG).show();
        }
    }
}