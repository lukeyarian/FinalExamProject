package com.example.finalexamproject

import androidx.lifecycle.ViewModel
import com.example.finalexamproject.Order
import com.example.finalexamproject.FirebaseUtil

class OrderViewModel : ViewModel() {

    fun placeOrder(order: Order, onSuccess: () -> Unit, onFailure: (Exception) -> Unit) {
        FirebaseUtil.firestore.collection("orders").add(order).addOnSuccessListener {
                onSuccess()
            }.addOnFailureListener { e ->
                onFailure(e)
            }
    }

    fun fetchOrdersForUser(userId: String, onSuccess: (List<Order>) -> Unit, onFailure: (Exception) -> Unit) {
        FirebaseUtil.firestore.collection("orders").whereEqualTo("userId", userId).get()
            .addOnSuccessListener { documents ->
                val orders = documents.toObjects(Order::class.java)
                onSuccess(orders)
            }.addOnFailureListener { e ->
                onFailure(e)
            }
    }
}