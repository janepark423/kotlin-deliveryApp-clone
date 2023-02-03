package com.example.app_comins

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import androidx.viewpager.widget.PagerAdapter
import androidx.viewpager.widget.LayoutInflater

class ViewPagerAdapter(private  val context : Context) : PagerAdapter(){

    private var layoutInflater : LayoutInflater? =null

    val Image = arrayOf()


    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        TODO("Not yet implemented")
    }

    override fun getCount(): Int {
        TODO("Not yet implemented")
    }
}