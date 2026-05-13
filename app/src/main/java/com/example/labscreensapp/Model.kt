package com.example.labscreensapp

data class Item(val id: Int, val title: String, val description: String)

val sampleItems = List(20) { i ->
    Item(i, "Елемент $i", "Це опис для елемента $i")
}
