package com.example.a00

import android.content.Intent
import android.content.res.Resources
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById<Button>(R.id.login_button);
        btn.setOnClickListener {

            val userName : TextView = findViewById<TextView>(R.id.username_input);
            val password : TextView = findViewById<TextView>(R.id.password_input);

            if(userName.text.toString() == "" && password.text.toString() == "") {
                Toast.makeText(this, "Username and password field are empty", Toast.LENGTH_SHORT).show()
            } else if(userName.text.toString() == "") {
                Toast.makeText(this, "Username field is empty", Toast.LENGTH_SHORT).show()
            } else if(password.text.toString() == "") {
                Toast.makeText(this, "Password field is empty", Toast.LENGTH_SHORT).show()
            } else {
                val i = Intent(this@MainActivity, HomeActivity::class.java);
                i.putExtra("username", userName.text.toString());
                i.putExtra("password", password.text.toString());
                startActivity(i);
            }


        }
    }
}