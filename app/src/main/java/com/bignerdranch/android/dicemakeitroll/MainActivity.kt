package com.bignerdranch.android.dicemakeitroll

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun roll(view: android.view.View) {
        val btnRoll = findViewById<Button>(R.id.btn_roll)
        val btnReset = findViewById<Button>(R.id.btn_reset)
        val imgDice1 = findViewById<ImageView>(R.id.img_first_dice)
        val imgDice2 = findViewById<ImageView>(R.id.img_second_dice)
        val tvTotal = findViewById<TextView>(R.id.tvTotal)
        val dice1 = Dice(6)
        val dice2 = Dice(6)

        var diceA = dice1.roll()
        var diceB = dice2.roll()

        tvTotal.text = ""+(diceA+diceB)

        if(diceA == diceB){
            btnRoll.isEnabled = false
            btnReset.isEnabled = true
        }

        when(diceA){
            1 -> imgDice1.setImageResource(R.drawable.d1)
            2 -> imgDice1.setImageResource(R.drawable.d2)
            3 -> imgDice1.setImageResource(R.drawable.d3)
            4 -> imgDice1.setImageResource(R.drawable.d4)
            5 -> imgDice1.setImageResource(R.drawable.d5)
            6 -> imgDice1.setImageResource(R.drawable.d6)
        }

        when(diceB){
            1 -> imgDice2.setImageResource(R.drawable.d1)
            2 -> imgDice2.setImageResource(R.drawable.d2)
            3 -> imgDice2.setImageResource(R.drawable.d3)
            4 -> imgDice2.setImageResource(R.drawable.d4)
            5 -> imgDice2.setImageResource(R.drawable.d5)
            6 -> imgDice2.setImageResource(R.drawable.d6)
        }
    }

    fun reset(view: View) {
        val btnRoll = findViewById<Button>(R.id.btn_roll)
        val btnReset = findViewById<Button>(R.id.btn_reset)
        val imgDice1 = findViewById<ImageView>(R.id.img_first_dice)
        val imgDice2 = findViewById<ImageView>(R.id.img_second_dice)
        val tvTotal = findViewById<TextView>(R.id.tvTotal)
        btnReset.isEnabled = false
        btnRoll.isEnabled = true
        imgDice1.setImageResource(R.drawable.d6)
        imgDice2.setImageResource(R.drawable.d5)
        tvTotal.text = "11"
    }
}