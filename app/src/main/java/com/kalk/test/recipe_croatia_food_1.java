package com.kalk.test;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

public class recipe_croatia_food_1 extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe_croatia_food_1);
    }

    public void goBackToCroRecipes(View v)
    {
        Intent pip = new Intent(this, category_result_blk.class);
        startActivity(pip);
    }
}