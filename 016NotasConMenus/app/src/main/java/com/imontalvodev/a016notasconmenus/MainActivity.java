package com.imontalvodev.a016notasconmenus;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.PopupMenu;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.time.LocalDate;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView lvNotas;
    private ArrayList<Nota> notas;
    private AdaptadorNotas adaptadorNotas;


    @RequiresApi(api = Build.VERSION_CODES.O)
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

        lvNotas = findViewById(R.id.lvNotas);

        notas = new ArrayList<>();
        notas.add(new Nota("Nota 1", "Contenido 1", LocalDate.now().toString(), false));
        notas.add(new Nota("Nota 2", "Contenido 2", LocalDate.now().toString(), true));

        adaptadorNotas = new AdaptadorNotas(this, notas);
        lvNotas.setAdapter(adaptadorNotas);

        registerForContextMenu(lvNotas);

        lvNotas.setOnItemClickListener((adapterView, view, i, l) -> {
            mostrarPopupMenu(view, i);
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.option_menu, menu);
        return true;
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.itemNuevaNota) {
            View view = getLayoutInflater().inflate(R.layout.nota_nueva, null);
            AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this)
                    .setView(view)
                    .setPositiveButton("Guardar", (dialogInterface, i) -> {
                        EditText etTituloNuevo = view.findViewById(R.id.etTituloNuevo);
                        EditText etContenidoNuevo = view.findViewById(R.id.etContenidoNuevo);
                        CheckBox ckFavNueva = view.findViewById(R.id.ckFavNueva);

                        notas.add(new Nota(etTituloNuevo.getText().toString(), etContenidoNuevo.getText().toString(), LocalDate.now().toString(), ckFavNueva.isChecked()));
                        adaptadorNotas.notifyDataSetChanged();
                    });
            builder.show();
        }

        if (id == R.id.itemBuscar) {

        }

        if (id == R.id.itemEstadisticas) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this)
                    .setTitle("Estadisticas")
                    .setMessage("Numero de notas: " + notas.size() + "\nNumero de notas favoritas: " + notas.stream().filter(Nota::isFavorita).count())
                    .setPositiveButton("Aceptar", null);
            builder.show();
        }

        return true;
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        getMenuInflater().inflate(R.menu.context_menu, menu);
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        AdapterView.AdapterContextMenuInfo info = (AdapterView.AdapterContextMenuInfo) item.getMenuInfo();
        int id = item.getItemId();
        assert info != null;
        int position = info.position;

        if (id == R.id.itemEditar) {
            View view = getLayoutInflater().inflate(R.layout.editar_nota, null);

            EditText etTituloEditado = view.findViewById(R.id.etTituloEditado);
            EditText etContenidoEditado = view.findViewById(R.id.etContenidoEditado);
            CheckBox ckFavEdit = view.findViewById(R.id.ckFavEdit);

            AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this)
                    .setView(view)
                    .setTitle("Editar nota")
                    .setPositiveButton("Guardar", (dialogInterface, i) -> {
                        Nota nota = notas.get(position);

                        nota.setTitulo(etTituloEditado.getText().toString());
                        nota.setContenido(etContenidoEditado.getText().toString());
                        nota.setFavorita(ckFavEdit.isChecked());
                        nota.setFecha(LocalDate.now().toString());

                        adaptadorNotas.notifyDataSetChanged();
                        Toast.makeText(this, "Nota editada", Toast.LENGTH_LONG).show();
                    })
                    .setNegativeButton("Cancelar", null);
            builder.show();
        }

        if (id == R.id.itemEliminar) {
            AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this)
                    .setTitle("Eliminar nota")
                    .setMessage("¿Deseas eliminar la nota?")
                    .setPositiveButton("Si", (dialogInterface, i) -> notas.remove(position))
                    .setNegativeButton("No", null);
            builder.show();
        }

        if (id == R.id.itemCompartir) {
            String titulo = notas.get(position).getTitulo();
            String contenido = notas.get(position).getContenido();
            compartirNota(titulo, contenido);
        }

        return true;
    }

    private void compartirNota(String titulo, String contenido) {
        String texto = titulo + "\n\n" + contenido;

        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_SUBJECT, titulo);
        intent.putExtra(Intent.EXTRA_TEXT, texto);

        startActivity(Intent.createChooser(intent, "Compartir vía"));
    }

    private void mostrarPopupMenu(View view, int index) {
        PopupMenu popup = new PopupMenu(this, view);
        popup.getMenuInflater().inflate(R.menu.menu_popup, popup.getMenu());

        popup.setOnMenuItemClickListener(item -> {
            if (item.getItemId() == R.id.itemDuplicar) {
                notas.add(index, notas.get(index));
                adaptadorNotas.notifyDataSetChanged();
                return true;
            }

            if (item.getItemId() == R.id.itemColor) {
                Toast.makeText(this, "Cambiar color", Toast.LENGTH_LONG).show();
                return true;
            }

            return false;
        });

        popup.show();
    }
}