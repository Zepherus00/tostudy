package com.skillbox.tostudy

import android.content.Context
import android.graphics.Color
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import androidx.constraintlayout.widget.ConstraintLayout
import com.skillbox.tostudy.databinding.CustomMessengerButtonBinding

class CustomMessengerButton @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : ConstraintLayout(context, attrs, defStyleAttr) {
    val binding = CustomMessengerButtonBinding.inflate(LayoutInflater.from(context))

    init {
        addView(binding.root)
    }

    fun setIcon(image: Int) {
        binding.circleImage.setImageResource(image)
    }

    fun setName(text: String) {
        binding.textName.text = text
    }

    fun setTime(time: String) {
        binding.textTime.text = time
    }

    fun setMessage(message: String) {
        binding.textMessage.text = message
    }

    fun setCountMessage(count: Int) {
        binding.countMessage.text = count.toString()
    }

    fun visibleCount() {
        binding.countMessage.visibility = View.VISIBLE
    }

    fun invisibleCount() {
        binding.countMessage.visibility = View.GONE
    }

    fun newMessage() {
        binding.textMessage.background
    }

    fun unreadMessage() {
        binding.messageBackground.visibility = View.VISIBLE
        binding.textMessage.setTextColor(Color.parseColor("#FFFBFB"))
    }

    fun readMessage() {
        binding.messageBackground.visibility = View.GONE
        binding.textMessage.setTextColor(Color.parseColor("#1B1C2A"))
    }
}