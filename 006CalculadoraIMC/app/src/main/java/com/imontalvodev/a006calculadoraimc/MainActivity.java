package com.imontalvodev.a006calculadoraimc;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private EditText etPeso, etAltura;
    private TextView txtIMC, txtCategoria;
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

        etAltura = findViewById(R.id.etAltura);
        etPeso = findViewById(R.id.etPeso);
        txtCategoria = findViewById(R.id.txtCategoria);
        txtIMC = findViewById(R.id.txtIMC);
        btn = findViewById(R.id.btnCalcular);
        String texto = txtCategoria.getText().toString();

        btn.setOnClickListener(view -> {
            txtCategoria.setText("Categoría: ");
            double peso = Double.parseDouble(etPeso.getText().toString());
            double altura = conversionAltura(etAltura.getText().toString());
            double imc = calcularIMC(peso, altura);

            txtIMC.setText(String.format(txtIMC.getText().toString() + "%.2f", imc));
            if (imc < 18.5) {
                txtCategoria.setText(texto + " Bajo peso");
            } else if (imc >= 18.5 && imc < 25) {
                txtCategoria.setText(texto + " Normal");
            } else if (imc >= 25 && imc < 30) {
                txtCategoria.setText(texto + " Sobrepeso");
            } else {
                txtCategoria.setText(texto + " Obesidad");
            }
        });
    }

    private double conversionAltura(String altura) {
        return Double.parseDouble(altura) / 100;
    }

    private double calcularIMC(double peso, double altura) {
        return peso / (altura * altura);
    }
}