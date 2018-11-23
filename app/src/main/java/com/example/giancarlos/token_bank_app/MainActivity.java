package com.example.giancarlos.token_bank_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void generate (View view){


        Random random = new Random();
        String generatedPassword = String.format("%04d0", random.nextInt(10000));

        TextView token = (TextView)findViewById(R.id.token);
        String tokenString = String.valueOf(generatedPassword);
        token.setText(tokenString);
    }
}
