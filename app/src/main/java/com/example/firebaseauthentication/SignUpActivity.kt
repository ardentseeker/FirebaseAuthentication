package com.example.firebaseauthentication

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.example.firebaseauthentication.databinding.ActivitySignUpBinding

class SignUpActivity : AppCompatActivity() {

    lateinit var email:EditText
    lateinit var pass:EditText
    lateinit var name:EditText
    lateinit var address:EditText
    lateinit var signUp:Button

    lateinit var signUpBinding:ActivitySignUpBinding

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        signUpBinding = ActivitySignUpBinding.inflate(layoutInflater)
        val view = signUpBinding.root
        setContentView(view)

        signUpBinding.signUp.setOnClickListener {

        }

    }
}