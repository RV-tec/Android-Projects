package com.example.intent

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val webView = findViewById<CardView>(R.id.webView)
        val cameraView = findViewById<CardView>(R.id.cameraView)

        webView.setOnClickListener{
           val intents = Intent(Intent.ACTION_VIEW)
           intents.data = Uri.parse("https://www.rockstargames.com/videos/666666")
            startActivity(intents)
        }
        cameraView.setOnClickListener{
            val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivity(intent)
        }
    }
}