package com.example.a00

import android.content.Intent
import android.content.res.Resources
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

private const val TAG : String = "MainActivity___"
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println("onCreate")
        Log.i(TAG, "onCreate")


        findViewById<Button>(R.id.login_button).setOnClickListener {

            val userName : TextView = findViewById<TextView>(R.id.username_edit_text)
            val password : TextView = findViewById<TextView>(R.id.password_edit_text)

            if(userName.text.toString().isNullOrEmpty() && password.text.toString().isNullOrEmpty()) {
                Toast.makeText(this, getString(R.string.no_username_or_password_toast), Toast.LENGTH_SHORT).show()
            } else {
                val i = Intent(this@MainActivity, HomeActivity::class.java)
                i.putExtra("username", userName.text.toString())
                i.putExtra("password", password.text.toString())
                startActivity(i);
            }
        }
    }

    override fun onStart() {
        super.onStart()
        println("onStart")
        Log.i(TAG, "onStart")
    }

    override fun onResume() {
        super.onResume()
        println("onResume")
        Log.i(TAG, "onResume")
    }

    override fun onPause() {
        super.onPause()
        println("onPause")
        Log.i(TAG, "onPause")
    }

    override fun onStop() {
        super.onStop()
        println("onStop")
        Log.i(TAG, "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        println("onDestroy")
        Log.i(TAG, "onDestroy")
    }
}
