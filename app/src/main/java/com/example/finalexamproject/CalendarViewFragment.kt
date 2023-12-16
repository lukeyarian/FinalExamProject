package com.example.finalexamproject

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CalendarView
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.finalexamproject.databinding.FragmentCalendarViewBinding
import java.text.SimpleDateFormat
import java.util.*

class CalendarViewFragment : Fragment() {

    private var _binding: FragmentCalendarViewBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        _binding = FragmentCalendarViewBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.calendarView.setOnDateChangeListener { calendarView, year, month, dayOfMonth ->
            val date = Calendar.getInstance()
            date.set(year, month, dayOfMonth)
            val formattedDate = SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(date.time)
            Toast.makeText(context, "Selected date: $formattedDate", Toast.LENGTH_SHORT).show()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}