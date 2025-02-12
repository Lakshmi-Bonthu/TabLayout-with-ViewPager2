
package com.example.tablayout

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    lateinit var tab_layout: TabLayout
    lateinit var view: ViewPager2
    lateinit var adapter: myViewAdapter  // Corrected: Changed type to myViewAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tab_layout = findViewById(R.id.tab_layout)
        view = findViewById(R.id.view)

        // setting viewpager to adapter
        adapter = myViewAdapter(supportFragmentManager, lifecycle)
        view.adapter = adapter

        // TabLayoutMediator connects the TabLayout with ViewPager2
        TabLayoutMediator(tab_layout, view) { tab, position ->
            when (position) {
                0 -> {
                    tab.text = "First"
                }
                1 -> {
                    tab.text = "Second"
                }
                2 -> {
                    tab.text = "Third"
                }
            }
        }.attach()
    }
}
