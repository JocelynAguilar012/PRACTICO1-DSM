package com.example.desafiopractico01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Ejercicio3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicio3)
        //DECLARAMOS LAS VARIABLES

        val num1 = findViewById<EditText>(R.id.txtNum1)
        val num2 = findViewById<EditText>(R.id.txtNum2)
        val suma = findViewById<Button>(R.id.BtnSuma)
        val resta = findViewById<Button>(R.id.BtnResta)
        val multiplicacion = findViewById<Button>(R.id.BtnMultiplicacion)
        val division = findViewById<Button>(R.id.BtnDivision)
        val Resultado = findViewById<TextView>(R.id.LblResultado)

        suma.setOnClickListener {
            var num_1: String = num1.text.toString()
            val num_2: String = num2.text.toString()
            val Total = num_1.toFloat() + num_2.toFloat()
            Resultado.setText("Resultado: "+Total)
        }

        resta.setOnClickListener {
            var num_1: String = num1.text.toString()
            val num_2: String = num2.text.toString()
            val Total = num_1.toFloat() - num_2.toFloat()
            Resultado.setText("Resultado: "+Total)
        }

        multiplicacion.setOnClickListener {
            var num_1: String = num1.text.toString()
            val num_2: String = num2.text.toString()
            val Total = num_1.toFloat() * num_2.toFloat()
            Resultado.setText("Resultado: "+Total)
        }

        division.setOnClickListener {
            var num_1: String = num1.text.toString()
            val num_2: String = num2.text.toString()
            val Total = num_1.toFloat() / num_2.toFloat()
            Resultado.setText("Resultado: "+Total)
        }

    }
}