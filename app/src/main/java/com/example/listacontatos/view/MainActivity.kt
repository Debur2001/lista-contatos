package com.example.listacontatos.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
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
}