package com.imontalvodev.a005conversorunidades;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private EditText etValor;
    private Spinner spinner;
    private Button btn;
    private TextView tvResultado;
    private ArrayAdapter<CharSequence> arrayAdapter;

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

        etValor = findViewById(R.id.etValor);
        spinner = findViewById(R.id.spinnerConversion);
        btn = findViewById(R.id.btnConvertir);
        tvResultado = findViewById(R.id.txtResultado);

        // Vincular Spinner con ArrayAdapter
        arrayAdapter = ArrayAdapter.createFromResource(this, R.array.conversiones, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item);
        arrayAdapter.setDropDownViewResource(androidx.appcompat.R.layout.support_simple_spinner_dropdown_item);
        spinner.setAdapter(arrayAdapter);

        btn.setOnClickListener(view -> {
            double valor = Double.parseDouble(etValor.getText().toString());
            int item = spinner.getSelectedItemPosition();

            switch (item) {
                case 0:
                    tvResultado.setText("Resultado: " + convertirKmMillas(valor) + " millas");
                    break;
                case 1:
                    tvResultado.setText("Resultado: " + convertirMillasKm(valor) + " km");
                    break;
                case 2:
                    tvResultado.setText("Resultado: " + convertirCelsiusFahrenheit(valor) + " °F");
                    break;
                case 3:
                    tvResultado.setText("Resultado: " + convertirFahrenheitCelsius(valor) + " °C");
                    break;
            }
        });
    }

    private static double convertirKmMillas(double valor){
        return valor * 0.621371;
    }

    private static double convertirMillasKm(double valor) {
        return valor * 1.60934;
    }

    private static double convertirCelsiusFahrenheit(double valor){
        return (valor * 9/5) + 32;
    }

    private static double convertirFahrenheitCelsius(double valor){
        return (valor - 32) * 5/9;
    }
}