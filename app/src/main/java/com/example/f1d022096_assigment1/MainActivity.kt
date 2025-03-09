package com.example.f1d022096_assigment1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.f1d022096_assigment1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonHello.setOnClickListener {
            var str : String = binding.edData.text.toString()
            binding.tvHello.setText("Hello, $str")
        }

    }
}