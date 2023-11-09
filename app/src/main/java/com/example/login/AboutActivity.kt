package com.example.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class AboutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        val abtBack = findViewById<ImageView>(R.id.abt_back)
        abtBack.setOnClickListener {
            val intent = Intent(this, DashActivity ::class.java)
            startActivity( intent)
        }
    }
}