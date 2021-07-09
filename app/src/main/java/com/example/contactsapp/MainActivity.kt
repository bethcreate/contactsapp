package com.example.contactsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var rvStudent: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        studentInfo()

    }
    fun studentInfo(){
        var studentList= listOf<Student>(
            Student("Beth", "743442637", "kamaub@gmail.com"),
            Student("Daisi", "743442645", "daisi@gmail.com"),
            Student("Anna", "743645890", "anna@gmail.com"),
            Student("Mercy", "743439637", "mercy@gmail.com")
        )
        rvStudent = findViewById(R.id.rvStudent)
        var studentAdapter = StudentRvAdapter(studentList)
        rvStudent.layoutManager = LinearLayoutManager(baseContext)
        rvStudent.adapter = studentAdapter
    }

}