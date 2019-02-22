package com.daya.bottom.navigation.sample

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottom_nav_view.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.action_home -> {
                    Log.d(TAG, "Home menu selected.")
                }
                R.id.action_billing -> {
                    Log.d(TAG, "Billing menu selected.")
                }
                R.id.action_service -> {
                    Log.d(TAG, "Service menu selected.")
                }
                R.id.action_customer_center -> {
                    Log.d(TAG, "Customer center menu selected.")
                }
                R.id.action_settings -> {
                    Log.d(TAG, "Settings menu selected.")
                }
                else -> {
                    Log.d(TAG, "Unknown menu item(${item.itemId})")
                }
            }
            return@setOnNavigationItemSelectedListener true
        }

        bottom_nav_view.setOnNavigationItemReselectedListener { item ->
            when (item.itemId) {
                R.id.action_home -> {
                    Log.d(TAG, "Home menu reselected.")
                }
                R.id.action_billing -> {
                    Log.d(TAG, "Billing menu reselected.")
                }
                R.id.action_service -> {
                    Log.d(TAG, "Service menu reselected.")
                }
                R.id.action_customer_center -> {
                    Log.d(TAG, "Customer center menu reselected.")
                }
                R.id.action_settings -> {
                    Log.d(TAG, "Settings menu reselected.")
                }
                else -> {
                    Log.d(TAG, "Unknown menu item(${item.itemId})")
                }
            }
        }

        bottom_nav_view.selectedItemId = R.id.action_billing
    }

    companion object {
        const val TAG = "BottomNavigation"
    }
}
