package com.kalk.test;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class category_result_pol extends AppCompatActivity
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
    public void golabki(View view){
        Intent pip = new Intent(this, p1.class);
        startActivity(pip);
    }
    public void rosol(View view){
        Intent pip = new Intent(this, p2.class);
        startActivity(pip);
    }
    public void bigos(View view){
        Intent pip = new Intent(this, p3.class);
        startActivity(pip);
    }
}
