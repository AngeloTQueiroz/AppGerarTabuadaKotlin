package com.example.meuaplicativo2

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }




        var numero = findViewById<EditText>(R.id.numero1)

        val butao = findViewById<Button>(R.id.Btn1)

        var texto = findViewById<TextView>(R.id.resultado)



        butao.setOnClickListener {
            var valor = numero.text.toString().toIntOrNull() ?: 0

            var resultado = ""

            for (i in 0.. 10){

                resultado +="$valor x  $i:   ${i * valor}\n "
                texto.text = resultado

            }




        }



    }




}
