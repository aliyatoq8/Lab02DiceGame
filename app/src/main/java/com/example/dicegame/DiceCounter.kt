package com.example.dicegame

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.util.*

//import android.R;
class DiceCounter : AppCompatActivity() {
    private var imageViewDice: ImageView? = null
    private val rng = Random()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dice_counter)
        val imageViewDice = findViewById<View>(R.id.image_view_dice)
        imageViewDice.setOnClickListener {this.rollDice()}
        val reset =
            findViewById<View>(R.id.resetButton) as Button
        reset.setOnClickListener {
            val d1 = findViewById<View>(R.id.one) as TextView
            d1.text = "0"
            val d2 = findViewById<View>(R.id.two) as TextView
            d2.text = "0"
            val d3 = findViewById<View>(R.id.three) as TextView
            d3.text = "0"
            val d4 = findViewById<View>(R.id.four) as TextView
            d4.text = "0"
            val d5 = findViewById<View>(R.id.five) as TextView
            d5.text = "0"
            val d6 = findViewById<View>(R.id.six) as TextView
            d6.text = "0"
        }
    }

    private fun rollDice() {
        val randomNumber = rng.nextInt(6) + 1
        imageViewDice = findViewById(R.id.image_view_dice)
        when (randomNumber) {
            1 -> {
                imageViewDice!!.setImageResource(R.drawable.one)
                val mTextView = findViewById<View>(R.id.one) as TextView
                val x = mTextView.text.toString().toInt() + 1
                mTextView.text = x.toString()
            }
            2 -> {
                imageViewDice!!.setImageResource(R.drawable.two)
                val mTextView = findViewById<View>(R.id.two) as TextView
                val x = mTextView.getText().toString().toInt() + 1
                mTextView.setText(x.toString())
            }
            3 -> {
                imageViewDice!!.setImageResource(R.drawable.three)
                val mTextView = findViewById<View>(R.id.three) as TextView
                val x = mTextView.getText().toString().toInt() + 1
                mTextView.setText(x.toString())
            }
            4 -> {
                imageViewDice!!.setImageResource(R.drawable.four)
                val mTextView = findViewById<View>(R.id.four) as TextView
                val x = mTextView.getText().toString().toInt() + 1
                mTextView.setText(x.toString())
            }
            5 -> {
                imageViewDice!!.setImageResource(R.drawable.five)
                val mTextView = findViewById<View>(R.id.five) as TextView
                val x = mTextView.getText().toString().toInt() + 1
                mTextView.setText(x.toString())
            }
            6 -> {
                imageViewDice!!.setImageResource(R.drawable.six)
                val mTextView = findViewById<View>(R.id.six) as TextView
                val x = mTextView.getText().toString().toInt() + 1
                mTextView.setText( x.toString())
            }
        }
    }
}