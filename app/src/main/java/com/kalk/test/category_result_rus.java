package com.kalk.test;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class category_result_rus extends AppCompatActivity
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
    public void ukha(View view){
        Intent pip = new Intent(this, r1.class);
        startActivity(pip);
    }
    public void beef(View view){
        Intent pip = new Intent(this, r2.class);
        startActivity(pip);
    }
    public void salad(View view){
        Intent pip = new Intent(this, r3.class);
        startActivity(pip);
    }
}
