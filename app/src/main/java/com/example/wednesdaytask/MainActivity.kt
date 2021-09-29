package com.example.wednesdaytask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var name: EditText
    lateinit var lastName: EditText
    lateinit var showing: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        name = findViewById(R.id.Name)
        lastName = findViewById(R.id.LastName)
        showing = findViewById(R.id.button)
        showing.setOnClickListener{
            Toast.makeText(applicationContext, "${name.text} ${lastName.text}", Toast.LENGTH_SHORT).show()
        }
    }
}