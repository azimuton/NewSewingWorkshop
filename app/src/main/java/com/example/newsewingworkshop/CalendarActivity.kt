package com.example.newsewingworkshop

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_calendar.*

class CalendarActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calendar)

        val sharedPreference = getSharedPreferences("SHARED_PREFS", Context.MODE_PRIVATE)
        val name = sharedPreference.getString("222", "")
        etCalendarNote.setText(name)

    }
    private  fun save(){
        val sharedPreference = getSharedPreferences("SHARED_PREFS", Context.MODE_PRIVATE)
        val editor = sharedPreference.edit()
        editor.putString("222", etCalendarNote.text.toString())
        editor.apply()
    }

    override fun onDestroy() {
        super.onDestroy()
        save()
    }
    override fun onBackPressed() {
        super.onBackPressed()
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        overridePendingTransition(0, R.anim.open_activity)
        finish()
    }
}