package com.skillbox.tostudy.ui.statistics

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.skillbox.tostudy.databinding.FragmentStatisticsForTeacherBinding

class StatisticsForTeacherFragment : Fragment() {

    private var _binding: FragmentStatisticsForTeacherBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val statisticsViewModel =
            ViewModelProvider(this).get(StatisticsForTeacherViewModel::class.java)

        _binding = FragmentStatisticsForTeacherBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textTimetable
        statisticsViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}