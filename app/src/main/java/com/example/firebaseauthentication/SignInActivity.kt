package com.example.firebaseauthentication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.example.firebaseauthentication.databinding.ActivitySignInBinding
import kotlin.math.log

class SignInActivity : AppCompatActivity() {

    lateinit var loginBinding:ActivitySignInBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        loginBinding = ActivitySignInBinding.inflate(layoutInflater)
        val view = loginBinding.root
        setContentView(view)

        loginBinding.signIn.setOnClickListener {

            val intent = Intent(this,MainScreen::class.java)
            startActivity(intent)
        }

        loginBinding.signUpPage.setOnClickListener {
            val intent = Intent(applicationContext,SignUpActivity::class.java)
            startActivity(intent)
        }

    }
}