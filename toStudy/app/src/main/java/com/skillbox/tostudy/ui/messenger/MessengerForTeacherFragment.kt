package com.skillbox.tostudy.ui.messenger

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.ColorRes
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import com.skillbox.tostudy.MessengerAdapter
import com.skillbox.tostudy.databinding.FragmentMessengerForTeacherBinding

class MessengerForTeacherFragment : Fragment() {

    private var _binding: FragmentMessengerForTeacherBinding? = null
    private val binding get() = _binding!!

    private lateinit var adapter: MessengerAdapter
    private lateinit var viewPager: ViewPager2
    private lateinit var tabLayoutMain: TabLayout
    private lateinit var tabLayoutSecond: TabLayout
    private val tabNames: Array<String> = arrayOf(
        "Ученики",
        "Родители",
        "Запросы",
    )

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMessengerForTeacherBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        adapter = MessengerAdapter(this)
        viewPager = binding.viewPagerID
        viewPager.adapter = adapter

        tabLayoutMain = binding.tabLayoutMessengerMain
        tabLayoutSecond = binding.tabLayoutMessengerSecond
        TabLayoutMediator(tabLayoutMain, viewPager) { tab, position ->
            tab.text = tabNames[position]
            if (position == 2) {
                val badge = tab.orCreateBadge
                badge.backgroundColor = Color.parseColor("#91314C")
            }
        }.attach()
        TabLayoutMediator(tabLayoutSecond, viewPager) { tab, position -> }.attach()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}