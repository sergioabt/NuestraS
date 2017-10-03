package com.sergiobt.nuestrasangre;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class RegistroActivity extends AppCompatActivity {



    private String usuario, contrasena,correo;
    EditText eCorreo, eContrasena, eRepContrasena, eUsuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
        Bundle extras = getIntent().getExtras();

        eUsuario = (EditText) findViewById(R.id.eUsuario);
        eCorreo = (EditText) findViewById(R.id.eCorreo);
        eContrasena = (EditText) findViewById(R.id.eContrasena);
        eRepContrasena = (EditText) findViewById(R.id.eRepContrasena);
    }

    public void registrar(View view) {
        usuario = eCorreo.getText().toString();
        contrasena = eContrasena.getText().toString();
        correo = eCorreo.getText().toString();

        Intent intent = new Intent();
        intent.putExtra("usuario", usuario);
        intent.putExtra("contrasena", contrasena);
        intent.putExtra("correo", correo);
        setResult(RESULT_OK, intent);
        finish();
    }
}
