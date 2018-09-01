package com.example.admin.fragments

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val staticButton = findViewById<Button>(R.id.with_fragments_static)
        val dynamicButton = findViewById<Button>(R.id.with_fragments_dynamic)
        val argsButton = findViewById<Button>(R.id.with_fragments_args)
        val twoButton = findViewById<Button>(R.id.with_fragments_two)
        val listenerButton = findViewById<Button>(R.id.with_fragments_listener)
        val backStackButton = findViewById<Button>(R.id.with_fragments_back_stack)
        staticButton.setOnClickListener {
            openNewScreen(StaticFragmentActivity::class.java)

        }
        dynamicButton.setOnClickListener{
            openNewScreen(DynamicFragmentActivity::class.java)
        }

        argsButton.setOnClickListener{
            openNewScreen(ArgsFragmentActivity::class.java)
        }

        twoButton.setOnClickListener{
            openNewScreen(TwoFragmentsActivity::class.java)
        }

        listenerButton.setOnClickListener{
            openNewScreen(ListenerActivity::class.java)
        }

        backStackButton.setOnClickListener{
            openNewScreen(BackStackActivity::class.java)
        }

    }

    private fun openNewScreen(classToOpen: Class<*>) {
        startActivity(Intent(this, classToOpen))
    }
}

