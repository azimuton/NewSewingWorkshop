package com.example.newsewingworkshop

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        button.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }
        button2.setOnClickListener {
            val intent = Intent(this, TamplatesActivity::class.java)
            startActivity(intent)
        }
        button3.setOnClickListener {
            val intent = Intent(this, ManualActivity::class.java)
            startActivity(intent)
        }
    }
}






