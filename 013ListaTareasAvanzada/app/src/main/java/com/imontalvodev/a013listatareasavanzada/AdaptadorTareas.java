package com.imontalvodev.a013listatareasavanzada;

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

public class AdaptadorTareas extends ArrayAdapter<Tarea> {
    private Context context;
    private ArrayList<Tarea> tareas;

    public AdaptadorTareas(@NonNull Context context, ArrayList<Tarea> tareas) {
        super(context, 0, tareas);
        this.context = context;
        this.tareas = tareas;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Tarea tarea = tareas.get(position);
        if (convertView == null) {
            convertView = View.inflate(context, R.layout.item_tarea, null);
        }

        TextView nombre = convertView.findViewById(R.id.txtNombreTarea);
        CheckBox checkBox = convertView.findViewById(R.id.chkbTarea);

        nombre.setText(tarea.getNombre());
        checkBox.setChecked(tarea.isCompletada());

        checkBox.setOnCheckedChangeListener(null);
        checkBox.setOnCheckedChangeListener((compoundButton, b) -> {
            tarea.setCompletada(b);
            if (context instanceof MainActivity) {
                ((MainActivity) context).actualizarContador();
            }
        });

        return convertView;
    }
}
