package com.kalk.test;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import android.widget.ImageView;

import java.io.IOException;
import java.io.InputStream;

public class mainMenu extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
    }

    public void goToRus(View v)
    {
        Intent pip = new Intent(this, category_result_rus.class);
        startActivity(pip);
    }

    public void goToPol(View v)
    {
        Intent pip = new Intent(this, category_result_pol.class);
        startActivity(pip);
    }

    public void goToUSA(View v)
    {
        Intent pip = new Intent(this, category_result_usa.class);
        startActivity(pip);
    }

    public void goToCro(View v)
    {
        Intent pip = new Intent(this, category_result_blk.class);
        startActivity(pip);
    }

    public void goToUK(View v)
    {
        Intent pip = new Intent(this, category_result_gbp.class);
        startActivity(pip);
    }

    public void goToJap(View v)
    {
        Intent pip = new Intent(this, category_result_jap.class);
        startActivity(pip);
    }
}
