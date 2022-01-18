package com.example.newsewingworkshop

import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.newsewingworkshop.fragments.templates.Page
import com.example.newsewingworkshop.fragments.templates.PagesAdapter
import kotlinx.android.synthetic.main.activity_tamplates.*

class TamplatesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tamplates)

        val pages = arrayListOf<Page>(

            Page(BitmapFactory.decodeResource(resources, R.drawable.photo1)),
            Page(BitmapFactory.decodeResource(resources, R.drawable.photo2)),
            Page(BitmapFactory.decodeResource(resources, R.drawable.photo3)),
            Page(BitmapFactory.decodeResource(resources, R.drawable.photo4)),
            Page(BitmapFactory.decodeResource(resources, R.drawable.photo5)),
            Page(BitmapFactory.decodeResource(resources, R.drawable.photo7)),
            Page(BitmapFactory.decodeResource(resources, R.drawable.photo9)),
            Page(BitmapFactory.decodeResource(resources, R.drawable.photo11)),
            Page(BitmapFactory.decodeResource(resources, R.drawable.photo12)),
            Page(BitmapFactory.decodeResource(resources, R.drawable.photo13)),
            Page(BitmapFactory.decodeResource(resources, R.drawable.photo14)),
            Page(BitmapFactory.decodeResource(resources, R.drawable.photo15)),
            Page(BitmapFactory.decodeResource(resources, R.drawable.photo16)),
            Page(BitmapFactory.decodeResource(resources, R.drawable.photo17)),
            Page(BitmapFactory.decodeResource(resources, R.drawable.photo18)),
            Page(BitmapFactory.decodeResource(resources, R.drawable.photo19)),
            Page(BitmapFactory.decodeResource(resources, R.drawable.photo20)),
            Page(BitmapFactory.decodeResource(resources, R.drawable.photo21)),
            Page(BitmapFactory.decodeResource(resources, R.drawable.photo22)),
            Page(BitmapFactory.decodeResource(resources, R.drawable.photo23)),
            Page(BitmapFactory.decodeResource(resources, R.drawable.photo25)),
            Page(BitmapFactory.decodeResource(resources, R.drawable.photo26)),
            Page(BitmapFactory.decodeResource(resources, R.drawable.photo27)),
            Page(BitmapFactory.decodeResource(resources, R.drawable.photo28)),
            Page(BitmapFactory.decodeResource(resources, R.drawable.photo29)),
            Page(BitmapFactory.decodeResource(resources, R.drawable.photo30)),

            )

        vpViewPager.adapter = PagesAdapter(pages,supportFragmentManager)
    }
}