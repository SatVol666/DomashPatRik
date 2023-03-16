package com.example.domashpatrik

import android.content.Context.MODE_PRIVATE
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment

const val SAVE_LOAD = "saveText"

class SaveFragment : Fragment(R.layout.fragment_save) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val sharedPreferences = view.context.getSharedPreferences("kkk",MODE_PRIVATE)

        val textSave = view.findViewById<EditText>(R.id.save_text)

        val buttonInput = view.findViewById<Button>(R.id.input_button)

        val inputText = view.findViewById<TextView>(R.id.input_text)


        inputText.text = sharedPreferences.getString(SAVE_LOAD,"")

        buttonInput.setOnClickListener{
            sharedPreferences.edit().putString(SAVE_LOAD,textSave.text.toString()).apply()
        }
    }
}