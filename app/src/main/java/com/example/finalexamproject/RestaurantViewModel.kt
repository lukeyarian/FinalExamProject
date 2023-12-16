package com.example.finalexamproject

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.finalexamproject.Restaurant
import com.example.finalexamproject.FirebaseUtil

class RestaurantViewModel : ViewModel() {
    private val _restaurants = MutableLiveData<List<Restaurant>>()
    val restaurants: LiveData<List<Restaurant>> = _restaurants

    fun fetchRestaurants() {
        FirebaseUtil.firestore.collection("restaurants").get().addOnSuccessListener { documents ->
            val restaurantList = documents.toObjects(Restaurant::class.java)
            _restaurants.value = restaurantList
            }.addOnFailureListener {
                _restaurants.value = listOf()
            }
    }
}