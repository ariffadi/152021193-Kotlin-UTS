package com.example.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class ForgotActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot)

        val forBack = findViewById<ImageView>(R.id.for_back)
        forBack.setOnClickListener {
            val intent = Intent(this, LoginActivity ::class.java)
            startActivity( intent)
        }

        val forBtn1 = findViewById<TextView>(R.id.for_btn1)
        forBtn1.setOnClickListener {
            val intent = Intent(this, LoginActivity ::class.java)
            startActivity(intent)
        }

    }
}