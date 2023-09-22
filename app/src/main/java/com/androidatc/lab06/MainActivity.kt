package com.androidatc.lab06

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.androidatc.lab06.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }

    fun display(view: View) {
        binding.info.text = "Android Application Development, Android Security Essentials, and Monetize Android Applications"
    }


}
