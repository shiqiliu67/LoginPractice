package com.shiqiliu.androidapplicationloginpractice

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        init()
    }

    private fun init() {
       text_view_login_clicktext_jump.setOnClickListener {
           var intent = Intent(this,RegisterActivity::class.java)
          startActivity(intent)
       }
        button_login.setOnClickListener {
            var intent = Intent(this,HomeActivity::class.java)
            var email = edit_text_login_email.text.toString()
            var pass = edit_text_login_password.text.toString()
            if(email == "admin" && pass == "123") {
                intent.putExtra("EMAIL", email)
                startActivity(intent)
            } else {
                Toast.makeText(applicationContext, "Invalid UserEmail or Password", Toast.LENGTH_LONG).show()
            }
        }
        }
    }
