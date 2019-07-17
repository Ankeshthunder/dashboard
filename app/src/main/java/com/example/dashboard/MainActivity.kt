package com.example.dashboard

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

   lateinit var  btech:Button
    lateinit var  phar:Button
    lateinit var  agr:Button
    lateinit var  hmct:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btech=findViewById(R.id.btech)
        phar=findViewById(R.id.pharma)
        agr=findViewById(R.id.agri)
        hmct=findViewById(R.id.hmct)

    }

     fun tech(view:View){
         val toast = Toast.makeText(applicationContext, "BTECH BRANCH", Toast.LENGTH_SHORT)
         toast.show()
    }

    fun phar(view: View){
        val toast = Toast.makeText(applicationContext, "PHARMACY BRANCH", Toast.LENGTH_SHORT)
        toast.show()
    }

    fun agr(view: View){
        val toast = Toast.makeText(applicationContext, " BSC AGRICULTURE", Toast.LENGTH_SHORT)
        toast.show()
    }

    fun hmt(view: View){
        val toast = Toast.makeText(applicationContext, "HOTEL MANAGEMENT", Toast.LENGTH_SHORT)
        toast.show()
    }
}
