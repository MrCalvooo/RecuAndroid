package com.imontalvodev.a014carritocompra;

import android.app.AlertDialog;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class AdaptadorProducto extends ArrayAdapter<Producto> {
    private ArrayList<Producto> productos;
    private Context context;


    public AdaptadorProducto(@NonNull Context context, ArrayList<Producto> productos) {
        super(context, 0, productos);
        this.context = context;
        this.productos = productos;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Producto producto = productos.get(position);
        if (convertView == null) {
            convertView = View.inflate(context, R.layout.item_producto, null);
        }

        TextView txtNombre = convertView.findViewById(R.id.txtNombre);
        TextView txtPrecio = convertView.findViewById(R.id.txtPrecio);
        TextView txtCantidad = convertView.findViewById(R.id.txtCantidad);
        ImageView imageView = convertView.findViewById(R.id.imgProducto);
        Button btnMenos = convertView.findViewById(R.id.btnMenos);
        Button btnMas = convertView.findViewById(R.id.btnMas);
        Button btnEliminar = convertView.findViewById(R.id.btnEliminar);

        txtNombre.setText(producto.getNombre());
        txtPrecio.setText(String.valueOf(producto.getPrecio()));
        txtCantidad.setText(String.valueOf(producto.getCantidad()));
        imageView.setImageResource(producto.getImagen());

        btnMenos.setOnClickListener(view -> {
            if (producto.getCantidad() > 1) {
                producto.setCantidad(producto.getCantidad() - 1);
                txtCantidad.setText(String.valueOf(producto.getCantidad()));
                notifyDataSetChanged();
            } else {
                AlertDialog.Builder builder = new AlertDialog.Builder(context)
                        .setTitle("Desea eliminar producto?")
                        .setPositiveButton("Si", (dialogInterface, i) -> {
                            productos.remove(producto);
                            notifyDataSetChanged();
                        })
                        .setNegativeButton("No", null);
                builder.show();
            }
        });

        btnMas.setOnClickListener(view -> {
            producto.setCantidad(producto.getCantidad() + 1);
            txtCantidad.setText(String.valueOf(producto.getCantidad()));
            notifyDataSetChanged();
        });

        btnEliminar.setOnClickListener(view -> {
            AlertDialog.Builder builder = new AlertDialog.Builder(context)
                    .setTitle("Desea eliminar producto?")
                    .setPositiveButton("Si", (dialogInterface, i) -> {
                        productos.remove(producto);
                        notifyDataSetChanged();
                    })
                    .setNegativeButton("No", null);
            builder.show();
        });

        return convertView;
    }
}
