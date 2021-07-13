package com.example.a00

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import androidx.fragment.app.commit
import androidx.lifecycle.Observer
import com.example.a00.HomeFragment

class NewActivity : AppCompatActivity(R.layout.activity_new) {
    private val viewModel : NewActivityViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if(savedInstanceState == null) {
            supportFragmentManager.beginTransaction().add(R.id.new_activity_fragment_container_view, HomeFragment.newInstance()).commit()
        }

        // Our variable change observer to toggle our fragment
        viewModel.fragmentStatus.observe(this, Observer { fragmentStatus ->
            if(fragmentStatus == true) {
                supportFragmentManager.beginTransaction().add(R.id.new_activity_fragment_container_view, HomeFragment.newInstance()).commit()
            } else {
                supportFragmentManager.beginTransaction().add(R.id.new_activity_fragment_container_view, DetailsFragment.newInstance()).commit()
            }
        })

    }
}