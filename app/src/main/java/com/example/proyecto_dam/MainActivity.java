package com.example.proyecto_dam;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {
    private Intent pasarPantalla;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TimerTask tt = new TimerTask() {
            @Override
            public void run() {
                pasarPantalla=new Intent(MainActivity.this, InicioActivity.class);
                finish();
                startActivity(pasarPantalla);

            }
        };

        Timer t = new Timer();
        t.schedule(tt, 2000);
    }

}