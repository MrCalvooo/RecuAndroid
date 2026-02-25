package com.imontalvodev.a003formularioregistro;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private EditText etNombre, etEmail, etEdad;
    private RadioGroup radioGroup;
    private CheckBox ckTerminos;
    private Button btn;

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

        etNombre = findViewById(R.id.etNombre);
        etEmail = findViewById(R.id.etEmail);
        etEdad = findViewById(R.id.etEdad);
        radioGroup = findViewById(R.id.rgGenero);
        ckTerminos = findViewById(R.id.cbTerminos);
        btn = findViewById(R.id.btnRegistrar);

        btn.setOnClickListener(view -> {
            boolean valido = true;
            if (!validarDatos(etNombre)) {
                Toast.makeText(this, "El nombre es obligatorio", Toast.LENGTH_SHORT).show();
                valido = false;
            }

            if (!validarDatos(etEdad)){
                Toast.makeText(this, "La edad es obligatoria", Toast.LENGTH_SHORT).show();
                valido = false;
            }

            int ed = Integer.parseInt(etEdad.getText().toString());
            if (ed < 18 || ed > 100) {
                Toast.makeText(this, "Debes tener entre 18 y 100 años", Toast.LENGTH_SHORT).show();
                valido = false;
            }

            if (!validarDatos(etEmail) || !etEmail.getText().toString().contains("@")){
                Toast.makeText(this, "El email es obligatorio", Toast.LENGTH_SHORT).show();
                valido = false;
            }

            if (radioGroup.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "Seleccione un genero por favor", Toast.LENGTH_SHORT).show();
                valido = false;
            }

            if (!ckTerminos.isChecked()) {
                Toast.makeText(this, "Acepte los terminos y condiciones", Toast.LENGTH_SHORT).show();
                valido = false;
            }

            if (valido) {
                String nombre = etNombre.getText().toString();
                String edad = etEdad.getText().toString();
                String genero = "";
                int generoId = radioGroup.getCheckedRadioButtonId();

                switch (generoId) {
                    case 1:
                        genero = "Masculino";
                        break;
                    case 2:
                        genero = "Femenino";
                        break;
                    case 3:
                        genero = "Otro";
                }

                Toast.makeText(this, String.format("Bienvenido %s, %s años, %s", nombre, edad, genero), Toast.LENGTH_LONG).show();
            }
        });
    }

    private boolean validarDatos(EditText et){
        return !et.getText().toString().isEmpty();
    }
}