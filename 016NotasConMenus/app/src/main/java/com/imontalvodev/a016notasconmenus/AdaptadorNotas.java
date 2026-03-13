package com.imontalvodev.a016notasconmenus;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class AdaptadorNotas extends ArrayAdapter<Nota> {
    private Context context;
    private ArrayList<Nota> arrayList;

    public AdaptadorNotas(@NonNull Context context, @NonNull ArrayList<Nota> objects) {
        super(context, 0, objects);
        this.context = context;
        this.arrayList = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Nota nota = arrayList.get(position);
        if (convertView == null) {
            convertView = View.inflate(context, R.layout.item_nota, null);
        }

        TextView txtTitulo = convertView.findViewById(R.id.txtTitulo);
        TextView txtContenido = convertView.findViewById(R.id.txtContenido);
        TextView txtFecha = convertView.findViewById(R.id.txtFecha);
        CheckBox ckFav = convertView.findViewById(R.id.ckFav);

        txtTitulo.setText(nota.getTitulo());
        txtContenido.setText(nota.getContenido());
        txtFecha.setText(nota.getFecha());
        ckFav.setChecked(nota.isFavorita());

        return convertView;
    }
}
