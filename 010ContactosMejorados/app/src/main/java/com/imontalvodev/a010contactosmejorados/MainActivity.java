package com.imontalvodev.a010contactosmejorados;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
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
    private ArrayList<Contacto> contactos;
    private AdaptadorContacto adaptadorContacto;

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
        adaptadorContacto = new AdaptadorContacto(this, contactos);
        lvContactos.setAdapter(adaptadorContacto);

        btnAgregar.setOnClickListener(view -> {

            View v = getLayoutInflater().inflate(R.layout.add_contact, null);

            AlertDialog.Builder builder = new AlertDialog.Builder(this)
                    .setTitle("Agregar contacto")
                    .setView(v);

            EditText etNombre, etTelefono, etEmail;
            etNombre = v.findViewById(R.id.etNombre);
            etTelefono = v.findViewById(R.id.etTelefono);
            etEmail = v.findViewById(R.id.etEmail);

            builder.setPositiveButton("Agregar", (dialogInterface, i) -> {
                        String nombre = etNombre.getText().toString();
                        String telefono = etTelefono.getText().toString();
                        String email = etEmail.getText().toString();
                        int imagen = R.drawable.contacto;

                        if (nombre.isEmpty() || telefono.isEmpty()) {
                            Toast.makeText(this, "Los campos no pueden estar vacíos", Toast.LENGTH_SHORT).show();
                            return;
                        }

                        contactos.add(new Contacto(nombre, telefono, email, imagen));
                        adaptadorContacto.notifyDataSetChanged();
                    })
                    .setNegativeButton("Cancelar", null);
            builder.show();
        });

        lvContactos.setOnItemClickListener((adapterView, view, i, l) -> {
            Contacto contacto = contactos.get(i);

        });
    }
}