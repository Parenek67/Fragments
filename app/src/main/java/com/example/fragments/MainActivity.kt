package com.example.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val viewModel = ViewModelProvider(this, ViewModelFactory()).
            get(CheckViewModel::class.java)
        viewModel.check.observe(this, Observer {
            if(!it) {
                supportFragmentManager.beginTransaction().replace(R.id.frame1, BlueFragment()).commit()
                supportFragmentManager.beginTransaction().replace(R.id.frame2, RedFragment()).commit()
            }
            else{
                supportFragmentManager.beginTransaction().replace(R.id.frame2, BlueFragment()).commit()
                supportFragmentManager.beginTransaction().replace(R.id.frame1, RedFragment()).commit()
            }
        })
        val caption: Button = findViewById(R.id.caption)
        caption.setOnClickListener{
            viewModel.changeCheck()
        }
    }
}
