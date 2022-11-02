package com.example.proyecto_dam;

import static com.example.proyecto_dam.Conexion_bbdd.Conectar;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class RegistroActivity extends AppCompatActivity {

    protected EditText caja1;
    protected EditText caja2;
    protected EditText caja3;
    protected Spinner spinner;
    protected Button boton1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        //Instancio cada objeto de la pantalla
        caja1=(EditText) findViewById(R.id.campo_registro_nombre);
        caja2=(EditText) findViewById(R.id.campo_registro_email);
        caja3=(EditText) findViewById(R.id.campo_registro_password);
        spinner=(Spinner) findViewById(R.id.spinner_registro_rol);
        boton1=(Button) findViewById(R.id.boton_registro_intro);

        boton1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // TODO Auto-generated method stub
                try {
                    Conectar();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });






    }
}