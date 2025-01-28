package com.kalk.test;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

public class recipe_uk_food_1 extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe_uk_food_1);
    }

    public void goBackToUKRecipes(View v)
    {
        Intent pip = new Intent(this, category_result_gbp.class);
        startActivity(pip);
    }
}