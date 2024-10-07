package com.isamuha.uts

import android.content.Intent
import android.os.Bundle
import android.view.inputmethod.InputBinding
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var profile: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        profile = findViewById(R.id.profile)

        profile.setOnClickListener {
            val intenToProfile = Intent(this@MainActivity, ProfileActivity::class.java)
            startActivity(intenToProfile)
        }

    }
}