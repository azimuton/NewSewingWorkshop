package com.example.newsewingworkshop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import com.example.newsewingworkshop.fragments.defekti.*
import com.example.newsewingworkshop.fragments.manuals.MerkiFragment
import kotlinx.android.synthetic.main.activity_defekti.*
import kotlinx.android.synthetic.main.activity_manual.*

class DefektiActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_defekti)

        btKlasifikacia.setOnClickListener {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.flDefekti, KlasifikaciaFragment.newInstance("a", "aa"))
                .commit()
            val animation: Animation = AnimationUtils.loadAnimation(this, R.anim.alfaperehod)
            flDefekti.startAnimation(animation)
        }
        btNetochnosti.setOnClickListener {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.flDefekti, NetochnostiFragment.newInstance("a", "aa"))
                .commit()
            val animation: Animation = AnimationUtils.loadAnimation(this, R.anim.alfaperehod)
            flDefekti.startAnimation(animation)
        }
        btPlechi.setOnClickListener {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.flDefekti, PlechiFragment.newInstance("a", "aa"))
                .commit()
            val animation: Animation = AnimationUtils.loadAnimation(this, R.anim.alfaperehod)
            flDefekti.startAnimation(animation)
        }
        btFigura.setOnClickListener {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.flDefekti, FiguraFragment.newInstance("a", "aa"))
                .commit()
            val animation: Animation = AnimationUtils.loadAnimation(this, R.anim.alfaperehod)
            flDefekti.startAnimation(animation)
        }
        btUstranenie.setOnClickListener {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.flDefekti, UstranenieFragment.newInstance("a", "aa"))
                .commit()
            val animation: Animation = AnimationUtils.loadAnimation(this, R.anim.alfaperehod)
            flDefekti.startAnimation(animation)
        }
    }
    override fun onBackPressed() {
        super.onBackPressed()
        val intent = Intent(this, ManualActivity::class.java)
        startActivity(intent)
        overridePendingTransition(0, R.anim.open_activity)
        finish()
    }
}