package com.exitedcode.superadapter.demo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentStatePagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private val mPagerAdapter: FragmentStatePagerAdapter = object : FragmentStatePagerAdapter(supportFragmentManager) {
        override fun getItem(position: Int): Fragment {
            return when (position) {
                0 -> { NormalFragment() }
                1 -> { DatabindingFragment()}
                2 -> {MultiTypeDatabindingFragment()}
                else -> {NormalFragment()}
            }
        }

        override fun getPageTitle(position: Int): CharSequence? {
            var title = " "
            when (position) {
                0 -> title = "normal"
                1 -> title = "databinding"
                2 -> title = "multiType"
            }
            return title
        }

        override fun getCount(): Int {
            return 3
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewpager.adapter = mPagerAdapter
        tablayout.setupWithViewPager(viewpager)
    }
}