package com.imontalvodev.a011galeriaimagenes;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private GridView gridView;
    private ArrayList<Imagen> imagenes = new ArrayList<>();
    private Adaptador adaptador;

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

        gridView = findViewById(R.id.gridView);
        imagenes.add(new Imagen("CPU", R.drawable.cpu));
        imagenes.add(new Imagen("Disco HDD", R.drawable.discohdd));
        imagenes.add(new Imagen("Disco SSD", R.drawable.discossd));
        imagenes.add(new Imagen("GPU", R.drawable.gpu));
        imagenes.add(new Imagen("PSU", R.drawable.psu));
        imagenes.add(new Imagen("Monitor", R.drawable.monitor));
        imagenes.add(new Imagen("Motherboard", R.drawable.motherboard));
        imagenes.add(new Imagen("RAM", R.drawable.ram));
        imagenes.add(new Imagen("LINUX", R.drawable.linux));

        adaptador = new Adaptador(MainActivity.this, imagenes);
        gridView.setAdapter(adaptador);

        gridView.setOnItemClickListener((adapterView, view, i, l) -> {
            Imagen imagen = imagenes.get(i);

            LayoutInflater layoutInflater = getLayoutInflater();
            View v = layoutInflater.inflate(R.layout.dialog_personalizado, null);
            ImageView imageView = v.findViewById(R.id.dialog_image);
            TextView txt = v.findViewById(R.id.dialog_title);
            txt.setText(imagen.getTitulo());
            imageView.setImageResource(imagen.getRecurso());

            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setView(v);
            builder.create().show();
        });
    }
}