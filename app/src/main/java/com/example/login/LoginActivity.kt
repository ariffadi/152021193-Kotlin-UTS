package com.example.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val logTxtReg = findViewById<TextView>(R.id.log_txtreg)

        // Atur listener untuk menangani klik TextView log_txtreg
        logTxtReg.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }


        val logBtn1 = findViewById<TextView>(R.id.log_btn1)
        logBtn1.setOnClickListener {
            val intent = Intent(this, DashActivity ::class.java)
            startActivity(intent)
        }

        val logBack = findViewById<ImageView>(R.id.log_back)
        logBack.setOnClickListener {
            val intent = Intent(this, MainActivity ::class.java)
            startActivity( intent)
        }
        val logText2 = findViewById<TextView>(R.id. log_text2)
        logText2.setOnClickListener {
            val intent = Intent(this, ForgotActivity::class.java)
            startActivity(intent)
        }
    }
}