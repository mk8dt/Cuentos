package com.example.mario.cuentos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class InicioActivity extends AppCompatActivity {

    Button btn;
    EditText et;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);
        btn = findViewById(R.id.btnEmpezar);
        et = findViewById(R.id.etNombre);
    }
    public void empezar (View v){

        if(et.getText().toString().equals("")){

           Toast toast = Toast.makeText(getApplicationContext(),getResources().getString(R.string.toast),Toast.LENGTH_LONG);
           toast.setGravity(Gravity.BOTTOM,0,0);
           toast.show();

        }else{

            Intent i = new Intent(this,EligeCuentoActivity.class);
            i.putExtra("nombre",et.getText().toString());
            startActivity(i);
        }

    }
}
