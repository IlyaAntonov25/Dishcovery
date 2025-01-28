package com.kalk.test;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

public class category_result_rus extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_rus);
    }

    public void backToMenu(View v)
    {
        Intent pip = new Intent(this, mainMenu.class);
        startActivity(pip);
    }

    public void goToBlini(View v)
    {
        Intent pip = new Intent(this, recipe_russia_blini.class);
        startActivity(pip);
    }

    public void goToBorsch(View v)
    {
        Intent pip = new Intent(this, recipe_russia_borsch.class);
        startActivity(pip);
    }

    public void goToOlivie(View v)
    {
        Intent pip = new Intent(this, recipe_russia_olivie.class);
        startActivity(pip);
    }

    public void goToPlov(View v)
    {
        Intent pip = new Intent(this, recipe_russia_plov.class);
        startActivity(pip);
    }
}
