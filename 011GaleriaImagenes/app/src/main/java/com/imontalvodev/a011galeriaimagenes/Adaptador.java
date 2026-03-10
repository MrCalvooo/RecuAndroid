package com.imontalvodev.a011galeriaimagenes;

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

public class Adaptador extends ArrayAdapter<Imagen> {
    private ArrayList<Imagen> imagenes;
    private Context context;

    static class ViewHolder {
        ImageView imgFoto;
        TextView txttitulo;
    }

    public Adaptador(@NonNull Context context, ArrayList<Imagen> imagenes) {
        super(context, 0, imagenes);
        this.imagenes = imagenes;
        this.context = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.item_imagen, parent, false);
        }

        ViewHolder viewHolder = new ViewHolder();
        viewHolder.imgFoto = convertView.findViewById(R.id.imgFoto);
        viewHolder.txttitulo = convertView.findViewById(R.id.txtTitulo);

        convertView.setTag(viewHolder);

        Imagen imagen = imagenes.get(position);
        viewHolder.imgFoto.setImageResource(imagen.getRecurso());
        viewHolder.txttitulo.setText(imagen.getTitulo());

        return convertView;
    }
}
