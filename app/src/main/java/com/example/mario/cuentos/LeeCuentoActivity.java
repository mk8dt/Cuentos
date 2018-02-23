package com.example.mario.cuentos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class LeeCuentoActivity extends AppCompatActivity {

    String nombre,titulo,texto;
    TextView txTitulo,txTexto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lee_cuento);

        txTitulo = findViewById(R.id.tvTitulo);
        txTexto = findViewById(R.id.tvTexto);

        nombre=getIntent().getStringExtra("nombre");
        titulo = getIntent().getStringExtra("titulo");
        texto = getIntent().getStringExtra("texto");

        txTitulo.setText(titulo);
        txTexto.setText(String.format(texto,nombre));
    }
}
