package com.example.helloworld

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnBMI: Button
    lateinit var btnSentmoney: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnBMI = findViewById(R.id.btnBMI)
        btnBMI.setOnClickListener {
            val intent = Intent(this, CalculateBMIActivity::class.java)
            startActivity(intent)
        }
        btnSentmoney = findViewById(R.id.btnSentmoney)
        btnSentmoney.setOnClickListener {
            val intent = Intent(this, SentMoneyActivity::class.java)
            startActivity(intent)
        }
    }
}