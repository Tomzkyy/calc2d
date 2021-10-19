package com.example.kalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //Nama : Muhammad Ariq Pratama
    //Nim  : A11.2020.12944

    EditText x, y;
    Button btnPersegi, btnSegitiga, btnLingkaran;
    TextView large, around;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initComponent();
    }

    private void initComponent() {
        x = findViewById(R.id.x);
        y = findViewById(R.id.y);
        btnPersegi = findViewById(R.id.btnPersegi);
        btnSegitiga = findViewById(R.id.btnSegitiga);
        btnLingkaran = findViewById(R.id.btnLingkaran);
        large = findViewById(R.id.large);
        around = findViewById(R.id.around);
        btnPersegi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (x.getText().toString().length() == 0) {
                    x.setError("Data tidak boleh kosong");
                } else if (y.getText().toString().length() == 0) {
                    y.setError("Data tidak boleh kosong");
                } else {
                    x.setError(null);
                    y.setError(null);

                    Integer panjang = Integer.parseInt(x.getText().toString());
                    Integer lebar = Integer.parseInt(y.getText().toString());
                    int large_result = panjang * lebar;
                    int around_result = 2 * (panjang + lebar);
                    String output = String.valueOf(large_result);
                    String output2 = String.valueOf(around_result);
                    large.setText(output.toString());
                    around.setText(output2.toString());

                }
            }

            ;

        });

        btnSegitiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (x.getText().toString().length() == 0) {
                    x.setError("Data tidak boleh kosong");
                } else if (y.getText().toString().length() == 0) {
                    y.setError("Data tidak boleh kosong");
                } else {
                    x.setError(null);
                    y.setError(null);

                    double alas = Integer.parseInt(x.getText().toString());
                    double tinggi = Integer.parseInt(y.getText().toString());
                    double large_result = (0.5 * alas * tinggi);
                    double side = Math.sqrt(Math.pow(alas / 2, 2) + Math.pow(tinggi, 2));
                    double around_result = alas + (side * 2);
                    String output = String.valueOf(large_result);
                    String output2 = String.valueOf(around_result);
                    large.setText(output.toString());
                    around.setText(output2.toString());
                }

            }
        });

        btnLingkaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (x.getText().toString().length() == 0) {
                    x.setError("Data tidak boleh kosong");
                } else {
                    x.setError(null);
                    y.setError(null);

                    double phi = 3.14;
                    double diameter = Integer.parseInt(x.getText().toString());
                    double jarijari = diameter / 2;
                    double large_result = phi * jarijari * jarijari;
                    double around_result = phi * diameter;
                    String output = String.valueOf(large_result);
                    String output2 = String.valueOf(around_result);
                    large.setText(output.toString());
                    around.setText(output2.toString());
                }
            }

            ;
        });
    }
}