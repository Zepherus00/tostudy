package com.skillbox.tostudy

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.skillbox.tostudy.ui.messenger.MessengerForTeacherFragment

class MessengerAdapter(fragment: MessengerForTeacherFragment) : FragmentStateAdapter(fragment) {
    override fun getItemCount(): Int = 3

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> MFTPupilsMainFragment()
            1 -> MFTParentsMainFragment()
            else -> MFTRequestsMainFragment()
        }
    }

}