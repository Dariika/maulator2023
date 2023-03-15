package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class info : AppCompatActivity() {

    lateinit var babout: Button
    lateinit var babout_app: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.`info`)

        babout = findViewById(R.id.babout)
        babout_app = findViewById(R.id.babout_app)

        // добавление прослушивателя кликов к кнопкам
        babout.setOnClickListener {
            val intent = Intent(this, infoab::class.java)
            startActivity(intent)
        }

        babout_app.setOnClickListener {
            val intent = Intent(this, direction::class.java)
            startActivity(intent)
        }
    }
}