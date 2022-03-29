package com.bignerdranch.android.dicemakeitroll

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun roll(view: android.view.View) {
        Toast.makeText(this, "yooo", Toast.LENGTH_LONG).show()
    }

    fun addDice(view: View) {

    }


}