package com.kalk.test;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

public class recipe_poland_food_4 extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe_poland_food_4);
    }

    public void goBackToPolRecipes(View v)
    {
        Intent pip = new Intent(this, category_result_pol.class);
        startActivity(pip);
    }
}