package com.kalk.test;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class category_result_blk extends AppCompatActivity
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
    public void burek(View view){
        Intent pip = new Intent(this, b1.class);
        startActivity(pip);
    }
    public void cevapi(View view){
        Intent pip = new Intent(this, b2.class);
        startActivity(pip);
    }
    public void sardines(View view){
        Intent pip = new Intent(this, b3.class);
        startActivity(pip);
    }
}
