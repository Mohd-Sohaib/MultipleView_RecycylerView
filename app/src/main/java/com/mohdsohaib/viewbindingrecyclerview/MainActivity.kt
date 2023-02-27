package com.mohdsohaib.viewbindingrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val contactObjects = mutableListOf<contact>()
        contactObjects.add(contact("Mohd.Sohaib", 123456789))
        contactObjects.add(contact("Sohaib", 156456467))
        contactObjects.add(contact("Khan", 333333333))
        contactObjects.add(contact("Pathan", 1234897843))
        contactObjects.add(contact("Mohd.Sohaib", 123456789))
        contactObjects.add(contact("Sohaib", 156456467))
        contactObjects.add(contact("Khan", 333333333))
        contactObjects.add(contact("Pathan", 1234897843))
        contactObjects.add(contact("Mohd.Sohaib", 123456789))
        contactObjects.add(contact("Sohaib", 156456467))
        contactObjects.add(contact("Khan", 333333333))
        contactObjects.add(contact("Pathan", 1234897843))
        contact_list.adapter = MyAdapter(contactObjects)
        contact_list.layoutManager = LinearLayoutManager(this)

    }
}