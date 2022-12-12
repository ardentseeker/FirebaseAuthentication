package com.example.firebaseauthentication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.example.firebaseauthentication.databinding.ActivitySignInBinding
import com.google.firebase.auth.FirebaseAuth
import kotlin.math.log

class SignInActivity : AppCompatActivity() {

    lateinit var loginBinding:ActivitySignInBinding

    val auth: FirebaseAuth = FirebaseAuth.getInstance()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        loginBinding = ActivitySignInBinding.inflate(layoutInflater)
        val view = loginBinding.root
        setContentView(view)

        loginBinding.signIn.setOnClickListener {

            val userEmail = loginBinding.emailSi.text.toString()
            val userPass = loginBinding.passSi.text.toString()

            val intent = Intent(this,MainScreen::class.java)
            startActivity(intent)
        }

        loginBinding.signUpPage.setOnClickListener {
            val intent = Intent(applicationContext,SignUpActivity::class.java)
            startActivity(intent)
        }

    }

    fun signInFun(mail:String,pass:String){

    }
}