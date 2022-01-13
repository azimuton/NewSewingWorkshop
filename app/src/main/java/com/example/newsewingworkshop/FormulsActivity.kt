package com.example.newsewingworkshop

import android.content.ClipData
import android.os.Bundle
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import com.example.newsewingworkshop.fragments.formuls.EmptyFragment
import com.example.newsewingworkshop.fragments.formuls.KlinFragment
import com.example.newsewingworkshop.fragments.formuls.KolokolFragment
import com.example.newsewingworkshop.fragments.formuls.SolnceFragment
import kotlinx.android.synthetic.main.activity_formuls.*

class MainActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_formuls)


        spinnerFormuls.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View,
                position: Int,
                id: Long
            ) {
                when (position) {
                    0 ->{ supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.flFormuls, EmptyFragment.newInstance("a", "aa"))
                        .commit()
                        animate()}
                    1 -> { supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.flFormuls, SolnceFragment.newInstance("a", "aa"))
                        .commit()
                        animate()}
                    2 -> { supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.flFormuls, KolokolFragment.newInstance("a", "aa"))
                        .commit()
                        animate()}
                    3 -> {supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.flFormuls, KlinFragment.newInstance("a", "aa"))
                        .commit()
                        animate()
                    }
                }
            }
            override fun onNothingSelected(parent: AdapterView<*>?) {
                // can leave this empty
            }
        }
    }

    fun animate(){
        val sunRiseAnimation: Animation = AnimationUtils.loadAnimation(this, R.anim.alfaperehod)
        flFormuls.startAnimation(sunRiseAnimation)
    }
//    override fun onResume() {
//        super.onResume()
//        val formuls = resources.getStringArray(R.array.formuls)
//        val arrayAdapter = ArrayAdapter(this, R.layout.dropdown_item, formuls)
//        tietSpin.setAdapter(arrayAdapter)
//
//        tietSpin.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
//            override fun onItemSelected(parent: AdapterView<*>?, view: View, position: Int, id: Long) {
//                when (position) {
//                    0 -> supportFragmentManager
//                        .beginTransaction()
//                        .replace(R.id.flFormuls, EmptyFragment.newInstance("a", "aa"))
//                        .commit()
//                    1 -> supportFragmentManager
//                        .beginTransaction()
//                        .replace(R.id.flFormuls, SolnceFragment.newInstance("a", "aa"))
//                        .commit()
//                    2 -> supportFragmentManager
//                        .beginTransaction()
//                        .replace(R.id.flFormuls, KolokolFragment.newInstance("a", "aa"))
//                        .commit()
//                }
//            }
//            override fun onNothingSelected(parent: AdapterView<*>?) {
//                // can leave this empty
//            }
//        }
//    }



}

