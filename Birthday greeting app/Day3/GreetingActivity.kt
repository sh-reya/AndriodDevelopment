package com.example.birthdayapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_greeting_actvity.*

class GreetingActvity : AppCompatActivity() {
    companion object
    {
        const val NAME_EXTRA="name_extra"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_greeting_actvity)

        val name=intent.getStringExtra(NAME_EXTRA)
        textView.text="Happy Birthday\n$name!"
    }
