package com.skillbox.tostudy.ui.timetable

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.skillbox.tostudy.databinding.FragmentTimetableForTeacherBinding

class TimetableForTeacherFragment : Fragment() {

    private var _binding: FragmentTimetableForTeacherBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val timetableViewModel =
            ViewModelProvider(this).get(TimetableForTeacherViewModel::class.java)

        _binding = FragmentTimetableForTeacherBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textTimetable
        timetableViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}