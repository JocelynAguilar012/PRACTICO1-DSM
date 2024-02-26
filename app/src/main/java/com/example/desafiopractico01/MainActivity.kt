package com.example.desafiopractico01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //DECLARAMOS LOS BOTONES DE CADA EJERCICIO
        val buttonEjer1 = findViewById<Button>(R.id.btn1)
        val buttonEjer2 = findViewById<Button>(R.id.btn2)
        val buttonEjer3 = findViewById<Button>(R.id.btn3)

        //DEFINIMOS QUE PANTALLA SE MOSTRARA DEPENDIENDO DEL CLICK

        buttonEjer1.setOnClickListener {
            //Cuando se hace click sobre el boton ejercicio 1
            val intent = Intent(this, Ejercicio1::class.java)
            startActivity(intent)
        }

        buttonEjer2.setOnClickListener {
            //Cuando se hace click sobre el boton ejercicio 2
            val intent = Intent(this, Ejercicio2::class.java)
            startActivity(intent)
        }

        buttonEjer3.setOnClickListener {
            //Cuando se hace click sobre el boton ejercicio 3
            val intent = Intent(this, Ejercicio3::class.java)
            startActivity(intent)
        }
    }
}