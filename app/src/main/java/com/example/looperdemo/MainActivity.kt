package com.example.looperdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import android.widget.Toast.LENGTH_LONG
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Math.PI

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    fun runThreadRunnable(str: String) {

        val thread = Thread(Runnable {
            var reversedStr: String = str.reversed()
            runOnUiThread { txtView.text = "${str.reversed()}\n" }

        })

        thread.start()


    }

    fun onClick(view: View) {
        Toast.makeText(this, "Reversing String", LENGTH_LONG).show()
        var message = etStr.text.toString()
        runThreadRunnable(message)
    }

}
