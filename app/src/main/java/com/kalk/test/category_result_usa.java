package com.kalk.test;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class category_result_usa extends AppCompatActivity
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
    public void bigmac(View view){
        Intent pip = new Intent(this, u1.class);
        startActivity(pip);
    }
    public void fish(View view){
        Intent pip = new Intent(this, u2.class);
        startActivity(pip);
    }
    public void kfc(View view){
        Intent pip = new Intent(this, u3.class);
        startActivity(pip);
    }
}
