package com.nagarro.applicationform

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import android.widget.RadioGroup

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val gender = findViewById<RadioGroup>(R.id.gender)
        val male = findViewById(R.id.male) as RadioButton
        val female = findViewById(R.id.female) as RadioButton



    }
}