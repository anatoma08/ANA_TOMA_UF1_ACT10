package com.example.ana_toma_uf1_act10

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Cambiar el layout a la versión que quieras probar:
        // setContentView(R.layout.activity_main) ya sea para Linear, Relative o ConstraintLayout
        setContentView(R.layout.activity_main)

        val btnEnviar = findViewById<Button>(R.id.btnEnviar)
        btnEnviar.setOnClickListener {
            Toast.makeText(this, "Registro completado", Toast.LENGTH_SHORT).show()
        }
    }
}