package com.example.finalexamproject

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.finalexamproject.databinding.ItemFoodBinding
import com.example.finalexamproject.FoodItem

class FoodItemAdapter(private val foodItems: List<FoodItem>) : RecyclerView.Adapter<FoodItemAdapter.FoodItemViewHolder>() {

    class FoodItemViewHolder(val binding: ItemFoodBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodItemViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = ItemFoodBinding.inflate(layoutInflater, parent, false)
        return FoodItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: FoodItemViewHolder, position: Int) {
        val foodItem = foodItems[position]
        holder.binding.textFoodName.text = foodItem.name
    }

    override fun getItemCount(): Int = foodItems.size
}