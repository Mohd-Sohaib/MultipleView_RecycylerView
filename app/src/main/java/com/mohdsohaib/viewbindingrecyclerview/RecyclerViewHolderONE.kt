package com.mohdsohaib.viewbindingrecyclerview

import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.mohdsohaib.viewbindingrecyclerview.databinding.ItemView1Binding

class RecyclerViewHolderONE(private val binding: ItemView1Binding) : ViewHolder(binding.root) {

    fun bind(contactData: contact_data){
        binding.contactName.text = contactData.name
        binding.contactNumber.text = contactData.number.toString()
    }
}