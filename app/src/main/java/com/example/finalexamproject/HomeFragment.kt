package com.example.finalexamproject
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.finalexamproject.R
import com.example.finalexamproject.databinding.FragmentHomeBinding
import com.example.finalexamproject.Restaurant
import com.example.finalexamproject.RestaurantAdapter

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupRecentRestaurants()
        setupAllRestaurants()
    }

    private fun setupRecentRestaurants() {
        binding.recentRestaurantsRecyclerView.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        val recentRestaurantsAdapter = RestaurantAdapter(getRecentRestaurants())
        binding.recentRestaurantsRecyclerView.adapter = recentRestaurantsAdapter
    }

    private fun setupAllRestaurants() {
        binding.allRestaurantsRecyclerView.layoutManager = LinearLayoutManager(context)
        val allRestaurantsAdapter = RestaurantAdapter(getAllRestaurants())
        binding.allRestaurantsRecyclerView.adapter = allRestaurantsAdapter
    }

    private fun getRecentRestaurants(): List<Restaurant> {
        return listOf()
        //
    }

    private fun getAllRestaurants(): List<Restaurant> {
        return listOf()
        //
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}