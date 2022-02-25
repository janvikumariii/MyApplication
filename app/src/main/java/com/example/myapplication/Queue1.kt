package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Queue1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_queue1)
        val Btn5: Button = findViewById (R.id.Btn5)

        Btn5.setOnClickListener() {
            val intent = Intent(this, Queue2::class.java)
            startActivity(intent)
        }
    }
}