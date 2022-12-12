package com.example.firebaseauthentication

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.firebaseauthentication.databinding.ActivitySignUpBinding
import com.google.android.gms.common.util.Strings
import com.google.firebase.auth.FirebaseAuth

class SignUpActivity : AppCompatActivity() {

    lateinit var signUpBinding:ActivitySignUpBinding
    val auth:FirebaseAuth = FirebaseAuth.getInstance()

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        signUpBinding = ActivitySignUpBinding.inflate(layoutInflater)
        val view = signUpBinding.root
        setContentView(view)

        signUpBinding.signUp.setOnClickListener {
            val userEmail = signUpBinding.emailSp.text.toString()
            val userPass = signUpBinding.passwordSp.text.toString()
            signUpFirfebase(userEmail,userPass)
        }
    }
    fun signUpFirfebase(email:String,pass:String){
        auth.createUserWithEmailAndPassword(email,pass).addOnCompleteListener{ task->
            if (task.isSuccessful){
                Toast.makeText(this,"user have been created",Toast.LENGTH_LONG).show()
                finish()
            }else{
                Toast.makeText(this,task.exception?.toString(),Toast.LENGTH_LONG).show()

            }
        }
    }
}