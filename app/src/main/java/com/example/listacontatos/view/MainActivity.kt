package com.example.listacontatos.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.listacontatos.R
import com.example.listacontatos.model.Contact
import com.example.listacontatos.viewmodel.ContactAdapter

class MainActivity : AppCompatActivity() {
    private val rvList: RecyclerView by lazy {
        findViewById<RecyclerView>(R.id.rv_list)
    }
    private val adapter = ContactAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bindViews()
        updateList()
    }

    private fun bindViews() {
        rvList.adapter = adapter
        rvList.layoutManager = LinearLayoutManager(this)
    }

    private fun updateList() {
        adapter.updateList(
            arrayListOf(
                Contact(
                    "Vinícius Debur",
                    "(41) 99999-9999",
                    "img.png"
                ),
                Contact(
                    "Rafael Debur",
                    "(41) 99999-9999",
                    "img.png"
                )
            )
        )
    }

    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.item_menu_1 -> {
                showToast("Exibindo item do menu 1")
                true
            }
            R.id.item_menu_2 -> {
                showToast("Exibindo item do menu 2")
                true
            }
            R.id.item_menu_3 -> {
                showToast("Exibindo item do menu 3")
                true
            }
            else -> {
                super.onOptionsItemSelected(item)
            }
        }
    }
}