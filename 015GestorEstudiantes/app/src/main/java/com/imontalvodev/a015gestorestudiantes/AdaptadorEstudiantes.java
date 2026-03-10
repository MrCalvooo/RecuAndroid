package com.imontalvodev.a015gestorestudiantes;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class AdaptadorEstudiantes extends ArrayAdapter<Estudiante> {
    private Context context;
    private ArrayList<Estudiante> estudiantes;

    public AdaptadorEstudiantes(@NonNull Context context, @NonNull ArrayList<Estudiante> estudiantes) {
        super(context, 0, estudiantes);
        this.context = context;
        this.estudiantes = estudiantes;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Estudiante estudiante = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_estudiante, parent, false);
        }

        TextView txtNombre = convertView.findViewById(R.id.txtNombre);
        TextView txtInfo = convertView.findViewById(R.id.txtInfo);
        TextView txtRepite = convertView.findViewById(R.id.txtRepite);

        if (estudiante != null) {
            txtNombre.setText(estudiante.getNombre());

            String info = estudiante.getGrado() + " • " + estudiante.getEdad() + " años • " + estudiante.getGenero();
            txtInfo.setText(info);

            if (estudiante.isRepite()) {
                txtRepite.setText("Repetidor");
                txtRepite.setVisibility(View.VISIBLE);
            } else {
                txtRepite.setVisibility(View.GONE);
            }
        }

        return convertView;
    }
}
