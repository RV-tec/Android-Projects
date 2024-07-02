package com.example.toast

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.toastb)

        val nextBtn = findViewById<Button>(R.id.button)

        nextBtn.setOnClickListener {
            Toast.makeText(applicationContext, "Proceed to register...", Toast.LENGTH_SHORT).show()
            intent = Intent(applicationContext, Register::class.java)
            startActivity(intent)
        }
    }
}

