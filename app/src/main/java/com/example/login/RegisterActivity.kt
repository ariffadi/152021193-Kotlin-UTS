package com.example.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView



class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)


        val regBack = findViewById<ImageView>(R.id. reg_back)
        regBack.setOnClickListener {
            val intent = Intent(this, MainActivity ::class.java)
            startActivity( intent)
        }

        val regBtn1 = findViewById<Button>(R.id. reg_btn1)
        regBtn1.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }

        val regTxtLog = findViewById<TextView>(R.id. reg_txtlog)
        regTxtLog.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
    }
}