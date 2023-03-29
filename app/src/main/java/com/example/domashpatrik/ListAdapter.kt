package com.example.domashpatrik

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ListAdapter(private val listItems: ArrayList<ListIteam>) :
   RecyclerView.Adapter<ListAdapter.ListViewHolder>(){

    fun addItem(listIteam: ListIteam){
        listItems.add(listIteam)
        notifyDataSetChanged()
    }



       class ListViewHolder(view: View) : RecyclerView.ViewHolder(view) {
           val textList : TextView = view.findViewById(R.id.list_text)
       }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view = LayoutInflater.from(parent.context)
        .inflate(R.layout.list_iteam,parent,false)

        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        holder.textList.text = listItems[position].text
    }

    override fun getItemCount() = listItems.size

}

