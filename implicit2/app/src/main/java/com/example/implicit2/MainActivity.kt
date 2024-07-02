package com.example.implicit2

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import android.provider.Telephony.Mms.Intents
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.implicit2.R.id.webview1

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val browser=findViewById<cardview>(R.id.webview1)
        val camera=findViewById<cardview>(R.id.webview2)

        browser.setOnClickListener{
            val intents= Intents(Intent.ACTION_VIEW)
                intents.data =Uri.parse("https://www.foodphotoimage.com/vedios/666666")
        }
        camera.setOnClickListener{
            val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivity(intent)
        }
    }
}