package com.arjun1194.crasher

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val crasher = Crasher()
        findViewById<Button>(R.id.java_button).setOnClickListener {
            crasher.createJavaCrash()
        }

        findViewById<Button>(R.id.cxx_button).setOnClickListener {
            crasher.createNativeCxxCrash()
        }

        findViewById<Button>(R.id.anr_button).setOnClickListener {
            crasher.createANR()
        }
    }
}