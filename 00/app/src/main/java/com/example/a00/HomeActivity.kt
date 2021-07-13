package com.example.a00

import android.content.Intent
import android.content.res.Resources
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

private const val USERNAME = "username"
private const val PASSWORD = "password"

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        // Get the TextView to show username and password
        val username : TextView = findViewById<TextView>(R.id.username_output_text_view)
        val password : TextView = findViewById<TextView>(R.id.password_output_text_view)

        val res : Resources = resources as Resources;

        val labelUsername : String = String.format(res.getString(R.string.label_username), intent.getStringExtra(USERNAME))
        val labelPassword : String = String.format(res.getString(R.string.label_password), intent.getStringExtra(PASSWORD))

        // Set the text
        username.text = labelUsername
        password.text = labelPassword

        val backButton = findViewById<ImageView>(R.id.back_button_image)
        backButton.setOnClickListener {
            // Trigger the back button click
            onBackPressed()
        }

        findViewById<Button>(R.id.goto_new_activity).setOnClickListener{
            startActivity(Intent(this@HomeActivity, NewActivity::class.java))
        }
    }
}
