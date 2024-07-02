package com.example.explicitintent

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Second_Page : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_second_page)

        val thirdPageBtn = findViewById<Button>(R.id.thirdPageBtn)
        thirdPageBtn.setOnClickListener {
            Toast.makeText(applicationContext, "Go to third page ...", Toast.LENGTH_SHORT).show()
            intent = Intent(applicationContext, Third_Page::class.java)
            startActivity(intent)
        }
    }
}