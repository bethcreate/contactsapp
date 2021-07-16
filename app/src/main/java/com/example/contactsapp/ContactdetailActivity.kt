package com.example.contactsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.squareup.picasso.Picasso

class contactdetailActivity : AppCompatActivity() {
    lateinit var tvName:TextView
    lateinit var tvEmail:TextView
    lateinit var tvPhoneNumber:TextView
    lateinit var ivContacts:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contactdetail)
        var name =intent.getStringExtra("Name")
        var tvname=findViewById<TextView>(R.id.tvName)
        var tvEmail = findViewById<TextView>(R.id.tvEmail)
        var tvPhoneNumber= findViewById<TextView>(R.id.tvPhoneNumber)
        Toast.makeText(baseContext,name,Toast.LENGTH_LONG).show()


        var nameintent = intent.getStringExtra("name")
        var PhoneNUmberintent=intent.getStringExtra("PhoneNumber")
        var Emailintent=intent.getStringExtra("Email")
        var imageIntent=intent.getStringExtra("image").toString()
        Picasso.get()
            .load(imageIntent)
            .into(ivContacts)


        tvname.text=nameintent
        tvEmail.text=Emailintent
        tvPhoneNumber.text=PhoneNUmberintent

    }
}