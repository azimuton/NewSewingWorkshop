package com.example.newsewingworkshop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.SearchView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.newsewingworkshop.database.AppDatabase
import com.example.newsewingworkshop.database.Field
import kotlinx.android.synthetic.main.activity_clients.*

class ClientsActivity : AppCompatActivity(), FieldAdapter.ViewHolder.ItemCallback {

    private lateinit var adapter: FieldAdapter
    lateinit var fieldDatabase: AppDatabase
    lateinit var fieldList: ArrayList<Field>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_clients)

        fieldList = ArrayList<Field>()
        fieldDatabase = AppDatabase.getDatabase(this)
        getData()
        adapter = FieldAdapter(this, fieldList, this)
        rvClients.layoutManager = LinearLayoutManager(this)
        rvClients.adapter = adapter

        fabAddNewClient.setOnClickListener {
            val intent = Intent(this, EditClientsActivity::class.java)
            startActivity(intent)
        }
        btExitApp.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }

    override fun deleteItem(index: Int) {

        val addDialog = AlertDialog.Builder(this)
        addDialog
            .setMessage("Вы действительно хотите удалить запись?")
            .setPositiveButton("Ok") { dialog, _ ->
                val field = fieldList.get(index)
                fieldDatabase.fieldDao().deleteField(field)
                getData()
                adapter.notifyDataSetChanged()
                Toast.makeText(this, "Запись удалена!", Toast.LENGTH_SHORT).show()
                dialog.dismiss()
            }
            .setNegativeButton("Отмена") { dialog, _ ->
                dialog.dismiss()
            }
            .create()
            .show()

    }

    fun getData() {
        val fieldFromDb: List<Field> = fieldDatabase.fieldDao().getAll()
        fieldList.clear()
        fieldList.addAll(fieldFromDb)
    }


    fun initSearchView(){
        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener{
            override fun onQueryTextSubmit(query: String?): Boolean {
                if (query != null) {
                    fieldDatabase.fieldDao().searchDatabase(query)
                }
                return true
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                if (newText != null) {
                    fieldDatabase.fieldDao().searchDatabase(newText)
                }
                return true
            }
        })
    }
    override fun onBackPressed() {
        super.onBackPressed()
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        overridePendingTransition(0, R.anim.open_activity)
        finish()
    }
}