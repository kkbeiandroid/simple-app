package com.keltron.animal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val catBtn = findViewById<Button>(R.id.button) as Button
        val dogBtn:Button = findViewById(R.id.button2)
        val displayImg:ImageView = findViewById(R.id.imageView)
        catBtn.setOnClickListener {
            displayImg.setImageResource(R.drawable.cat)
        }
         dogBtn.setOnClickListener {
             displayImg.setImageResource(R.drawable.dog)
         }
    }
}