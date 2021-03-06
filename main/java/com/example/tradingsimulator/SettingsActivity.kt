package com.example.tradingsimulator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle


class SettingsActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)
        supportFragmentManager.beginTransaction()
            .replace(R.id.frame_layout, SettingsFragment())
            .commit()
    }
}
