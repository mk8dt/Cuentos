package com.example.mario.cuentos;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class EligeCuentoActivity extends AppCompatActivity {

    private ListView lv;
    private ArrayList<Cuento> lista;
    String nombre,titulo,txto;
    Cuento[] cuentos = {

            new Cuento("El deseo del dinosaurio","Enfurecido, entristecido y hambriento...",
                    "Enfurecido, entristecido y hambriento, porque el T-Rex le había robado la presa que había casado, %s el velociraptor," + " al ver una estrella fugaz surcar los cielos en dirección a la tierra,  deseó, lleno de odio, que el mundo se acabara y que todos se extinguieran."),
            new Cuento("Amores fugaces","Cuando se fue a la cama...",
                    "Cuando %s se fue a la cama, a pesar de haber tenido una día largo y complicado, recordó la efímera sonrisa que le dedicó aquel desconocido que se cruzó en su camino y, olvidándose de todo, se quedó dormido con una gran sonrisa en los labios."),
            new Cuento("El deseo de cumpleaños","Mientras le cantaban el cumpleaños...",
                    "Mientras le cantaban el cumpleaños, %s cerró fuertemente los ojos y se concentró en pedir su deseo con todas sus fuerzas y, cuando finalmente sopló las velitas, de la nada, se materializó un pony rosado que cayó sobre el pastel, salpicando a todos los presentes."),
            new Cuento("La venganza de la hormiga mutante","Después de alcanzar un tamaño gigantesco...",
                    "Después de alcanzar un tamaño gigantesco, por meterse en un barril de desecho toxicos, lo primero que hizo %s, la no-tan pequeña hormiguita, fue dirigirse a la primera ciudad que vio a lo lejos, para  aplastar, con su nuevo gigantesco pie, los edificios y casas de los humanos, tal como uno de ellos había hecho con su hormiguero, hace mucho tiempo, en el bosque donde vivía."),
            new Cuento("El escritor vampiro","A lo que los primeros rayos...",
                    "A lo que los primeros rayos de sol empezaban a asomarse por la ventana, %s guardaba todo su trabajo y caía, rendido, hasta el anochecer; momento en el cual despertaba con los dedos y las ideas listas para escribir toda la noche."),
            new Cuento("La nube","Cuando se asomó por la ventanilla...",
                    "Cuando %s se asomó por la ventanilla del avión vio, horrorizado, cómo todas sus fotos y videos privados estaban flotando en  las nubes. Aterrado, cerró la ventanilla y miró a su alrededor; afortunadamente, nadie más las vio, todos los demás pasajeros estaban durmiendo. Sin embargo, ya estaba decidido, tan pronto aterrizaran iba a eliminar el respaldo de su computadora que había subido a la nube."),
            new Cuento("Amor griego, fuego griego","Frustrada consigo misma...",
                    "%s, frustrada consigo misma, después que lo abofeteó, sintió en la palma de su mano el placentero ardor producido por el fuego que nunca dejó de sentir cada vez que lo tocaba."),
            new Cuento("El mochilero","‘Todo es tan diferente’ pensó...",
                    "‘Todo es tan diferente’ pensó %s  cuando regresó de su viaje, a pesar de que nada hubiera cambiado durante el año y medio que estuvo recorriendo el mundo."),
            new Cuento("El invierno eterno","Justo cuando empezó a pensar ...",
                    "Justo cuando empezó a pensar que el invierno nunca acabaría, se percató de que, entre la gruesa capa de nieve que cubría su jardín de rosas, un pequeñísimo pimpollo comenzaba a abrirse camino."),
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elige_cuento);
        lv = (ListView)findViewById(R.id.listView);
        nombre=getIntent().getStringExtra("nombre");


        cargarlista();

        CuentoAdapter la = new CuentoAdapter(this, R.layout.cuento_item, lista);
        lv.setAdapter(la);
        
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override

            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

                Cuento itemSel = (Cuento) adapterView.getItemAtPosition(position);

                CharSequence texto =  itemSel.getTitulo();
                String msg = "Has seleccionado la opción " + texto ;
                Toast.makeText(EligeCuentoActivity.this, "", Toast.LENGTH_SHORT).show();
                Toast.makeText(EligeCuentoActivity.this,
                        msg,Toast.LENGTH_SHORT).show();

                leeCuento(adapterView, position);
            }
        });
    }

    private void leeCuento(AdapterView<?> adapterView, int position) {

        CharSequence texto;Intent i = new Intent(EligeCuentoActivity.this,LeeCuentoActivity.class);

        Cuento cuentoSel = (Cuento) adapterView.getItemAtPosition(position);
        titulo = cuentoSel.getTitulo();
        txto = cuentoSel.getTexto();
        i.putExtra("nombre",nombre);
        i.putExtra("titulo",titulo);
        i.putExtra("texto",txto);
        startActivity(i);
    }

    public void cargarlista(){
        lista = new ArrayList<Cuento>();
        lista.add(new Cuento ("El deseo del dinosaurio","Enfurecido, entristecido y hambriento...",
                "Enfurecido, entristecido y hambriento, porque el T-Rex le había robado la presa que había casado, %s el velociraptor," + " al ver una estrella fugaz surcar los cielos en dirección a la tierra,  deseó, lleno de odio, que el mundo se acabara y que todos se extinguieran."));
        lista.add(new Cuento("Amores fugaces","Cuando se fue a la cama...",
                "Cuando %s se fue a la cama, a pesar de haber tenido una día largo y complicado, recordó la efímera sonrisa que le dedicó aquel desconocido que se cruzó en su camino y, olvidándose de todo, se quedó dormido con una gran sonrisa en los labios."));
        lista.add(new Cuento("El deseo de cumpleaños","Mientras le cantaban el cumpleaños...",
                "Mientras le cantaban el cumpleaños, %s cerró fuertemente los ojos y se concentró en pedir su deseo con todas sus fuerzas y, cuando finalmente sopló las velitas, de la nada, se materializó un pony rosado que cayó sobre el pastel, salpicando a todos los presentes."));
        lista.add(new Cuento("La venganza de la hormiga mutante","Después de alcanzar un tamaño gigantesco...",
                "Después de alcanzar un tamaño gigantesco, por meterse en un barril de desecho toxicos, lo primero que hizo %s, la no-tan pequeña hormiguita, fue dirigirse a la primera ciudad que vio a lo lejos, para  aplastar, con su nuevo gigantesco pie, los edificios y casas de los humanos, tal como uno de ellos había hecho con su hormiguero, hace mucho tiempo, en el bosque donde vivía."));
        lista.add( new Cuento("El escritor vampiro","A lo que los primeros rayos...",
                "A lo que los primeros rayos de sol empezaban a asomarse por la ventana, %s guardaba todo su trabajo y caía, rendido, hasta el anochecer; momento en el cual despertaba con los dedos y las ideas listas para escribir toda la noche."));
        lista.add(new Cuento("La nube","Cuando se asomó por la ventanilla...",
                "Cuando %s se asomó por la ventanilla del avión vio, horrorizado, cómo todas sus fotos y videos privados estaban flotando en  las nubes. Aterrado, cerró la ventanilla y miró a su alrededor; afortunadamente, nadie más las vio, todos los demás pasajeros estaban durmiendo. Sin embargo, ya estaba decidido, tan pronto aterrizaran iba a eliminar el respaldo de su computadora que había subido a la nube."));
        lista.add( new Cuento("Amor griego, fuego griego","Frustrada consigo misma...",
                 "%s, frustrada consigo misma, después que lo abofeteó, sintió en la palma de su mano el placentero ardor producido por el fuego que nunca dejó de sentir cada vez que lo tocaba."));
        lista.add( new Cuento("El mochilero","‘Todo es tan diferente’ pensó...",
                "‘Todo es tan diferente’ pensó %s  cuando regresó de su viaje, a pesar de que nada hubiera cambiado durante el año y medio que estuvo recorriendo el mundo."));
        lista.add( new Cuento("El invierno eterno","Justo cuando empezó a pensar ...",
                "Justo cuando empezó a pensar que el invierno nunca acabaría, se percató de que, entre la gruesa capa de nieve que cubría su jardín de rosas, un pequeñísimo pimpollo comenzaba a abrirse camino."));
    }
}
