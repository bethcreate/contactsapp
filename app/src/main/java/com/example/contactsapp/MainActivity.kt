package com.example.contactsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var rvStudent: RecyclerView
    lateinit var tvEmail:TextView
    lateinit var tvPhoneNumber:TextView
    lateinit var tvName:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        studentInfo()

    }
    fun studentInfo(){
        var studentList= listOf<Student>(
            Student("Beth", "743442637", "kamaub@gmail.com","https://images.unsplash.com/photo-1586350493574-eaa8c05005d2?ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=334&q=80"),
            Student("Daisi", "743442645", "daisi@gmail.com","https://images.unsplash.com/photo-1465821185615-20b3c2fbf41b?ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTB8fHZpb2xpbnxlbnwwfHwwfHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60"),
            Student("Anna", "743645890", "anna@gmail.com","https://images.unsplash.com/photo-1474073705359-5da2a8270c64?ixid=MnwxMjA3fDB8MHxzZWFyY2h8Mnx8Z2lybHxlbnwwfHwwfHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60"),
            Student("Mercy", "743439637", "mercy@gmail.com","https://images.unsplash.com/photo-1462804512123-465343c607ee?ixid=MnwxMjA3fDB8MHxzZWFyY2h8MjJ8fGdpcmx8ZW58MHx8MHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60")
        )
        rvStudent = findViewById(R.id.rvStudent)
        var studentAdapter = StudentRvAdapter(studentList,baseContext)

        rvStudent.layoutManager = LinearLayoutManager(baseContext)
        rvStudent.adapter = studentAdapter
    }

}