package com.example.newsewingworkshop


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import com.example.newsewingworkshop.fragments.manuals.MerkiFragment
import com.example.newsewingworkshop.fragments.manuals.PribavkiFragment
import com.example.newsewingworkshop.fragments.manuals.RashodTkaneyFragment
import kotlinx.android.synthetic.main.activity_manual.*


class ManualActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_manual)

        btMerki.setOnClickListener {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.flManual, MerkiFragment.newInstance("a", "aa"))
                .commit()
                val animation: Animation = AnimationUtils.loadAnimation(this, R.anim.alfaperehod)
                flManual.startAnimation(animation)
        }
        btRashodTkaney.setOnClickListener {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.flManual, RashodTkaneyFragment.newInstance("a", "aa"))
                .commit()
            val animation: Animation = AnimationUtils.loadAnimation(this, R.anim.alfaperehod)
            flManual.startAnimation(animation)
        }
        btPribavki.setOnClickListener {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.flManual, PribavkiFragment.newInstance("a", "aa"))
                .commit()
            val animation: Animation = AnimationUtils.loadAnimation(this, R.anim.alfaperehod)
            flManual.startAnimation(animation)
        }
        btDefekti.setOnClickListener {
            val intent = Intent(this, DefektiActivity::class.java)
            startActivity(intent)
            overridePendingTransition(0, R.anim.open_activity)
            finish()
        }

//    val animation: Animation = AnimationUtils.loadAnimation(this, R.anim.gotofulllight)
//    button7.startAnimation(animation)
//    button7.animate().translationX(500f)
//    button7.animate().duration = 1000
//    button7.animate().alpha(1f)

}

    override fun onBackPressed() {
        super.onBackPressed()
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        overridePendingTransition(0, R.anim.open_activity)
        finish()
    }
    }
