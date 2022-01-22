package com.example.newsewingworkshop

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import com.example.newsewingworkshop.fragments.formuls.*
import kotlinx.android.synthetic.main.activity_formuls.*

class MainActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_formuls)


//        spinnerFormuls.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
//            override fun onItemSelected(
//                parent: AdapterView<*>?,
//                view: View,
//                position: Int,
//                id: Long
//            ) {
//                when (position) {
//                    0 ->{ supportFragmentManager
//                        .beginTransaction()
//                        .replace(R.id.flFormuls, EmptyFragment.newInstance("a", "aa"))
//                        .commit()
//                        animate()}
//                    1 -> { supportFragmentManager
//                        .beginTransaction()
//                        .replace(R.id.flFormuls, SolnceFragment.newInstance("a", "aa"))
//                        .commit()
//                        animate()}
//                    2 -> { supportFragmentManager
//                        .beginTransaction()
//                        .replace(R.id.flFormuls, KolokolFragment.newInstance("a", "aa"))
//                        .commit()
//                        animate()}
//                    3 -> {supportFragmentManager
//                        .beginTransaction()
//                        .replace(R.id.flFormuls, KlinFragment.newInstance("a", "aa"))
//                        .commit()
//                        animate()}
//                    4 -> {supportFragmentManager
//                        .beginTransaction()
//                        .replace(R.id.flFormuls, PoluSolnceFragment.newInstance("a", "aa"))
//                        .commit()
//                        animate()}
//                    5 -> {supportFragmentManager
//                        .beginTransaction()
//                        .replace(R.id.flFormuls, Ubka3_4SolnceFragment.newInstance("a", "aa"))
//                        .commit()
//                        animate()}
//                    6 -> {supportFragmentManager
//                        .beginTransaction()
//                        .replace(R.id.flFormuls, VitochkaFragment.newInstance("a", "aa"))
//                        .commit()
//                        animate()}
//                    7 -> {supportFragmentManager
//                        .beginTransaction()
//                        .replace(R.id.flFormuls, RastvorFragment.newInstance("a", "aa"))
//                        .commit()
//                        animate()
//                    }
//                }
//            }
//            override fun onNothingSelected(parent: AdapterView<*>?) {
//                // can leave this empty
//            }
//        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        overridePendingTransition(0, R.anim.open_activity)
        finish()
    }

    fun animate(){
        val sunRiseAnimation: Animation = AnimationUtils.loadAnimation(this, R.anim.alfaperehod)
        flFormuls.startAnimation(sunRiseAnimation)
    }
    override fun onResume() {
        super.onResume()
        val formuls = resources.getStringArray(R.array.formuls)
        val arrayAdapter = ArrayAdapter(this, R.layout.dropdown_item, formuls)
        tietSpin.setAdapter(arrayAdapter)

        tietSpin.onItemClickListener = object : AdapterView.OnItemSelectedListener,
            AdapterView.OnItemClickListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View, position: Int, id: Long) {

            }
            override fun onNothingSelected(parent: AdapterView<*>?) {
                // can leave this empty
            }

            override fun onItemClick(
                parent: AdapterView<*>?,
                view: View?,
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
                        animate()}
                    4 -> {supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.flFormuls, PoluSolnceFragment.newInstance("a", "aa"))
                        .commit()
                        animate()}
                    5 -> {supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.flFormuls, Ubka3_4SolnceFragment.newInstance("a", "aa"))
                        .commit()
                        animate()}
                    6 -> {supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.flFormuls, VitochkaFragment.newInstance("a", "aa"))
                        .commit()
                        animate()}
                    7 -> {supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.flFormuls, RastvorFragment.newInstance("a", "aa"))
                        .commit()
                        animate()
                    }
                }
            }
        }
    }



}

