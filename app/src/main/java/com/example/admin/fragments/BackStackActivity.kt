package com.example.admin.fragments

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class BackStackActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dynamic_fragment)

        if (savedInstanceState == null){
            supportFragmentManager.beginTransaction()
                    .replace(R.id.fragment_container, BackStackFragment())
                    .commit()
        }
    }
}