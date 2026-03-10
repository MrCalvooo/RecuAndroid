package com.imontalvodev.a014carritocompra;

import android.os.Bundle;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView lv;
    private ArrayList<Producto> productos;
    private AdaptadorProducto adaptadorProducto;

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

        lv = findViewById(R.id.lvProductos);
        productos = new ArrayList<>();
        productos.add(new Producto("Platano", 1.50, 1, R.drawable.platanos));
        productos.add(new Producto("Manzana", 1.99, 1, R.drawable.manzanas));
        adaptadorProducto = new AdaptadorProducto(this, productos);
        lv.setAdapter(adaptadorProducto);
    }
}