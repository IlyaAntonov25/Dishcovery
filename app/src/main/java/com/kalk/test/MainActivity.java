package com.kalk.test;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void randClick(View view)
    {
        Random pip = new Random();

        TextView out = findViewById(R.id.outPut);

        int a = pip.nextInt(100);
        String help = Integer.toString(a);
        out.setText(help);
    }

    public void kill(View v)
    {
        SharedPreferences settings = getSharedPreferences("importantData", MODE_PRIVATE);
        SharedPreferences.Editor editor = settings.edit();

        editor.remove("password");
        editor.apply();
    }

    public void pusk(View view)
    {
        SharedPreferences settings = getSharedPreferences("importantData", MODE_PRIVATE);

        String a = settings.getString("password", "").toString();

        if (a.equals("access"))
        {
            Intent pip = new Intent(this, mainMenu.class);
            startActivity(pip);
        }

        else
        {
            Intent pip = new Intent(this, login.class);
            startActivity(pip);
        }
    }
}