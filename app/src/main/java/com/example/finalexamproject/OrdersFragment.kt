package com.example.finalexamproject

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.finalexamproject.OrderAdapter
import com.example.finalexamproject.databinding.FragmentOrdersBinding
import com.example.finalexamproject.Order

class OrdersFragment : Fragment() {

    private var _binding: FragmentOrdersBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        _binding = FragmentOrdersBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupOrdersList()
    }

    private fun setupOrdersList() {
        binding.ordersRecyclerView.layoutManager = LinearLayoutManager(context)
        val ordersAdapter = OrderAdapter(getOrders())
        binding.ordersRecyclerView.adapter = ordersAdapter
    }

    private fun getOrders(): List<Order> {
        return listOf()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}