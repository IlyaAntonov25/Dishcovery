package com.kalk.test;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

public class category_result_gbp extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_gbp);
    }

    public void backToMenu(View v)
    {
        Intent pip = new Intent(this, mainMenu.class);
        startActivity(pip);
    }

    public void goToUKFood1(View v)
    {
        Intent pip = new Intent(this, recipe_uk_food_1.class);
        startActivity(pip);
    }

    public void goToUKFood2(View v)
    {
        Intent pip = new Intent(this, recipe_uk_food_2.class);
        startActivity(pip);
    }

    public void goToUKFood3(View v)
    {
        Intent pip = new Intent(this, recipe_uk_food_3.class);
        startActivity(pip);
    }

    public void goToUKFood4(View v)
    {
        Intent pip = new Intent(this, recipe_uk_food_4.class);
        startActivity(pip);
    }
}
