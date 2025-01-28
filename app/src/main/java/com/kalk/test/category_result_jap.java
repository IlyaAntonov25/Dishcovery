package com.kalk.test;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

public class category_result_jap extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_jap);
    }

    public void backToMenu(View v)
    {
        Intent pip = new Intent(this, mainMenu.class);
        startActivity(pip);
    }

    public void goToJapanFood1(View v)
    {
        Intent pip = new Intent(this, recipe_japan_food_1.class);
        startActivity(pip);
    }

    public void goToJapanFood2(View v)
    {
        Intent pip = new Intent(this, recipe_japan_food_2.class);
        startActivity(pip);
    }

    public void goToJapanFood3(View v)
    {
        Intent pip = new Intent(this, recipe_japan_food_3.class);
        startActivity(pip);
    }

    public void goToJapanFood4(View v)
    {
        Intent pip = new Intent(this, recipe_japan_food_4.class);
        startActivity(pip);
    }
}
