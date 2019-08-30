package com.goodiebag.pinview.example

import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast

import com.goodiebag.pinview.Pinview

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val pinview1 = findViewById<Pinview>(R.id.pinview1)
        pinview1.setPinViewEventListener { pinview, fromUser -> Toast.makeText(this@MainActivity, pinview.value, Toast.LENGTH_SHORT).show() }


        // pinView Customize
        val pinview5 = findViewById<Pinview>(R.id.pinview5).apply {
            setCursorShape(R.drawable.example_cursor)
            //        pinview5.setCursorColor(Color.BLUE);
            setTextSize(12)
            setTextColor(Color.BLACK)
            showCursor(true)
//            setOnClickListener {
//                this.requestPinEntryFocus()
//            }
        }

    }
}
