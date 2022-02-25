package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val Btn4: Button = findViewById (R.id.Btn4)

        Btn4.setOnClickListener() {
            val intent = Intent(this, Queue1::class.java)
            startActivity(intent)
        }

    }
}