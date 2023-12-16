package com.example.finalexamproject

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.finalexamproject.databinding.ItemCheckoutBinding
import com.example.finalexamproject.OrderItem

class CheckoutItemAdapter(private val orderItems: List<OrderItem>) : RecyclerView.Adapter<CheckoutItemAdapter.CheckoutItemViewHolder>() {

    class CheckoutItemViewHolder(val binding: ItemCheckoutBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CheckoutItemViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = ItemCheckoutBinding.inflate(layoutInflater, parent, false)
        return CheckoutItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CheckoutItemViewHolder, position: Int) {
        val orderItem = orderItems[position]
        holder.binding.textFoodName.text = orderItem.name
    }

    override fun getItemCount(): Int = orderItems.size
}
