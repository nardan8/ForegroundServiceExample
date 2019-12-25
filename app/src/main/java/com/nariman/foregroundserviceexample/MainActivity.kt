package com.nariman.foregroundserviceexample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun startService(v: View){

        var input = edit_text_input.text.toString()

        val serviceIntent = Intent(this, ExampleForegroundService::class.java)
        serviceIntent.putExtra("inputExtra", input)

        startService(serviceIntent)
    }

    fun stopService(v: View){
        val serviceIntent = Intent(this, ExampleForegroundService::class.java)
        stopService(serviceIntent)
    }
}
