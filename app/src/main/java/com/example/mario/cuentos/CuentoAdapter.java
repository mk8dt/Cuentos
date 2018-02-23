package com.example.mario.cuentos;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by mario on 29/11/2017.
 */

public class CuentoAdapter extends BaseAdapter {

    Context contexto;
    int idLayout;
    ArrayList<Cuento> lista;

    public CuentoAdapter(Context contexto, int idLayout, ArrayList<Cuento> lista) {
        this.contexto = contexto;
        this.idLayout = idLayout;
        this.lista = lista;
    }

    private class Item {

        TextView titulo;
        TextView avance;

    }

    @Override
    public int getCount() {
        return lista.size();
    }

    @Override
    public Object getItem(int i) {
        return lista.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {

       Item elemento;
        if(view == null){
            view = LayoutInflater.from(contexto).inflate(idLayout,null);
            elemento = new Item();
            elemento.titulo = view.findViewById(R.id.tvTitulo);
            elemento.avance = view.findViewById(R.id.tvAvance);
        }else{
            elemento = (Item) view.getTag();
        }

        elemento.titulo.setText(lista.get(position).getTitulo());
        elemento.avance.setText(lista.get(position).getAvance());

        return view;
    }
}
