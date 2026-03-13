package com.imontalvodev.a017contactosmenu;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView lvContactos;
    private ArrayList<String> contactos;
    private ArrayAdapter<String> arrayAdapter;

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

        lvContactos = findViewById(R.id.lvContactos);
        contactos = new ArrayList<>();
        contactos.add("Juan");
        contactos.add("Pedro");
        arrayAdapter = new ArrayAdapter<>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, contactos);
        lvContactos.setAdapter(arrayAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.options_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.itemNuevoContacto) {
            View view = getLayoutInflater().inflate(R.layout.nuevo_contacto, null);
            AlertDialog.Builder builder = new AlertDialog.Builder(this)
                    .setView(view)
                    .setTitle("Registrar nuevo contacto")
                    .setPositiveButton("Guardar", (dialogInterface, i) -> {
                        EditText et = view.findViewById(R.id.etNuevoContacto);
                        String contacto = et.getText().toString();
                        contactos.add(contacto);
                        arrayAdapter.notifyDataSetChanged();
                    })
                    .setNegativeButton("Cancelar", null);
            builder.show();
        }

        if (item.getItemId() == R.id.itemBuscar) {

        }

        if (item.getItemId() == R.id.itemOrdenar) {

        }

        return true;
    }
}