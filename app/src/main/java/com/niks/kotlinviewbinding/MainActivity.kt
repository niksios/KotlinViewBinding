package com.niks.kotlinviewbinding

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.niks.kotlinviewbinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)

        //here we will use ViewBinding instead of setContentView()
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        //here we have used binding.apply{} as inside binding.apply{} we can use all clicklistener's
        //is we require context then use single binding.btnSubmit.setonClickListener{} individually
        binding.apply {

            btnSubmit.setOnClickListener{
                val name = edtName.text.toString()
                tvMessage.text = "Hello! $name"
                edtName.setText("")

            }

        }

    }
}