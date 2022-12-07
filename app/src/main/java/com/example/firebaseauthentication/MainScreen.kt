package com.example.firebaseauthentication

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainScreen : AppCompatActivity() {

    lateinit var email:TextView
    lateinit var name:TextView
    lateinit var address:TextView


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_screen)

        email = findViewById(R.id.textView)
        name = findViewById(R.id.textView2)
        address = findViewById(R.id.textView3)
        
    }
}