package com.example.birthdayapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


   }

    fun createBirthdayCard(view: View)
    {
        val name=InputName.editableText.toString()
        Toast.makeText(this, "name is $name", Toast.LENGTH_LONG).show()
    }
}
