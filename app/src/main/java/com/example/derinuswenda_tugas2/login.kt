package com.example.derinuswenda_tugas2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)



        val btnLogin= findViewById<Button>(R.id.btnLogin)

        val btnRegister= findViewById<TextView>(R.id.textRegister)

        val forgot = findViewById<TextView>(R.id.textForgot)

        // Ketika tombol diklik, pindah ke LoginActivity

        btnLogin.setOnClickListener {
            val intent = Intent(this, home::class.java)
            startActivity(intent)
        }

        forgot.setOnClickListener {
            val intent = Intent(this, ResetPasword::class.java)
            startActivity(intent)
        }

        // Ketika tombol diklik, pindah ke LoginActivity
        btnRegister.setOnClickListener {
            val intent = Intent(this, register::class.java)
            startActivity(intent)
        }

    }
}