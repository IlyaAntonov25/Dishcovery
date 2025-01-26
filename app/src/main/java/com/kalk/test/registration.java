package com.kalk.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class registration extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
    }

    public Integer serverCheck(String a, String b, String c)
    {
        return 1;
    }

    public void goToLog()
    {
        Intent pip = new Intent(this, login.class);
        startActivity(pip);
    }

    public void gssText(View view) throws InterruptedException {
        EditText pass = findViewById(R.id.unosPassReg);
        EditText nick = findViewById(R.id.unosNickReg);
        EditText email = findViewById(R.id.unosEmail);

        String tekstP = pass.getText().toString();
        String tekstN = nick.getText().toString();
        String tekstE = email.getText().toString();

        TextView novij = findViewById(R.id.textView);

        if (serverCheck(tekstP, tekstN, tekstE) == 1)
        {
            novij.setText("Account created!");
            Intent pir = new Intent(this, MainActivity.class);
            startActivity(pir);
        }

        /*if (tekstP.equals("1111") && tekstN.equals("Zahar"))
        {
            fileSave("access");
            novij.setText("access granted");

            Intent pip = new Intent(this, mainMenu.class);
            startActivity(pip);
        }

        else
        {
            novij.setText("access denied");
        }*/
    }
}