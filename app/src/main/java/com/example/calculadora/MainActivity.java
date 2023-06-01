package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText number_1, number_2;
    private TextView resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number_1= findViewById(R.id.number_1);
        number_2= findViewById(R.id.number_2);
        resultado= findViewById(R.id.resultado);
    }

    public void sumar(View v){
        String s1 = number_1.getText().toString();
        String s2 = number_2.getText().toString();
        if (s1.length()>0 && s2.length()>0) {
            int v1 = Integer.parseInt(s1);
            int v2 = Integer.parseInt(s2);
            int suma = v1+v2;
            resultado.setText("El Resultado es: " + suma);
        } else{
            Toast.makeText(this, "No puede tener campos en blanco", Toast.LENGTH_SHORT).show();
        }

    }

    public void restar(View v){
        String s1 = number_1.getText().toString();
        String s2 = number_2.getText().toString();
        if (s1.length()>0 && s2.length()>0) {
            int v1 = Integer.parseInt(s1);
            int v2 = Integer.parseInt(s2);
            int suma = v1-v2;
            resultado.setText("El Resultado es: " + suma);
        } else{
            Toast.makeText(this, "No puede tener campos en blanco", Toast.LENGTH_SHORT).show();
        }

    }

    public void multiplicar(View v){
        String s1 = number_1.getText().toString();
        String s2 = number_2.getText().toString();
        if (s1.length()>0 && s2.length()>0) {
            int v1 = Integer.parseInt(s1);
            int v2 = Integer.parseInt(s2);
            int suma = v1*v2;
            resultado.setText("El Resultado es: " + suma);
        } else{
            Toast.makeText(this, "No puede tener campos en blanco", Toast.LENGTH_SHORT).show();
        }

    }

    public void dividir(View v){
        String s1 = number_1.getText().toString();
        String s2 = number_2.getText().toString();
        if (s1.length()>0 && s2.length()>0) {
            int v1 = Integer.parseInt(s1);
            int v2 = Integer.parseInt(s2);
            int suma = v1/v2;
            resultado.setText("El Resultado es: " + suma);
        } else{
            Toast.makeText(this, "No puede tener campos en blanco", Toast.LENGTH_SHORT).show();
        }

    }

    public void cerrar(View v){
        finish();
    }


}