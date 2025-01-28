package com.kalk.test;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

public class category_result_usa extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_usa);
    }

    public void backToMenu(View v)
    {
        Intent pip = new Intent(this, mainMenu.class);
        startActivity(pip);
    }

    public void goToUSAFood1(View v)
    {
        Intent pip = new Intent(this, recipe_usa_food_1.class);
        startActivity(pip);
    }

    public void goToUSAFood2(View v)
    {
        Intent pip = new Intent(this, recipe_usa_food_2.class);
        startActivity(pip);
    }

    public void goToUSAFood3(View v)
    {
        Intent pip = new Intent(this, recipe_usa_food_3.class);
        startActivity(pip);
    }

    public void goToUSAFood4(View v)
    {
        Intent pip = new Intent(this, recipe_usa_food_4.class);
        startActivity(pip);
    }
}
