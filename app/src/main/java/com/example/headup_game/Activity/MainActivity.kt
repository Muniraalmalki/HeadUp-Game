package com.example.headup_game.Activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.headup_game.R

class MainActivity : AppCompatActivity() {
    private lateinit var startButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        startButton = findViewById(R.id.startButton)

        startButton.setOnClickListener {
            val  intent = Intent(this,CelebrityActivity::class.java)
            startActivity(intent)
        }

    }
}