package com.example.admin.fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView


class DynamicFragmentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dynamic_fragment)

        if (savedInstanceState == null) {
            supportFragmentManager
                    .beginTransaction()
            .replace(R.id.fragment_container, LevelUpFragment())
            .commit()
        }
    }


}

class LevelUpFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_level_up, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val textView = view.findViewById<TextView>(R.id.fragments_text_view)
        val button = view.findViewById<Button>(R.id.fragment_button)

        var counter = 1
        button.setOnClickListener {
            textView.text="Вы изменили текст $counter раз!"
            counter++
        }
    }
}