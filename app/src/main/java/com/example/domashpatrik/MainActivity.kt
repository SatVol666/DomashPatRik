package com.example.domashpatrik

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonNavigate = findViewById<BottomNavigationView>(R.id.bottom_navigation)

        buttonNavigate.setOnItemSelectedListener { item ->
            when(item.itemId){
                R.id.page_list -> {
                    supportFragmentManager.commit {
                        replace<ListFragment>(R.id.container)
                    }
                    true
                }
                R.id.page_save -> {
                    supportFragmentManager.commit {
                    replace<SaveFragment>(R.id.container)
                }
                    true
                }
                else -> false
            }
        }

    }
}