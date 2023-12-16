package com.example.finalexamproject
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.finalexamproject.CheckoutItemAdapter
import com.example.finalexamproject.databinding.FragmentCheckoutBinding
import com.example.finalexamproject.OrderItem

class CheckoutFragment : Fragment() {

    private var _binding: FragmentCheckoutBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        _binding = FragmentCheckoutBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupOrderItemsList()
    }

    private fun setupOrderItemsList() {
        binding.orderItemsRecyclerView.layoutManager = LinearLayoutManager(context)
        val checkoutItemAdapter = CheckoutItemAdapter(getOrderItems())
        binding.orderItemsRecyclerView.adapter = checkoutItemAdapter
    }

    private fun getOrderItems(): List<OrderItem> {
        return listOf()
        //
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}