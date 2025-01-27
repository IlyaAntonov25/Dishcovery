package com.kalk.test;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class category_result_jap extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
    }
    public void Back(View view){
        Intent pip = new Intent(this, mainMenu.class);
        startActivity(pip);
    }
    public void sushi(View view){
        Intent pip = new Intent(this, j1.class);
        startActivity(pip);
    }
    public void teriyaki(View view){
        Intent pip = new Intent(this, j2.class);
        startActivity(pip);
    }
    public void katsudon(View view){
        Intent pip = new Intent(this, j3.class);
        startActivity(pip);
    }
}
