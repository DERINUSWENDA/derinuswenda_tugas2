package com.example.derinuswenda_tugas2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val btnDaftar = findViewById<Button>(R.id.btn_signup)

        val btnLogin= findViewById<Button>(R.id.btnSignIn)

        // Ketika tombol diklik, pindah ke LoginActivity
        btnLogin.setOnClickListener {
            val intent = Intent(this, login::class.java)
            startActivity(intent)
        }

        // Ketika tombol diklik, pindah ke LoginActivity
        btnDaftar.setOnClickListener {
            val intent = Intent(this, register::class.java)
            startActivity(intent)
        }

    }

}