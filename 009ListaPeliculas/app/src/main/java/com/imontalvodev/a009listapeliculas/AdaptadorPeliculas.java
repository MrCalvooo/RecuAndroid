package com.imontalvodev.a009listapeliculas;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class AdaptadorPeliculas extends ArrayAdapter<Pelicula> {

    private Context context;
    private ArrayList<Pelicula> peliculas;


    static class ViewHolder {
        ImageView imgPeli;
        TextView txtTitulo;
        TextView txtDirector;
        TextView txtAnyo;
        TextView txtCalificacion;

    }
    public AdaptadorPeliculas(@NonNull Context context, int resource, ArrayList<Pelicula> peliculas) {
        super(context, 0, peliculas);
        this.peliculas = peliculas;
        this.context = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.item_pelicula, parent, false);
        }

        Pelicula pelicula = peliculas.get(position);

        TextView txtTitulo = convertView.findViewById(R.id.txtTitulo);
        TextView txtDirector = convertView.findViewById(R.id.txtDirector);
        TextView txtAnyo = convertView.findViewById(R.id.txtAnyo);
        TextView txtCalificacion = convertView.findViewById(R.id.txtCalificacion);
        ImageView imgvImagen = convertView.findViewById(R.id.imgvImagen);

        txtTitulo.setText(pelicula.getTitulo());
        txtDirector.setText(pelicula.getDirector());
        txtAnyo.setText(String.valueOf(pelicula.getAnyo()));
        txtCalificacion.setText(String.valueOf(pelicula.getCalificacion()));

        if (pelicula.getCalificacion() < 5){
            txtCalificacion.setTextColor(Color.rgb(255, 0, 0));
        }

        if (pelicula.getCalificacion() >= 5 && pelicula.getCalificacion() <= 7){
            txtCalificacion.setTextColor(Color.rgb(255, 165, 0));
        }

        if (pelicula.getCalificacion() > 7){
            txtCalificacion.setTextColor(Color.rgb(0, 255, 0));
        }

        imgvImagen.setImageResource(pelicula.getImagen());

        return convertView;
    }
}
