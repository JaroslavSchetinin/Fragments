package com.example.admin.fragments

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class TwoFragmentsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_two_fragments)

        if(savedInstanceState == null){
            supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.top_fragment_container, ArgsFragment.newInstance("TOP FRAGMENT"))
                    .commit()
            supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.bottom_fragment_container, ArgsFragment.newInstance("BOTTOM FRAGMENT"))
                    .commit()
        }
    }
}