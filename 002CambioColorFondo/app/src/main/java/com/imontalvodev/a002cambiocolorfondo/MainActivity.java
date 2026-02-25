package com.imontalvodev.a002cambiocolorfondo;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private Button btnRojo, btnVerde, btnAzul, btnRandom;
    private LinearLayout linearLayout;

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

        linearLayout = findViewById(R.id.main);
        btnAzul = findViewById(R.id.btnAzul);
        btnRojo = findViewById(R.id.btnRojo);
        btnVerde = findViewById(R.id.btnVerde);
        btnRandom = findViewById(R.id.btnRandom);

        btnAzul.setOnClickListener(view -> linearLayout.setBackgroundColor(Color.rgb(0, 0, 255)));
        btnRojo.setOnClickListener(view -> linearLayout.setBackgroundColor(Color.rgb(255, 0, 0)));
        btnVerde.setOnClickListener(view -> linearLayout.setBackgroundColor(Color.rgb(0, 255, 0)));
        btnRandom.setOnClickListener(view -> linearLayout.setBackgroundColor(Color.rgb(randomColor()[0], randomColor()[1], randomColor()[2])));
    }

    private int[] randomColor() {
        int r = (int) (Math.random() * 255);
        int g = (int) (Math.random() * 255);
        int b = (int) (Math.random() * 255);
        return new int[]{r, g, b};
    }
}