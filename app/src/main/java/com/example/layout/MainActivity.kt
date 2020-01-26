package com.example.layout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {

    lateinit var txtCount: TextView
    lateinit var btnToast: Button
    lateinit var btnCount: Button
    lateinit var btnRandom: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.count)

        txtCount = findViewById(R.id.txt_count)
        btnToast = findViewById(R.id.btn_toast)
        btnCount = findViewById(R.id.btn_count)
        btnRandom = findViewById(R.id.btn_random)

        btnToast.setOnClickListener {
            Toast.makeText(this, "Toast", Toast.LENGTH_SHORT).show()
        }

        btnCount.setOnClickListener {
            var num: Int = txtCount.text.toString().toInt()
            num++
            txtCount.text = num.toString()
        }

        btnRandom.setOnClickListener {
            val Random = (0 until 100).shuffled().last()
            txtCount.text = Random.toString()
        }
    }
}
