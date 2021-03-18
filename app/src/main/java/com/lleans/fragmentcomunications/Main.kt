package com.lleans.fragmentcomunications

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*

class Main : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        view_pager.adapter = ViewPagerAdapter(this, supportFragmentManager)
        tabs.setupWithViewPager(view_pager)
    }
}