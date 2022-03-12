package com.example.listacontatos.viewmodel

import com.example.listacontatos.model.Contact

interface ClickItemContactListener {
    fun clickItemContact(contact: Contact)
}