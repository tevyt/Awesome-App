package com.example.awesomeapp

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.widget.Button

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class MainActivity : Activity() {





    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.fragment_first)

        val button = findViewById<Button>(R.id.button_first)



        button.setOnClickListener {
           val intent = Intent()
           intent.action = Intent.ACTION_SEND
           intent.putExtra(Intent.EXTRA_TEXT, "http://ec2-18-222-49-177.us-east-2.compute.amazonaws.com/awesome_app.apk")
           intent.type = "text/plain"
           startActivity(Intent.createChooser(intent, "Share To:"))
        }
    }


}