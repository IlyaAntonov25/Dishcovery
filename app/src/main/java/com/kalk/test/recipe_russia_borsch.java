package com.kalk.test;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

public class recipe_russia_borsch extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe_russia_borsch);
    }

    public void goBackToRusRecipesFromBorsch(View v)
    {
        Intent pip = new Intent(this, category_result_rus.class);
        startActivity(pip);
    }
}
