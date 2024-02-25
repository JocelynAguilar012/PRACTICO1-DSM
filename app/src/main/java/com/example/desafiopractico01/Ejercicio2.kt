package com.example.desafiopractico01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Ejercicio2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicio2)
        //DECLARAMOS LAS VARIABLES
        val nombreTrabajador = findViewById<EditText>(R.id.editTextNameTrabajador)
        val salario = findViewById<EditText>(R.id.editTextSalario)
        val btnCalcular=findViewById<Button>(R.id.btnSalary)
        val textResult=findViewById<TextView>(R.id.textView3)
        val iss = 0.03
        val afp = 0.04
        val renta = 0.05
        btnCalcular.setOnClickListener {
            var nombreTrabajadorFinal: String=nombreTrabajador.text.toString()
            var salariofinal: String=salario.text.toString()
            val salarioNeto=salariofinal.toFloat() - iss - afp - renta
            textResult.setText(
                "SALARIO NETO: "+salarioNeto
            )
        }

    }
}