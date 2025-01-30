package com.example.tablayout

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

class myViewAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle) :
    FragmentStateAdapter(fragmentManager, lifecycle) {

    // Define how many pages you have in the ViewPager2
    override fun getItemCount(): Int {
        return 3  // 3 tabs (for First, Second, Third)
    }

    // Create the fragment for a given position
    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> FirstFragment()  // Fragment for the first tab
            1 -> SecondFragment()  // Fragment for the second tab
            2 -> ThirdFragment()  // Fragment for the third tab
            else -> FirstFragment() // Default to the first fragment
        }
    }
}
