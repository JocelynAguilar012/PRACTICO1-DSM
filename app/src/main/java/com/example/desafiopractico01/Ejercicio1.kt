package com.example.desafiopractico01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Ejercicio1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicio1)
        //DECLARAMOS LAS VARIABLES
        val nombreEstudiante = findViewById<EditText>(R.id.editTextName)
        val btnCalcular=findViewById<Button>(R.id.btnCalcular)
        val btnN1=findViewById<EditText>(R.id.N1)
        val btnN2=findViewById<EditText>(R.id.N2)
        val btnN3=findViewById<EditText>(R.id.N3)
        val btnN4=findViewById<EditText>(R.id.N4)
        val btnN5=findViewById<EditText>(R.id.N5)
        val textResult=findViewById<TextView>(R.id.txtResultado)

        btnCalcular.setOnClickListener {
            //OBTENEMOS LOS VALORES DE CADA ELEMENTO
            var nombreEstudianteFinal: String=nombreEstudiante.text.toString()
            var numeroNota1: String=btnN1.text.toString()
            var numeroNota2: String=btnN2.text.toString()
            var numeroNota3: String=btnN3.text.toString()
            var numeroNota4: String=btnN4.text.toString()
            var numeroNota5: String=btnN5.text.toString()
            //CALCULAMOS EL PROMEDIO DEL ESTUDIANTE
            var prom=(numeroNota1.toFloat() + numeroNota2.toFloat() + numeroNota3.toFloat() + numeroNota4.toFloat() + numeroNota5.toFloat())/5
            //VALIDAMOS SI APROBO O REPROBO
            if (prom <=6){
                textResult.setText(
                    "PROMEDIO: "+prom+ " REPROBADO"
                )
            }
            if (prom > 6 && prom <= 10){
                textResult.setText(
                    "PROMEDIO: "+prom+ " APROBADO"
                )
            }
        }
    }
}