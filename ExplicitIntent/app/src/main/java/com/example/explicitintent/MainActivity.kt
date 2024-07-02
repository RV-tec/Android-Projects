package com.example.explicitintent

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {

        Thread.sleep(3000)
        installSplashScreen()

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val secondPageBtn = findViewById<Button>(R.id.secondPageBtn)

        secondPageBtn.setOnClickListener {
            Toast.makeText(applicationContext, "Proceed to second page...", Toast.LENGTH_SHORT).show()
            intent = Intent(applicationContext, Second_Page::class.java)
            startActivity(intent)
        }

    }
}