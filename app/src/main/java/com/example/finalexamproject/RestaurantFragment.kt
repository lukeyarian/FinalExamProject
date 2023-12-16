package com.example.finalexamproject

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.finalexamproject.FoodItemAdapter
import com.example.finalexamproject.databinding.FragmentRestaurantBinding
import com.example.finalexamproject.FoodItem

class RestaurantFragment : Fragment() {

    private var _binding: FragmentRestaurantBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        _binding = FragmentRestaurantBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupFoodItemsList()
    }

    private fun setupFoodItemsList() {
        binding.foodItemsRecyclerView.layoutManager = LinearLayoutManager(context)
        val foodItemsAdapter = FoodItemAdapter(getFoodItems())
        binding.foodItemsRecyclerView.adapter = foodItemsAdapter
    }

    private fun getFoodItems(): List<FoodItem> {
        return listOf(/* ... */)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}