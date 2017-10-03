package com.sergiobt.nuestrasangre;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    private String usuarioR, contrasenaR;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Bundle extras = getIntent().getExtras();
        if(extras !=null){
        usuarioR = extras.getString("usuario");
        contrasenaR = extras.getString("contrasena");
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        Intent intent;

        switch(id){
            case R.id.mPerfil:
                intent =  new Intent(MainActivity.this,
                        PerfilActivity.class);
                startActivity(intent);
                finish();
                break;
            case R.id.mCerrar:
                intent =  new Intent(MainActivity.this,
                        LogginActivity.class);
                startActivity(intent);
                finish();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
