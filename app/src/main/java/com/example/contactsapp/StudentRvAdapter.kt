package com.example.contactsapp

import android.app.assist.AssistContent
import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class StudentRvAdapter(var studentList: List<Student>, var context: Context): RecyclerView.Adapter<StudentViewHolder>() {
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
        Picasso.get()
            .load(currentStudent.imageUrl)
            .resize(50,38)
            .centerCrop()
            .placeholder(R.drawable.ic_launcher_background)
            .placeholder(R.drawable.capital)
            .into(holder.ivImage)


        holder.cvContacts.setOnClickListener {
            var intent=Intent(context,contactdetailActivity::class.java)
            intent.putExtra("Name", currentStudent.name)
            intent. putExtra("PhoneNumber", currentStudent.PhoneNumber)
            intent.putExtra("Email", currentStudent.Email)
            intent.putExtra("Image", currentStudent.imageUrl)

        }

    }

    override fun getItemCount(): Int {
      return studentList.size
    }
}

class StudentViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    var tvName = itemView.findViewById<TextView>(R.id.tvName)
    var tvPhoneNumber = itemView.findViewById<TextView>(R.id.tvPhoneNumber)
    var tvEmail = itemView.findViewById<TextView>(R.id.tvEmail)
    var ivImage = itemView.findViewById<ImageView>(R.id.ivImage)
    var cvContacts=itemView.findViewById<ImageView>(R.id.cvContacts)

}