package com.example.proyecto_dam;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {


    protected EditText caja1;
    protected EditText caja2;
    protected Button boton1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        // Instancio cada objeto de la pantalla
        caja1=(EditText) findViewById(R.id.campo_login_email);
        caja2=(EditText) findViewById(R.id.campo_login_password);
        boton1=(Button) findViewById(R.id.boton_login_entrar);
    }
}