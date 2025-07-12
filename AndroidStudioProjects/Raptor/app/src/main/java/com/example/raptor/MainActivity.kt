package com.example.raptor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttondark=findViewById<Button>(R.id.btnDark)
        val buttonRead=findViewById<Button>(R.id.btnRead)
        val layout= findViewById<LinearLayout>(R.id.LinearLayout)


        buttonRead.setOnClickListener{
            // change to light mode
            layout.setBackgroundResource(R.color.pink)



        }
        buttondark.setOnClickListener{
            //change to dark mode
            layout.setBackgroundResource(R.color.yellow)
        }


    }
}