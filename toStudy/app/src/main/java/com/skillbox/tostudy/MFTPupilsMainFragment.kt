package com.skillbox.tostudy

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.skillbox.tostudy.databinding.FragmentMFTPupilsMainBinding

private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

const val ARG_OBJECT = "object"

/**
 * A simple [Fragment] subclass.
 * Use the [MFTPupilsMainFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class MFTPupilsMainFragment : Fragment() {
    private var _binding: FragmentMFTPupilsMainBinding? = null
    private val binding get() = _binding!!

    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMFTPupilsMainBinding.inflate(inflater, container, false)
        binding.customMessengerLine.setIcon(R.drawable.ic_help_18)
        binding.customMessengerLine.setName("Фомина Алина")
        binding.customMessengerLine.setTime("13:00")
        binding.customMessengerLine.setMessage("Спасибо вам")

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment MFTPupilsMainFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            MFTPupilsMainFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}