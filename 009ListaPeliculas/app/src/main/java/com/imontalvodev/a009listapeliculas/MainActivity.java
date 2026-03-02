package com.imontalvodev.a009listapeliculas;

import android.os.Bundle;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView lvPeliculas;
    private ArrayList<Pelicula> peliculas;
    private AdaptadorPeliculas adaptadorPeliculas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        lvPeliculas = findViewById(R.id.lvPeliculas);
        peliculas = new ArrayList<>();

        peliculas.add(new Pelicula("El Padrino", "Francis Ford Coppola", 1972, 9.2, R.drawable.el_padrino));
        peliculas.add(new Pelicula("Pulp Fiction", "Quentin Tarantino", 1994, 8.9, R.drawable.pulp_fiction));
        peliculas.add(new Pelicula("Kill Bill Vol 1", "Quentin Tarantino", 2003, 8.9, R.drawable.kill_bill_vol1));
        peliculas.add(new Pelicula("Kill Bill Vol 2", "Quentin Tarantino", 2004, 8.9, R.drawable.kill_bill_vol2));

        adaptadorPeliculas = new AdaptadorPeliculas(this, R.layout.item_pelicula, peliculas);
        lvPeliculas.setAdapter(adaptadorPeliculas);

        lvPeliculas.setOnItemClickListener((adapterView, view, i, l) -> {
            AlertDialog.Builder builder = new AlertDialog.Builder(this).setTitle(peliculas.get(i).getTitulo()).setMessage("Director: " + peliculas.get(i).getDirector() + "\nAño: " + peliculas.get(i).getAnyo() + "\nCalificación: " + peliculas.get(i).getCalificacion());
            builder.show();
        });
    }
}