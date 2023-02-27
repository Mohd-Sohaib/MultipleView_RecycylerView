package com.mohdsohaib.viewbindingrecyclerview

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import kotlinx.android.synthetic.main.item_view.view.*

class MyAdapter(val contacts: List<contact>) : Adapter<MyAdapter.MyViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.item_view, parent,false)
        return MyViewHolder(view)
    }
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.itemView.contact_name.text = contacts[position].name
        holder.itemView.contact_number.text = contacts[position].number.toString()
        var color = "#808080"
        if(position%2==0){
            color = "#C0C0C0"
        }
        holder.itemView.container.setBackgroundColor(Color.parseColor(color))
    }

    override fun getItemCount(): Int {
        return contacts.size
    }

    class MyViewHolder(itemView: View) : ViewHolder(itemView) {
    }
}

