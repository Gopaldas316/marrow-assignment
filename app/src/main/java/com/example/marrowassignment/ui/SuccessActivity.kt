package com.example.marrowassignment.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.marrowassignment.R

fun newSuccessActivityIntent(context: Context?): Intent {
    return Intent(context, SuccessActivity::class.java)
}

class SuccessActivity : AppCompatActivity() {
    private lateinit var btLogOut : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_success)

        btLogOut = findViewById(R.id.butLogOut)
        btLogOut.setOnClickListener {
            finish()
            startActivity(newHomeScreenActivityIntent(this))
        }
    }
}