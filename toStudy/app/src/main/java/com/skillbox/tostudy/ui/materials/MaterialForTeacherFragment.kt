package com.skillbox.tostudy.ui.materials

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.skillbox.tostudy.databinding.FragmentMaterialForTeacherBinding

class MaterialForTeacherFragment : Fragment() {

    private var _binding: FragmentMaterialForTeacherBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val materialViewModel =
            ViewModelProvider(this).get(MaterialForTeacherViewModel::class.java)

        _binding = FragmentMaterialForTeacherBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textMaterial
        materialViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}