package com.example.derinuswenda_tugas2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class register : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_register)


        val btnregister= findViewById<Button>(R.id.register)

        val btnlogin= findViewById<TextView>(R.id.textLogin)

        // Ketika tombol diklik, pindah ke LoginActivity

        btnlogin.setOnClickListener {
            val intent = Intent(this, login::class.java)
            startActivity(intent)
        }


        // Ketika tombol diklik, pindah ke LoginActivity
        btnregister.setOnClickListener {
            val intent = Intent(this, home::class.java)
            startActivity(intent)
        }

    }
}