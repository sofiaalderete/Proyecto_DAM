package com.example.proyecto_dam;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class InicioActivity extends AppCompatActivity {

    private Intent pasarPantalla;
    protected TextView texto1;
    protected Button boton1;
    protected Button boton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        texto1=(TextView) findViewById(R.id.texto_inicio);
        boton1=(Button) findViewById(R.id.boton_inicio_1);
        boton2=(Button) findViewById(R.id.boton_inicio_2);

        boton1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // TODO Auto-generated method stub

                pasarPantalla=new Intent(InicioActivity.this, RegistroActivity.class);
                finish();
                startActivity(pasarPantalla);
            }
        });

        boton2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // TODO Auto-generated method stub

                pasarPantalla=new Intent(InicioActivity.this, LoginActivity.class);
                finish();
                startActivity(pasarPantalla);
            }
        });



    }
}