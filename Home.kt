package com.vishru.startup

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View

class Home: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home)


    }

    fun compOpen(view:View){
        startActivity(Intent("com.vishru.startup.COMPUTER"))

    }

    fun twoPlayer(view:View){
        startActivity(Intent("com.vishru.startup.TWOPLAYER"))
    }
}