package com.imontalvodev.a007todolist;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private TextView txtContador;
    private EditText etTarea;
    private Button btnAgregar, btnLimpiar;
    private ListView lvTareas;
    private ArrayList<String> tareas;
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

        txtContador = findViewById(R.id.txtContador);
        etTarea = findViewById(R.id.etTarea);
        btnAgregar = findViewById(R.id.btnAgregar);
        btnLimpiar = findViewById(R.id.btnLimpiar);
        lvTareas = findViewById(R.id.listViewTareas);

        tareas = new ArrayList<>();

        arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, tareas);
        lvTareas.setAdapter(arrayAdapter);

        btnAgregar.setOnClickListener(view -> {
            String tarea = etTarea.getText().toString();
            tareas.add(tarea);
            arrayAdapter.notifyDataSetChanged();
            etTarea.setText("");
            actualizarContador();
        });

        btnLimpiar.setOnClickListener(view -> {

            if (tareas.isEmpty()) {
                Toast.makeText(MainActivity.this, "No hay tareas para limpiar", Toast.LENGTH_LONG).show();
                return;
            }

            AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this)
                    .setTitle("Deseas limpiar todas las tareas?");
            builder.setPositiveButton("Si", (dialogInterface, i) -> {
                tareas.clear();
                arrayAdapter.notifyDataSetChanged();
                actualizarContador();
            });
            builder.setNegativeButton("No", null);
            builder.show();
        });

        lvTareas.setOnItemClickListener((adapterView, view, i, l) -> {
            Toast.makeText(MainActivity.this, "Tarea seleccionada: " + tareas.get(i), Toast.LENGTH_LONG).show();
        });

        lvTareas.setOnItemLongClickListener((adapterView, view, i, l) -> {
            AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this)
                    .setTitle("Eliminar tarea")
                    .setMessage("¿Deseas eliminar la tarea?")
                    .setPositiveButton("Si", (dialogInterface, i1) -> {
                        tareas.remove(i);
                        arrayAdapter.notifyDataSetChanged();
                        actualizarContador();
                        Toast.makeText(MainActivity.this, "Tarea eliminada correctamente", Toast.LENGTH_LONG).show();
                    })
                    .setNegativeButton("No", null);
            builder.show();
            return true;
        });
    }

    private void actualizarContador() {
        int contador = tareas.size();
        txtContador.setText("Tareas: " + contador);
    }
}