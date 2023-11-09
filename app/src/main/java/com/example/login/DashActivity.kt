package com.example.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dash)

        val dashLogot = findViewById<ImageView>(R.id.dash_back)
        dashLogot.setOnClickListener {
            val intent = Intent(this, MainActivity ::class.java)
            startActivity( intent)
        }

        val dashCal = findViewById<ImageView>(R.id.dash_cal)
        dashCal.setOnClickListener {
            val intent = Intent(this, CalculatorActivity ::class.java)
            startActivity( intent)
        }

        val dashBmi = findViewById<ImageView>(R.id.dash_bmi)
        dashBmi.setOnClickListener {
            val intent = Intent(this, BmiActivity ::class.java)
            startActivity( intent)
        }

        val dashKon = findViewById<ImageView>(R.id.dash_kon)
        dashKon.setOnClickListener {
            val intent = Intent(this, KonfersiActivity ::class.java)
            startActivity( intent)
        }

        val dashAbout = findViewById<ImageView>(R.id.dash_about)
        dashAbout.setOnClickListener {
            val intent = Intent(this,AboutActivity :: class.java)
            startActivity( intent)
        }



    }
}