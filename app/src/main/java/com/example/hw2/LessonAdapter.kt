package com.example.hw2

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.annotation.NonNull
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.hw2.databinding.ItemLessonBinding

class LessonAdapter(private val data: MutableList<Lesson>) :
    RecyclerView.Adapter<LessonAdapter.LessonViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LessonViewHolder {
        return LessonViewHolder(
            ItemLessonBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )

    }

    override fun onBindViewHolder(holder: LessonViewHolder, position: Int) {
        holder.bind(data[position])
    }

    override fun getItemCount(): Int = data.size

    inner class LessonViewHolder(private val binding: ItemLessonBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(lesson: Lesson) {
            binding.nameLesson.text = lesson.name
            Glide.with(binding.imageLesson).load(lesson.image).into(binding.imageLesson)

            lesson.color?.let { binding?.parent.setBackgroundColor(itemView.context.getColor(it)) }
        }
    }
}