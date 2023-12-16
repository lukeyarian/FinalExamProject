package com.example.finalexamproject
import java.util.Date

data class Order(
    val id: String = "",
    val userId: String = "",
    val orderItems: List<OrderItem> = listOf(),
    val totalAmount: Double = 0.0,
    val orderDate: Date = Date(),
    val deliveryAddress: String = "",
    val specialInstructions: String = "",
    val status: String = "Pending"
)
