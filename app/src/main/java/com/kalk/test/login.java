package com.kalk.test;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import android.widget.EditText;
import android.widget.TextView;

public class login extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void fileSave(String a)
    {
        SharedPreferences settings = getSharedPreferences("importantData", MODE_PRIVATE);
        SharedPreferences.Editor editor = settings.edit();

        editor.putString("password", a);
        editor.apply();
    }

    public Integer serverCheck(String a, String b)
    {
        return 1;
    }

    public void goToReg()
    {
        Intent rip = new Intent(this, registration.class);
        startActivity(rip);
    }

    public void gssText(View view)
    {
        EditText pass = findViewById(R.id.unosPassLog);
        EditText nick = findViewById(R.id.unosNickLog);

        String tekstP = pass.getText().toString();
        String tekstN = nick.getText().toString();

        TextView novij = findViewById(R.id.textViewLog);

        if (serverCheck(tekstP, tekstN) == 1)
        {
            fileSave("access");
            novij.setText("access granted");

            Intent pip = new Intent(this, mainMenu.class);
            startActivity(pip);
        }

        else
        {
            novij.setText("access denied");
        }
    }
}