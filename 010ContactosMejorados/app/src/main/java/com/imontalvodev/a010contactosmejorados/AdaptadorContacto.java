package com.imontalvodev.a010contactosmejorados;

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

public class AdaptadorContacto extends ArrayAdapter<Contacto> {

    private ArrayList<Contacto> contactos;
    private Context context;

    // ViewHolder
    static class ViewHolder {
        ImageView imgvFoto;
        TextView txtNombre;
        TextView txtTelefono;
        TextView txtEmail;
    }

    public AdaptadorContacto(@NonNull Context context, ArrayList<Contacto> contactos) {
        super(context, 0, contactos); // ← CORREGIDO: pasar contactos
        this.contactos = contactos;
        this.context = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ViewHolder holder;

        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.item_contacto, parent, false);

            holder = new ViewHolder();
            holder.imgvFoto = convertView.findViewById(R.id.imgvFoto);
            holder.txtNombre = convertView.findViewById(R.id.txtNombre);
            holder.txtTelefono = convertView.findViewById(R.id.txtTelefono);
            holder.txtEmail = convertView.findViewById(R.id.txtEmail);

            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        Contacto contacto = contactos.get(position);

        holder.imgvFoto.setImageResource(contacto.getImagen());
        holder.txtNombre.setText(contacto.getNombre());
        holder.txtTelefono.setText("📱 " + contacto.getTelefono());
        holder.txtEmail.setText("📧 " + contacto.getEmail());

        return convertView;
    }
}