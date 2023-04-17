package com.elon.simplelistview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val mylistview=findViewById<ListView>(R.id.Listview)
        val names= arrayOf("Ukraine","Russia","China","Japan","Kenya")
        val myarrayadapter:ArrayAdapter<String> = ArrayAdapter(this,android.R.layout.simple_list_item_1,names)
        mylistview.adapter=myarrayadapter

        mylistview.setOnItemClickListener { adapterView, view, Position, l ->
            Toast.makeText(this,"youve clicked on me"+names[Position],Toast.LENGTH_LONG).show()

        }
    }
}