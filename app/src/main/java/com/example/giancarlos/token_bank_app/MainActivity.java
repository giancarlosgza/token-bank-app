package com.example.giancarlos.token_bank_app;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.format.DateUtils;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Handler h = new Handler();
        h.post(new Runnable() {
            @Override
            public void run() {
                String generatedPassword = String.valueOf(System.currentTimeMillis());
                generatedPassword =
                        String.valueOf(generatedPassword.charAt(0)) +
                        String.valueOf(generatedPassword.charAt(2)) +
                        String.valueOf(generatedPassword.charAt(4)) +
                        String.valueOf(generatedPassword.charAt(6)) +
                        String.valueOf(generatedPassword.charAt(8));

                TextView token = (TextView)findViewById(R.id.token);
                String tokenString = String.valueOf(generatedPassword);
                token.setText(tokenString);

                h.postDelayed(this,
                        DateUtils.MINUTE_IN_MILLIS - System.currentTimeMillis() % DateUtils.MINUTE_IN_MILLIS);
            }
        });
    }

}
