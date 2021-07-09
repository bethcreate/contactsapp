package com.example.contactsapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class StudentRvAdapter(var studentList: List<Student>): RecyclerView.Adapter<StudentViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StudentViewHolder {
        var itemView = LayoutInflater.from(parent. context)
            .inflate(R.layout.detail_list_item,parent,false)
        return StudentViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: StudentViewHolder, position: Int) {
        var currentStudent = studentList.get(position)
        holder.tvName.text = currentStudent.name
        holder.tvPhoneNumber.text = currentStudent.PhoneNumber
        holder.tvEmail.text = currentStudent.Email

    }

    override fun getItemCount(): Int {
      return studentList.size
    }
}

class StudentViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    var tvName = itemView.findViewById<TextView>(R.id.tvName)
    var tvPhoneNumber = itemView.findViewById<TextView>(R.id.tvPhoneNumber)
    var tvEmail = itemView.findViewById<TextView>(R.id.tvEmail)

}