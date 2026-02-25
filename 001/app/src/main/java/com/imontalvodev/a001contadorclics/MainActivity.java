package com.imontalvodev.a001contadorclics;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private TextView tvClicks;
    private Button btnClick, btnResetear;
    private int contador = 1;

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

        tvClicks = findViewById(R.id.tvClick);
        btnClick = findViewById(R.id.btnAumentarClick);
        btnResetear = findViewById(R.id.btnResetear);

        btnClick.setOnClickListener(view -> {
            tvClicks.setText("Numero de clicks " + contador++);
        });

        btnResetear.setOnClickListener(view -> {
            contador = 0;
            tvClicks.setText("Numero de clicks: " + contador);
        });
    }
}