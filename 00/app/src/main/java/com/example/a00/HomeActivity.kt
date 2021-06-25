package com.example.a00

import android.content.res.Resources
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.NavController

class HomeActivity : AppCompatActivity() {
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        // Get the TextView to show username and password
        val username : TextView = findViewById<TextView>(R.id.username_output);
        val password : TextView = findViewById<TextView>(R.id.password_output);

        val res : Resources = resources as Resources;

        val labelUsername : String = String.format(res.getString(R.string.label_username), intent.getStringExtra("username"));
        val labelPassword : String = String.format(res.getString(R.string.label_password), intent.getStringExtra("password"))

        // Set the text
        username.text = labelUsername;
        password.text = labelPassword;

        var backButton = findViewById<ImageView>(R.id.back_icon)
        backButton.setOnClickListener {
            // Trigger the back button click
            onBackPressed()
        }
    }

}