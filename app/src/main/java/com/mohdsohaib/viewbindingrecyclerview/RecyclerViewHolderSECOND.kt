package com.mohdsohaib.viewbindingrecyclerview

import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.mohdsohaib.viewbindingrecyclerview.databinding.ItemView2Binding

class RecyclerViewHolderSECOND(private val binding: ItemView2Binding) : ViewHolder(binding.root) {

    fun bind(contactData: contact_data){
         binding.contactOccupation.text = contactData.occupation
    }
}