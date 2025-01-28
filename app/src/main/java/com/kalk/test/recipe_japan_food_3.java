package com.kalk.test;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

public class recipe_japan_food_3 extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe_japan_food_3);
    }

    public void goBackToJapRecipes(View v)
    {
        Intent pip = new Intent(this, category_result_jap.class);
        startActivity(pip);
    }
}