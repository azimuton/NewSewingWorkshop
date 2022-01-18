package com.example.newsewingworkshop.fragments.templates

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class PagesAdapter( val pages : ArrayList<Page>,  val fragmentManager : FragmentManager)
    : FragmentPagerAdapter(fragmentManager){
    override fun getCount(): Int {
        return pages.size
    }

    override fun getItem(position: Int): Fragment {
        return  PagesFragment.newInstance("a", "aa", pages[position].image)
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return "Title $position"
    }
}