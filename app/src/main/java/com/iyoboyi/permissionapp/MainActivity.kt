package com.iyoboyi.permissionapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.iyoboyi.permissionapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var nameOfUser = "Papa John"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.launchGallery.setOnClickListener {
            nameOfUser = binding.editTextTextPersonName.text.toString()
            setName(nameOfUser)
        }



    }

    private fun openGallery() {
        val intent = Intent(Intent.ACTION_PICK)
        startActivity(intent)
    }

    private fun setName(name: String){
        binding.textView.text = name
    }
}