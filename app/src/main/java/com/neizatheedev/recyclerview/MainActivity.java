package com.neizatheedev.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    Handler handler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView logo_id = (ImageView) findViewById(R.id.logo_id);

        handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {

            }
        },3000);

    }
}