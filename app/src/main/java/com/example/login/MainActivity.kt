package com.example.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


            // Toast.makeText(this,"Firebase done",Toast.LENGTH_SHORT).show()

            regestration_button.setOnClickListener {

                val email = email_editText_regestration.text.toString()
                val password = password_editText_regestration.text.toString()

                 Log.d("main", "email:" + email)
                 Log.d("main", "password:" + password)






            }

            already_have_an_account_textView.setOnClickListener {

                var intent= Intent(this,loginPage::class.java)
                startActivity(intent)
            }
    }
}
