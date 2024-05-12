package com.miau.rankingsktn.controlador

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.miau.rankingsktn.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.vista_principal)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets


        }
    }

    @SuppressLint("SetTextI18n", "CutPasteId")
    fun funcion(view: View) {
        var testo = findViewById<TextView>(R.id.textoEjemplo)
        when (testo.text) {
            "Texto loco\nde ejemplo\n\nMACARRONES" -> testo.text = "LO PRESIONASTE\n\nEstupida\n mi pelo idiota"
            "Bueno te\nperdono" ->  testo.text = "Texto loco\nde ejemplo\n\nMACARRONES"
            else -> testo.text = "Bueno te\nperdono"
        }
    }
}