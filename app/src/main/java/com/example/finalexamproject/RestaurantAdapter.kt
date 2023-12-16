package com.example.finalexamproject

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.finalexamproject.databinding.ItemRestaurantBinding
import com.example.finalexamproject.Restaurant

class RestaurantAdapter(private val restaurants: List<Restaurant>) : RecyclerView.Adapter<RestaurantAdapter.RestaurantViewHolder>() {

    class RestaurantViewHolder(val binding: ItemRestaurantBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RestaurantViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = ItemRestaurantBinding.inflate(layoutInflater, parent, false)
        return RestaurantViewHolder(binding)
    }

    override fun onBindViewHolder(holder: RestaurantViewHolder, position: Int) {
        val restaurant = restaurants[position]
        holder.binding.textRestaurantName.text = restaurant.name
    }

    override fun getItemCount(): Int = restaurants.size
}