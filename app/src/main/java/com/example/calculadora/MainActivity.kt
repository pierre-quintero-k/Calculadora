package com.example.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.widget.EditText
import android.widget.TextView
import android.os.Bundle
import android.util.Log
import android.view.View
import com.example.calculadora.R
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private var number_1: EditText? = null
    private var number_2: EditText? = null
    private var resultado: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        number_1 = findViewById(R.id.number_1)
        number_2 = findViewById(R.id.number_2)
        resultado = findViewById(R.id.resultado)
        Log.i("TAG", "en este paso se reciben los datos de la vista")
    }

    fun sumar(v: View?) {
        Log.i("TAG", "en este paso se ingresa al metodo de suma")
        val s1 = number_1!!.text.toString()
        val s2 = number_2!!.text.toString()
        if (s1.length > 0 && s2.length > 0) {
            Log.i("TAG", "en este paso se suman las cifras en caso que sean mayor a 0")
            val v1 = s1.toInt()
            val v2 = s2.toInt()
            val suma = v1 + v2
            resultado!!.text = "El Resultado es: $suma"
        } else {
            Log.i("TAG", "en caso que alguna cifra este vacia entra a esta excepcion")
            Toast.makeText(this, "No puede tener campos en blanco", Toast.LENGTH_SHORT).show()
        }
    }

    fun restar(v: View?) {
        val s1 = number_1!!.text.toString()
        val s2 = number_2!!.text.toString()
        if (s1.length > 0 && s2.length > 0) {
            Log.i("TAG", "en este paso se restan las cifras en caso que sean mayor a 0")
            val v1 = s1.toInt()
            val v2 = s2.toInt()
            val suma = v1 - v2
            resultado!!.text = "El Resultado es: $suma"
        } else {
            Log.i("TAG", "en caso que alguna cifra este vacia entra a esta excepcion")
            Toast.makeText(this, "No puede tener campos en blanco", Toast.LENGTH_SHORT).show()
        }
    }

    fun multiplicar(v: View?) {
        val s1 = number_1!!.text.toString()
        val s2 = number_2!!.text.toString()
        if (s1.length > 0 && s2.length > 0) {
            Log.i("TAG", "en este paso se multiplican las cifras en caso que sean mayor a 0")
            val v1 = s1.toInt()
            val v2 = s2.toInt()
            val suma = v1 * v2
            resultado!!.text = "El Resultado es: $suma"
        } else {
            Log.i("TAG", "en caso que alguna cifra este vacia entra a esta excepcion")
            Toast.makeText(this, "No puede tener campos en blanco", Toast.LENGTH_SHORT).show()
        }
    }

    fun dividir(v: View?) {
        val s1 = number_1!!.text.toString()
        val s2 = number_2!!.text.toString()
        if (s1.length > 0 && s2.length > 0) {
            Log.i("TAG", "en este paso se dividen las cifras en caso que sean mayor a 0")
            val v1 = s1.toInt()
            val v2 = s2.toInt()
            val suma = v1 / v2
            resultado!!.text = "El Resultado es: $suma"
        } else {
            Log.i("TAG", "en caso que alguna cifra este vacia entra a esta excepcion")
            Toast.makeText(this, "No puede tener campos en blanco", Toast.LENGTH_SHORT).show()
        }
    }

    fun cerrar(v: View?) {
        finish()
    }
}