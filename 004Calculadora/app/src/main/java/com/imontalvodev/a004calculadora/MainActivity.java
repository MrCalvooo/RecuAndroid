package com.imontalvodev.a004calculadora;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private EditText etNum1, etNum2;
    private Button btnSuma, btnResta, btnMultiplicar, btnDividir;
    private TextView tvResultado;

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

        etNum1 = findViewById(R.id.etNumero1);
        etNum2 = findViewById(R.id.etNumero2);
        btnSuma = findViewById(R.id.btnSumar);
        btnResta = findViewById(R.id.btnRestar);
        btnMultiplicar = findViewById(R.id.btnMultiplicar);
        btnDividir = findViewById(R.id.btnDividir);
        tvResultado = findViewById(R.id.txtResultado);

        btnSuma.setOnClickListener(view -> {
            double num1 = Double.parseDouble(etNum1.getText().toString());
            double num2 = Double.parseDouble(etNum2.getText().toString());
            double resultado = num1 + num2;
            tvResultado.setText("Resultado: " + resultado);
        });

        btnResta.setOnClickListener(view -> {
            double num1 = Double.parseDouble(etNum1.getText().toString());
            double num2 = Double.parseDouble(etNum2.getText().toString());
            double resultado = num1 - num2;
            tvResultado.setText("Resultado: " + resultado);
        });

        btnMultiplicar.setOnClickListener(view -> {
            double num1 = Double.parseDouble(etNum1.getText().toString());
            double num2 = Double.parseDouble(etNum2.getText().toString());
            double resultado = num1 * num2;
            tvResultado.setText("Resultado: " + resultado);
        });

        btnDividir.setOnClickListener(view -> {
            double num1 = Double.parseDouble(etNum1.getText().toString());
            double num2 = Double.parseDouble(etNum2.getText().toString());

            if (num2 == 0.) {
                Toast.makeText(this, "No se puede dividir entre cero", Toast.LENGTH_SHORT).show();
            } else {
                double resultado = num1 / num2;
                tvResultado.setText("Resultado: " + resultado);
            }
        });
    }
}