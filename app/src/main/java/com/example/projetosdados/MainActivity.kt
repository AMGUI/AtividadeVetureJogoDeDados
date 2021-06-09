package com.example.projetosdados

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import kotlin.properties.Delegates


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var listaImg  = intArrayOf(R.drawable.dado1,R.drawable.dado2,R.drawable.dado3,R.drawable.dado4,R.drawable.dado5,R.drawable.dado6,)

        val image1 = findViewById<ImageView>(R.id.imageDado1)
        val image2 = findViewById<ImageView>(R.id.imageDado2)

        val texto1 = findViewById<TextView>(R.id.textView)
        val texto2 = findViewById<TextView>(R.id.textView2)

        val btr    = findViewById<Button>(R.id.button)

        btr.setOnClickListener{
            var numeroGerado = geranumero()
            texto1.text = numeroGerado.toString()
            image2.setImageResource(listaImg[numeroGerado-1])
            numeroGerado = geranumero()
            texto2.text = numeroGerado.toString()
            image1.setImageResource(listaImg[numeroGerado-1])
        }

    }

    private fun geranumero(): Int{
    return (1..6).random()
    }
}