package com.imontalvodev.a015gestorestudiantes;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    private EditText etNombre, etEdad, etBuscar;
    private TextView txtEstadisticas;
    private Spinner spinnerGrado, spinnerFiltroGrado;
    private RadioGroup rgGenero;
    private CheckBox cbRepite, cbSoloRepetidores;
    private ListView lvEstudiantes;
    private Button btnAgregar, btnLimpiar, btnExportar;

    private ArrayList<Estudiante> estudiantesTodos;
    private ArrayList<Estudiante> estudiantesFiltrados;
    private AdaptadorEstudiantes adaptadorEstudiantes;
    private ArrayAdapter<String> arrayAdapterGrados;

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

        // Inicializar vistas
        etNombre = findViewById(R.id.etNombre);
        etEdad = findViewById(R.id.etEdad);
        spinnerGrado = findViewById(R.id.spinnerGrado);
        rgGenero = findViewById(R.id.rgGenero);
        cbRepite = findViewById(R.id.cbRepite);
        etBuscar = findViewById(R.id.etBuscar);
        spinnerFiltroGrado = findViewById(R.id.spinnerFiltroGrado);
        cbSoloRepetidores = findViewById(R.id.cbSoloRepetidores);
        txtEstadisticas = findViewById(R.id.txtEstadisticas);
        lvEstudiantes = findViewById(R.id.lvEstudiantes);
        btnAgregar = findViewById(R.id.btnAgregar);
        btnLimpiar = findViewById(R.id.btnLimpiar);
        btnExportar = findViewById(R.id.btnExportar);

        // Configurar Spinner de grados
        String[] grados = {"1º ESO", "2º ESO", "3º ESO", "4º ESO", "1º Bach", "2º Bach"};
        arrayAdapterGrados = new ArrayAdapter<>(
                this,
                android.R.layout.simple_spinner_dropdown_item,
                grados
        );
        spinnerGrado.setAdapter(arrayAdapterGrados);

        // Configurar Spinner de filtro
        String[] gradosFiltro = {"Todos", "1º ESO", "2º ESO", "3º ESO", "4º ESO", "1º Bach", "2º Bach"};
        ArrayAdapter<String> adapterFiltro = new ArrayAdapter<>(
                this,
                android.R.layout.simple_spinner_dropdown_item,
                gradosFiltro
        );
        spinnerFiltroGrado.setAdapter(adapterFiltro);

        // Inicializar listas
        estudiantesTodos = new ArrayList<>();
        estudiantesFiltrados = new ArrayList<>();

        // Datos de ejemplo
        estudiantesTodos.add(new Estudiante("Paco García", 16, "1º ESO", "Masculino", false));
        estudiantesTodos.add(new Estudiante("Ana López", 17, "2º ESO", "Femenino", true));
        estudiantesTodos.add(new Estudiante("Juan Pérez", 18, "3º ESO", "Masculino", false));

        // Copiar todos a filtrados inicialmente
        estudiantesFiltrados.addAll(estudiantesTodos);

        // Configurar adaptador
        adaptadorEstudiantes = new AdaptadorEstudiantes(this, estudiantesFiltrados);
        lvEstudiantes.setAdapter(adaptadorEstudiantes);

        // Configurar listeners
        configurarListeners();

        // Configurar filtros
        configurarFiltros();

        // Actualizar estadísticas iniciales
        actualizarEstadisticas();
    }

    private void configurarListeners() {
        // Botón Agregar
        btnAgregar.setOnClickListener(view -> {
            if (validarFormulario()) {
                agregarEstudiante();
            }
        });

        // Click normal en ListView
        lvEstudiantes.setOnItemClickListener((adapterView, view, position, id) -> {
            Estudiante estudiante = estudiantesFiltrados.get(position);
            mostrarInfoEstudiante(estudiante);
        });

        // Click largo en ListView
        lvEstudiantes.setOnItemLongClickListener((adapterView, view, position, id) -> {
            mostrarOpcionesEstudiante(position);
            return true;
        });

        // Botón Limpiar Todo
        btnLimpiar.setOnClickListener(view -> {
            if (estudiantesTodos.isEmpty()) {
                Toast.makeText(this, "No hay estudiantes", Toast.LENGTH_SHORT).show();
                return;
            }

            new AlertDialog.Builder(this)
                    .setTitle("¿Deseas eliminar todo?")
                    .setMessage("Se eliminarán todos los estudiantes y el formulario")
                    .setPositiveButton("Sí", (dialog, which) -> {
                        limpiarTodo();
                    })
                    .setNegativeButton("No", null)
                    .show();
        });

        // Botón Exportar
        btnExportar.setOnClickListener(view -> {
            if (estudiantesTodos.isEmpty()) {
                Toast.makeText(this, "No hay datos para exportar", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this,
                        "Exportando " + estudiantesTodos.size() + " estudiantes...",
                        Toast.LENGTH_LONG).show();
            }
        });
    }

    private void configurarFiltros() {
        // Filtro por búsqueda (nombre)
        etBuscar.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                aplicarFiltros();
            }

            @Override
            public void afterTextChanged(Editable s) {}
        });

        // Filtro por grado
        spinnerFiltroGrado.setOnItemSelectedListener(new android.widget.AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(android.widget.AdapterView<?> parent, View view, int position, long id) {
                aplicarFiltros();
            }

            @Override
            public void onNothingSelected(android.widget.AdapterView<?> parent) {}
        });

        // Filtro solo repetidores
        cbSoloRepetidores.setOnCheckedChangeListener((buttonView, isChecked) -> {
            aplicarFiltros();
        });
    }

    private void aplicarFiltros() {
        estudiantesFiltrados.clear();

        String busqueda = etBuscar.getText().toString().toLowerCase().trim();
        String gradoFiltro = spinnerFiltroGrado.getSelectedItem().toString();
        boolean soloRepetidores = cbSoloRepetidores.isChecked();

        for (Estudiante e : estudiantesTodos) {
            // Filtro por nombre
            if (!busqueda.isEmpty() && !e.getNombre().toLowerCase().contains(busqueda)) {
                continue;
            }

            // Filtro por grado
            if (!gradoFiltro.equals("Todos") && !e.getGrado().equals(gradoFiltro)) {
                continue;
            }

            // Filtro por repetidores
            if (soloRepetidores && !e.isRepite()) {
                continue;
            }

            // Pasó todos los filtros
            estudiantesFiltrados.add(e);
        }

        adaptadorEstudiantes.notifyDataSetChanged();
        actualizarEstadisticas();
    }

    private boolean validarFormulario() {
        String nombre = etNombre.getText().toString().trim();
        String edadStr = etEdad.getText().toString().trim();

        // Validar nombre
        if (nombre.isEmpty()) {
            etNombre.setError("Campo obligatorio");
            Toast.makeText(this, "El nombre es obligatorio", Toast.LENGTH_SHORT).show();
            return false;
        }

        // Validar edad
        if (edadStr.isEmpty()) {
            etEdad.setError("Campo obligatorio");
            Toast.makeText(this, "La edad es obligatoria", Toast.LENGTH_SHORT).show();
            return false;
        }

        int edad;
        try {
            edad = Integer.parseInt(edadStr);
        } catch (NumberFormatException e) {
            etEdad.setError("Debe ser un número");
            Toast.makeText(this, "Edad inválida", Toast.LENGTH_SHORT).show();
            return false;
        }

        if (edad < 16 || edad > 100) {
            etEdad.setError("Edad entre 16 y 100");
            Toast.makeText(this, "Edad fuera de rango (16-100)", Toast.LENGTH_SHORT).show();
            return false;
        }

        // Validar género
        if (rgGenero.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "Selecciona un género", Toast.LENGTH_SHORT).show();
            return false;
        }

        return true;
    }

    private void agregarEstudiante() {
        String nombre = etNombre.getText().toString().trim();
        int edad = Integer.parseInt(etEdad.getText().toString().trim());
        String grado = spinnerGrado.getSelectedItem().toString();

        String genero = "Otro";
        int selectedId = rgGenero.getCheckedRadioButtonId();
        if (selectedId == R.id.rbMasculino) {
            genero = "Masculino";
        } else if (selectedId == R.id.rbFemenino) {
            genero = "Femenino";
        }

        boolean repite = cbRepite.isChecked();

        // Crear y añadir estudiante
        Estudiante nuevoEstudiante = new Estudiante(nombre, edad, grado, genero, repite);
        estudiantesTodos.add(nuevoEstudiante);

        // Aplicar filtros para actualizar la lista visible
        aplicarFiltros();

        // Limpiar formulario
        limpiarFormulario();

        Toast.makeText(this, "Estudiante añadido: " + nombre, Toast.LENGTH_SHORT).show();
    }

    private void limpiarFormulario() {
        etNombre.setText("");
        etEdad.setText("");
        spinnerGrado.setSelection(0);
        rgGenero.clearCheck();
        cbRepite.setChecked(false);
    }

    private void limpiarTodo() {
        estudiantesTodos.clear();
        estudiantesFiltrados.clear();
        adaptadorEstudiantes.notifyDataSetChanged();
        limpiarFormulario();
        actualizarEstadisticas();
        Toast.makeText(this, "Todos los datos eliminados", Toast.LENGTH_SHORT).show();
    }

    private void mostrarInfoEstudiante(Estudiante estudiante) {
        String info = "Grado: " + estudiante.getGrado() + "\n" +
                "Edad: " + estudiante.getEdad() + " años\n" +
                "Género: " + estudiante.getGenero() + "\n" +
                "Repite: " + (estudiante.isRepite() ? "Sí" : "No");

        new AlertDialog.Builder(this)
                .setTitle("👤 " + estudiante.getNombre())
                .setMessage(info)
                .setPositiveButton("Cerrar", null)
                .show();
    }

    private void mostrarOpcionesEstudiante(int position) {
        String[] opciones = {"Editar", "Eliminar"};

        new AlertDialog.Builder(this)
                .setTitle("Opciones")
                .setItems(opciones, (dialog, which) -> {
                    if (which == 0) {
                        // Editar
                        // Buscar posición en estudiantesTodos
                        Estudiante estudiante = estudiantesFiltrados.get(position);
                        int posicionReal = estudiantesTodos.indexOf(estudiante);
                        mostrarDialogoEditar(posicionReal);
                    } else {
                        // Eliminar
                        Estudiante estudiante = estudiantesFiltrados.get(position);
                        int posicionReal = estudiantesTodos.indexOf(estudiante);
                        confirmarEliminar(posicionReal);
                    }
                })
                .show();
    }

    private void mostrarDialogoEditar(int position) {
        Estudiante estudiante = estudiantesTodos.get(position);

        View dialogView = LayoutInflater.from(this).inflate(R.layout.item_editar_estudiante, null);

        EditText etNombreNuevo = dialogView.findViewById(R.id.etNombreNuevo);
        EditText etEdadNueva = dialogView.findViewById(R.id.etEdadNueva);
        Spinner spinnerCurso = dialogView.findViewById(R.id.spinnerCurso);
        RadioGroup rgGeneroNuevo = dialogView.findViewById(R.id.rgGeneroNuevo);
        CheckBox cbRepiteNuevo = dialogView.findViewById(R.id.cbRepiteNuevo);

        // Establecer valores actuales
        etNombreNuevo.setText(estudiante.getNombre());
        etEdadNueva.setText(String.valueOf(estudiante.getEdad()));

        spinnerCurso.setAdapter(arrayAdapterGrados);
        spinnerCurso.setSelection(arrayAdapterGrados.getPosition(estudiante.getGrado()));

        if (estudiante.getGenero().equals("Masculino")) {
            rgGeneroNuevo.check(R.id.rbMasculinoNuevo);
        } else if (estudiante.getGenero().equals("Femenino")) {
            rgGeneroNuevo.check(R.id.rbFemeninoNuevo);
        } else {
            rgGeneroNuevo.check(R.id.rbOtroNuevo);
        }

        cbRepiteNuevo.setChecked(estudiante.isRepite());

        // Crear el diálogo
        AlertDialog dialog = new AlertDialog.Builder(this)
                .setTitle("Editar Estudiante")
                .setView(dialogView)
                .setPositiveButton("Guardar", null) // null para manejar manualmente
                .setNegativeButton("Cancelar", null)
                .create();

        dialog.show();

        // Manejar el botón Guardar manualmente para validar
        dialog.getButton(AlertDialog.BUTTON_POSITIVE).setOnClickListener(v -> {
            String nuevoNombre = etNombreNuevo.getText().toString().trim();
            String edadStr = etEdadNueva.getText().toString().trim();

            // Validar
            if (nuevoNombre.isEmpty()) {
                etNombreNuevo.setError("Campo obligatorio");
                Toast.makeText(this, "El nombre es obligatorio", Toast.LENGTH_SHORT).show();
                return;
            }

            if (edadStr.isEmpty()) {
                etEdadNueva.setError("Campo obligatorio");
                Toast.makeText(this, "La edad es obligatoria", Toast.LENGTH_SHORT).show();
                return;
            }

            int nuevaEdad;
            try {
                nuevaEdad = Integer.parseInt(edadStr);
                if (nuevaEdad < 16 || nuevaEdad > 100) {
                    etEdadNueva.setError("Edad entre 16 y 100");
                    Toast.makeText(this, "Edad fuera de rango", Toast.LENGTH_SHORT).show();
                    return;
                }
            } catch (NumberFormatException e) {
                etEdadNueva.setError("Edad inválida");
                Toast.makeText(this, "Edad inválida", Toast.LENGTH_SHORT).show();
                return;
            }

            String nuevoGrado = spinnerCurso.getSelectedItem().toString();

            String nuevoGenero = "Otro";
            int selectedId = rgGeneroNuevo.getCheckedRadioButtonId();
            if (selectedId == R.id.rbMasculinoNuevo) {
                nuevoGenero = "Masculino";
            } else if (selectedId == R.id.rbFemeninoNuevo) {
                nuevoGenero = "Femenino";
            }

            boolean nuevoRepite = cbRepiteNuevo.isChecked();

            // Guardar cambios
            estudiante.setNombre(nuevoNombre);
            estudiante.setEdad(nuevaEdad);
            estudiante.setGrado(nuevoGrado);
            estudiante.setGenero(nuevoGenero);
            estudiante.setRepite(nuevoRepite);

            aplicarFiltros(); // Actualizar lista
            Toast.makeText(this, "Estudiante actualizado", Toast.LENGTH_SHORT).show();
            dialog.dismiss();
        });
    }

    private void confirmarEliminar(int position) {
        Estudiante estudiante = estudiantesTodos.get(position);

        new AlertDialog.Builder(this)
                .setTitle("Eliminar estudiante")
                .setMessage("¿Eliminar a " + estudiante.getNombre() + "?")
                .setPositiveButton("Sí", (dialog, which) -> {
                    estudiantesTodos.remove(position);
                    aplicarFiltros(); // Actualizar lista filtrada
                    Toast.makeText(this, "Estudiante eliminado", Toast.LENGTH_SHORT).show();
                })
                .setNegativeButton("No", null)
                .show();
    }

    private void actualizarEstadisticas() {
        int total = estudiantesFiltrados.size();

        if (total == 0) {
            txtEstadisticas.setText("No hay estudiantes");
            return;
        }

        // Calcular edad media
        double sumaEdades = 0;
        int repetidores = 0;

        for (Estudiante e : estudiantesFiltrados) {
            sumaEdades += e.getEdad();
            if (e.isRepite()) repetidores++;
        }

        double edadMedia = sumaEdades / total;

        // Grado con más estudiantes
        Map<String, Integer> gradosCount = new HashMap<>();
        for (Estudiante e : estudiantesFiltrados) {
            String grado = e.getGrado();
            gradosCount.put(grado, gradosCount.getOrDefault(grado, 0) + 1);
        }

        String gradoMax = "";
        int maxCount = 0;
        for (Map.Entry<String, Integer> entry : gradosCount.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                gradoMax = entry.getKey();
            }
        }

        txtEstadisticas.setText(
                String.format("Total: %d | Edad media: %.1f | Repetidores: %d | Más: %s (%d)",
                        total, edadMedia, repetidores, gradoMax, maxCount)
        );
    }
}