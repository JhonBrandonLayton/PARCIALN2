package com.example.thebomb

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val nextButton =
            findViewById<Button>(R.id.nextButton)
        nextButton.setOnClickListener {
            val editText =
                findViewById<EditText>(R.id.editText)
            val nombreUsuario = editText.text.toString()
            val intent = Intent(this@MainActivity, panta2::class.java)
            intent.putExtra("nombreUsuario", nombreUsuario)
            startActivity(intent)
        }
    }
}