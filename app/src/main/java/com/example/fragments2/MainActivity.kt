package com.example.fragments2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       val btnnews: Button =  findViewById(R.id.buttonNews); //find the button on the xml file, imported and save it in the java file
        btnnews.setOnClickListener{
             public void onClick(View view)
        }
    }
}
