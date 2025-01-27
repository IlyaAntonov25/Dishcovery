package com.kalk.test;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class category_result_gbp extends AppCompatActivity
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
    public void maderia(View view){
        Intent pip = new Intent(this, g1.class);
        startActivity(pip);
    }
    public void eccles(View view){
        Intent pip = new Intent(this, g2.class);
        startActivity(pip);
    }
    public void salmon(View view){
        Intent pip = new Intent(this, g3.class);
        startActivity(pip);
    }
}
