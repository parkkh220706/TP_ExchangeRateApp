package com.example.tp_exchangerateapp

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import android.widget.FrameLayout
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import com.example.tp_exchangerateapp.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationBarView
import kotlinx.coroutines.selects.select

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private lateinit var boardFragment: Fragment
    private lateinit var calFragment: Fragment
    private lateinit var alarmFragment: Fragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSetting.setOnClickListener {
            val i = Intent(this@MainActivity, MainPreferenceActivity::class.java)
            startActivity(i)
        }


        boardFragment= BoardFragment()
        calFragment= CalFragment()
        alarmFragment= AlarmFragment()

        supportFragmentManager.beginTransaction().replace(R.id.fl, boardFragment).commit()

        // binding.btnSetting.setOnClickListener()




        val bottomNavigationView= findViewById(R.id.bnv) as NavigationBarView
        bottomNavigationView.setOnItemSelectedListener(
            object:NavigationBarView.OnItemSelectedListener{
                override fun onNavigationItemSelected(item: MenuItem): Boolean {
                    var selectedFragment: Fragment ?= null
                    when(item.itemId) {
                        R.id.menu_board -> selectedFragment = boardFragment
                        R.id.menu_cal -> selectedFragment = calFragment
                        R.id.menu_alarm -> selectedFragment = alarmFragment
                    }
                    selectedFragment?.let {
                        supportFragmentManager
                            .beginTransaction()
                            .replace(R.id.fl, selectedFragment)
                            .commit()
                        return true
                    }
                    return false

                }
            }
        )

    }


}