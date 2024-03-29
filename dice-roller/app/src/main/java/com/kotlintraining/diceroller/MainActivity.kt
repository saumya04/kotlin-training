package com.kotlintraining.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    lateinit var diceImageView: ImageView;
    lateinit var diceRollBtn: Button;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.diceImageView = findViewById(R.id.dice_image_view)
        this.diceRollBtn= findViewById(R.id.roll_button)

        this.diceRollBtn.setOnClickListener { this.rollDice() }
    }

    private fun rollDice() {
        this.diceImageView.setImageResource(getRandomDiceNum())
    }

    private fun getRandomDiceNum(): Int {
        return when (Random().nextInt(6) + 1) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
    }
}
