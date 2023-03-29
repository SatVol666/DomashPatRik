package com.example.domashpatrik

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ListFragment : Fragment(R.layout.fragment_list){
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val buttonSave = view.findViewById<Button>(R.id.button_save)

        val edText = view.findViewById<EditText>(R.id.saved_text)

        val listDel : RecyclerView = view.findViewById(R.id.list_del)

        val listItemDel = arrayListOf<ListIteam>()

        val adapter = ListAdapter(listItemDel)

        listDel.adapter = adapter
        listDel.layoutManager = LinearLayoutManager(view.context)





        buttonSave.setOnClickListener{
            val listItems: ListIteam = ListIteam(edText.text.toString())
            adapter.addItem(listItems)
        }

    }
}