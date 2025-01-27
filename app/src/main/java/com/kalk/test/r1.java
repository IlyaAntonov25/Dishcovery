package com.kalk.test;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class r1 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
    }
    public void Back(View view){
        Intent pip = new Intent(this, category_result_rus.class);
        startActivity(pip);
    }
}