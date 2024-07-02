package com.example.recycle

import android.annotation.SuppressLint
import android.media.MediaPlayer
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val cow_btn = findViewById<ImageButton>(R.id.cow)
        val bat_btn = findViewById<ImageButton>(R.id.bat)
        val bear_btn = findViewById<ImageButton>(R.id.bear)
        val deer_btn = findViewById<ImageButton>(R.id.deer)
        val dog_btn = findViewById<ImageButton>(R.id.dog)
        val duck_btn = findViewById<ImageButton>(R.id.duck)
        val goat_btn = findViewById<ImageButton>(R.id.goat)
        val pig_btn = findViewById<ImageButton>(R.id.pig)
        val sheep_btn = findViewById<ImageButton>(R.id.sheep)
        val swan_btn = findViewById<ImageButton>(R.id.swan)

        cow_btn.setOnClickListener {
            MediaPlayer.create(this, R.raw.cow).start()
        }
        bat_btn.setOnClickListener {
            MediaPlayer.create(this, R.raw.bat).start()
        }
        bear_btn.setOnClickListener {
            MediaPlayer.create(this, R.raw.bear).start()
        }
        dog_btn.setOnClickListener {
            MediaPlayer.create(this, R.raw.dog).start()
        }
        duck_btn.setOnClickListener {
            MediaPlayer.create(this, R.raw.duck).start()
        }
        goat_btn.setOnClickListener {
            MediaPlayer.create(this, R.raw.goat).start()
        }
        pig_btn.setOnClickListener {
            MediaPlayer.create(this, R.raw.pig).start()
        }
        sheep_btn.setOnClickListener {
            MediaPlayer.create(this, R.raw.sheep).start()
        }
        swan_btn.setOnClickListener {
            MediaPlayer.create(this, R.raw.swan).start()
        }
        deer_btn.setOnClickListener {
            MediaPlayer.create(this, R.raw.deer).start()
        }

    }
}