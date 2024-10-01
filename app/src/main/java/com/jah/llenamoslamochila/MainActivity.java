package com.jah.llenamoslamochila;

import android.graphics.Color;
import android.hardware.camera2.params.BlackLevelPattern;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button btnVaciar;
    TextView txtPeso;
    CheckBox cbLibros, cbPantalones, cbZapatos, cbCamisetas, cbBanhadores, cbGorras;
    String mostrar;
    int pesoFinal , peso;

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

        btnVaciar = findViewById(R.id.btnVaciar);
        txtPeso = findViewById(R.id.txtPeso);
        cbLibros = findViewById(R.id.cbLibros);
        cbPantalones = findViewById(R.id.cbPantalones);
        cbZapatos = findViewById(R.id.cbZapatos);
        cbCamisetas = findViewById(R.id.cbCamisetas);
        cbBanhadores = findViewById(R.id.cbBanhadores);
        cbGorras = findViewById(R.id.cbGorras);


        cbLibros.setOnCheckedChangeListener((compoundButton, b) -> {
            peso = 8;
            if(b){
                pesoFinal += peso;
                mostrar = "Peso " + pesoFinal + " Kg";
                mostrar(pesoFinal, mostrar);
            }else{
                pesoFinal -= peso;
                mostrar = "Peso " + pesoFinal + " Kg";
                mostrar(pesoFinal, mostrar);
            }
        });
        cbPantalones.setOnCheckedChangeListener((compoundButton, b) -> {
            peso = 4;
            if(b){
                pesoFinal += peso;
                mostrar = "Peso " + pesoFinal + " Kg";
                mostrar(pesoFinal, mostrar);
            }else{
                pesoFinal -= peso;
                mostrar = "Peso " + pesoFinal + " Kg";
                mostrar(pesoFinal, mostrar);
            }
        });
        cbZapatos.setOnCheckedChangeListener((compoundButton, b) -> {
            peso = 6;
            if(b){
                pesoFinal += peso;
                mostrar = "Peso " + pesoFinal + " Kg";
                mostrar(pesoFinal, mostrar);
            }else{
                pesoFinal -= peso;
                mostrar = "Peso " + pesoFinal + " Kg";
                mostrar(pesoFinal, mostrar);
            }
        });
        cbCamisetas.setOnCheckedChangeListener((compoundButton, b) -> {
            peso = 3;
            if(b){
                pesoFinal += peso;
                mostrar = "Peso " + pesoFinal + " Kg";
                mostrar(pesoFinal, mostrar);
            }else{
                pesoFinal -= peso;
                mostrar = "Peso " + pesoFinal + " Kg";
                mostrar(pesoFinal, mostrar);
            }
        });
        cbBanhadores.setOnCheckedChangeListener((compoundButton, b) -> {
            peso = 3;
            if(b){
                pesoFinal += peso;
                mostrar = "Peso " + pesoFinal + " Kg";
                mostrar(pesoFinal, mostrar);
            }else{
                pesoFinal -= peso;
                mostrar = "Peso " + pesoFinal + " Kg";
                mostrar(pesoFinal, mostrar);
            }
        });
        cbGorras.setOnCheckedChangeListener((compoundButton, b) -> {
            peso = 2;
            if(b){
                pesoFinal += peso;
                mostrar = "Peso " + pesoFinal + " Kg";
                mostrar(pesoFinal, mostrar);
            }else{
                pesoFinal -= peso;
                mostrar = "Peso " + pesoFinal + " Kg";
                mostrar(pesoFinal, mostrar);
            }
        });

        btnVaciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cbLibros.setChecked(false);
                cbPantalones.setChecked(false);
                cbZapatos.setChecked(false);
                cbCamisetas.setChecked(false);
                cbBanhadores.setChecked(false);
                cbGorras.setChecked(false);
                mostrar = "";
                txtPeso.setText(mostrar);
                pesoFinal = 0;
            }
        });

    }

    public void mostrar(int peso, String mostrar){

        if(peso < 20){
            txtPeso.setTextColor(Color.BLACK);
            txtPeso.setText(mostrar);
        }else{
            txtPeso.setTextColor(Color.RED);
            txtPeso.setText(mostrar);
        }
    }
}