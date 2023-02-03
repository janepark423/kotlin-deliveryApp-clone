package com.example.app_comins

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter


class GridviewAdapter(val context:Context, val img_list: Array<Int>, val text_list: Array<String>) :BaseAdapter(){
    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        TODO("Not yet implemented")
    }

    override fun getItem(p0: Int): Any {
       return 0
    }


    override fun getItemId(p0: Int): Long {
        return 0
    }

    override fun getCount(): Int {
        return img_list.size
    }







}