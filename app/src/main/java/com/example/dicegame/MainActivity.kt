package com.example.dicegame

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

   fun QuitSystem(view: View?) {
        val b = AlertDialog.Builder(this)
        b.setMessage("Are you sure you want to exit?")
                .setCancelable(false)
                .setPositiveButton("Yes") { dialog, id -> finish() }
                .setNegativeButton("No") { dialog, id -> dialog.cancel() }
        val a = b.create()
        a.show()
    }
    fun callSecondActivity(view: View?) {
        startActivity(Intent(this, DiceCounter::class.java))
    }
}
