package com.nauhalf.mysimplecleanarchitecture

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.nauhalf.mysimplecleanarchitecture.databinding.ActivityMainBinding
import com.nauhalf.mysimplecleanarchitecture.presentation.MainViewModel
import com.nauhalf.mysimplecleanarchitecture.presentation.MainViewModelFactory

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val factory = MainViewModelFactory.getInstance()
        val viewModel = ViewModelProvider(this, factory)[MainViewModel::class.java]

        viewModel.setName("Dico")
        viewModel.message.observe(this){
            binding.tvWelcome.text = it.welcomeMessage
        }
    }
}