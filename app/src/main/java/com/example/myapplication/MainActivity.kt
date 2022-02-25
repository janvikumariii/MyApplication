package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {


    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val LoginBtn: Button = findViewById (R.id.Btn1)
        val SignUpBtn: Button = findViewById (R.id.Btn2)

        LoginBtn.setOnClickListener() {
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
        }

        SignUpBtn.setOnClickListener(){
            val intent=Intent(this,SignUp::class.java)
            startActivity(intent)
        }

    }

}