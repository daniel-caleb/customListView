package com.example.customlistview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var listView= findViewById<ListView>(R.id.listView)
        var list= mutableListOf<Model>()


        //adding images
        list.add(Model("Audi","A German Luxury in itself",R.drawable.audi))
        list.add(Model("Mercedes Benz","A German Luxury in itself",R.drawable.benz))
        list.add(Model("BMW","A German Luxury in itself",R.drawable.bmw))
        list.add(Model("Range Rover","A Land Rover Luxury in itself",R.drawable.range))
        list.add(Model("Jaguar","A German Luxury in itself",R.drawable.jaguar))
        list.add(Model("Subaru WSR S4","A Japanese Luxury in itself",R.drawable.subaru))
        list.add(Model("Lamborghini Urus","An Italian Luxury SUV in itself",R.drawable.lambo))
        list.add(Model("Ford Raptor","An American Luxury in itself",R.drawable.ford))
        list.add(Model("Aston Martin","A British Luxury Sports Car in itself",R.drawable.aston))

        listView.adapter=MyAdapter(this,R.layout.row,list)

        listView.setOnItemClickListener { parent:AdapterView<*>, view:View, position:Int, id:Long ->

            if (position==0){
                Toast.makeText(this@MainActivity,"You have clicked on Facecebook!",Toast.LENGTH_LONG).show()

            }
            if (position==1){
                Toast.makeText(this@MainActivity,"You have clicked on Whatsapp!",Toast.LENGTH_LONG).show()

            }
            if (position==2){
                Toast.makeText(this@MainActivity,"You have clicked on Youtube!",Toast.LENGTH_LONG).show()

            }
            if (position==3){
                Toast.makeText(this@MainActivity,"You have clicked on Instagram!",Toast.LENGTH_LONG).show()

            }
            if (position==4){
                Toast.makeText(this@MainActivity,"You have clicked on Twitter!",Toast.LENGTH_LONG).show()

            }



        }
    }
}