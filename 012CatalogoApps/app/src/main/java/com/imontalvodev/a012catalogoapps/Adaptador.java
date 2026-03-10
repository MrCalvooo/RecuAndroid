package com.imontalvodev.a012catalogoapps;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class Adaptador extends ArrayAdapter<App> {
    private Context context;
    private ArrayList<App> apps;
    private TextView txtNombre, txtValoracion, txtCategoria;
    private ImageView img;

    public Adaptador(@NonNull Context context, ArrayList<App> apps) {
        super(context, 0, apps);
        this.apps = apps;
        this.context = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.item_app, parent, false);
        }

        img = convertView.findViewById(R.id.imgFoto);
        txtNombre = convertView.findViewById(R.id.txtNombre);
        txtCategoria = convertView.findViewById(R.id.txtCategoria);
        txtValoracion = convertView.findViewById(R.id.txtValoracion);

        App app = apps.get(position);
        txtNombre.setText(app.getNombre());
        txtCategoria.setText(app.getCategoria());
        txtValoracion.setText(String.valueOf(app.getValoracion()));
        img.setImageResource(app.getIcono());

        return convertView;

    }
}
