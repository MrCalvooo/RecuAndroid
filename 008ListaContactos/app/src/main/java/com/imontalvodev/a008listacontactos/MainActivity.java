package com.imontalvodev.a008listacontactos;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Button btnAgregar;
    private ListView lvContactos;
    private ArrayAdapter<Contacto> arrayAdapter;
    private ArrayList<Contacto> contactos;

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

        btnAgregar = findViewById(R.id.btnAgregar);
        lvContactos = findViewById(R.id.lvContactos);

        contactos = new ArrayList<>();
        arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, contactos);
        lvContactos.setAdapter(arrayAdapter);

        btnAgregar.setOnClickListener(view -> {

            View v = getLayoutInflater().inflate(R.layout.add_contact, null);

            AlertDialog.Builder builder = new AlertDialog.Builder(this)
                    .setTitle("Agregar contacto")
                    .setView(v)
                    .setPositiveButton("Agregar", (dialogInterface, i) -> {
                        EditText etNombre, etTelefono;
                        etNombre = v.findViewById(R.id.etNombre);
                        etTelefono = v.findViewById(R.id.etTelefono);

                        String nombre = etNombre.getText().toString();
                        String telefono = etTelefono.getText().toString();

                        if (nombre.isEmpty() || telefono.isEmpty()) {
                            Toast.makeText(this, "Los campos no pueden estar vacíos", Toast.LENGTH_SHORT).show();
                            return;
                        }

                        contactos.add(new Contacto(nombre, telefono));
                        arrayAdapter.notifyDataSetChanged();
                    })
                    .setNegativeButton("Cancelar", null);
            builder.show();
        });

        lvContactos.setOnItemClickListener((adapterView, view, i, l) -> {
            Contacto contacto = contactos.get(i);

        });
    }
}