package com.mohdsohaib.viewbindingrecyclerview

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.mohdsohaib.viewbindingrecyclerview.databinding.ItemView1Binding
import com.mohdsohaib.viewbindingrecyclerview.databinding.ItemView2Binding
import kotlinx.android.synthetic.main.item_view_1.view.*

class MyAdapter(val contacts: List<contact_data>) : Adapter<ViewHolder>() {

    companion object{
        const val FIRST_VIEW = 1
        const val SECOND_VIEW = 2
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
         return when(viewType){
             FIRST_VIEW -> RecyclerViewHolderONE(ItemView1Binding.inflate(LayoutInflater.from(parent.context),parent,false))
             SECOND_VIEW -> RecyclerViewHolderSECOND(ItemView2Binding.inflate(LayoutInflater.from(parent.context),parent,false))
             else -> throw IllegalArgumentException("Invalid Item Type")
         }
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        return when(contacts[position].theItemView){
            FIRST_VIEW -> (holder as RecyclerViewHolderONE).bind(contacts[position])
            SECOND_VIEW -> (holder as RecyclerViewHolderSECOND).bind(contacts[position])
            else -> throw IllegalStateException("Invalid Item Type")
        }
    }

    override fun getItemCount(): Int {
        return contacts.size
    }

    override fun getItemViewType(position: Int): Int {
         return contacts[position].theItemView
    }

}

