package com.imontalvodev.a020agendacitas;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class NuevaCitaActivity extends AppCompatActivity {

    private EditText etNombreCita;
    private Button btnFecha, btnHora, btnGuardar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_nueva_cita);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.nuevaCita), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        etNombreCita = findViewById(R.id.etNombreCita);
        btnFecha = findViewById(R.id.btnFecha);
        btnHora = findViewById(R.id.btnHora);
        btnGuardar = findViewById(R.id.btnGuardar);

        int dia = 0, mes = 0, anyo = 0;

        btnFecha.setOnClickListener(view -> {
            DatePickerDialog datePickerDialog = new DatePickerDialog(this, (datePicker, i, i1, i2) -> {
                anyo = i;
                mes = i1;
                dia = i2;

            }, dia, mes, anyo);
            datePickerDialog.show();
        });
    }
}