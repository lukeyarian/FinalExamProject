package com.example.finalexamproject
data class OrderItem(
    val foodItemId: String = "",
    val name: String = "",
    val quantity: Int = 1,
    val pricePerItem: Double = 0.0,
    val totalPrice: Double = 0.0
)
