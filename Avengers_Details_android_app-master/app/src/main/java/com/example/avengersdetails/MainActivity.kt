package com.example.avengersdetails

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
var titlename:String?="Hello"
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.lets_scroll)
        titlename=intent.getStringExtra("name")
        title= titlename
    }
}