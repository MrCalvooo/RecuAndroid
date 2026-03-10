package com.imontalvodev.a012catalogoapps;

import android.os.Bundle;
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
    private ArrayList<App> apps;
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
        apps = new ArrayList<>();
        apps.add(new App("Whatsapp", "Mensajeria", 3.9, R.drawable.whatsapp));
        apps.add(new App("Steam", "Juegos", 5.0, R.drawable.steam));
        apps.add(new App("Nvidia App", "Juegos", 4.5, R.drawable.nvidia));
        apps.add(new App("Github", "Desarrollo", 4.9, R.drawable.github));
        apps.add(new App("NordVPN", "Internet", 4.5, R.drawable.nordvpn));

        adaptador = new Adaptador(this, apps);
        gridView.setAdapter(adaptador);

        gridView.setOnItemClickListener((adapterView, view, i, l) -> {
            App app = apps.get(i);

            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            View v = getLayoutInflater().inflate(R.layout.item_app, null);
            builder.setView(v);

            ImageView imageView = v.findViewById(R.id.imgFoto);
            imageView.setImageResource(app.getIcono());
            TextView nombre = v.findViewById(R.id.txtNombre);
            nombre.setText(app.getNombre());
            TextView categoria = v.findViewById(R.id.txtCategoria);
            categoria.setText(app.getCategoria());
            TextView valoracion = v.findViewById(R.id.txtValoracion);
            valoracion.setText(String.valueOf(app.getValoracion()));

            builder.create().show();
        });
    }
}