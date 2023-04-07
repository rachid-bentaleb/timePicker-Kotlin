package com.example.timepicker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.fragment.app.FragmentTransaction

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var manager:FragmentTransaction=supportFragmentManager.beginTransaction()
        val pop :popActivity= popActivity()
        pop.show(manager,null)

    }
    fun setDate(data:String){
        var txtView:TextView=findViewById(R.id.text_result)
        txtView.text=data
    }
}