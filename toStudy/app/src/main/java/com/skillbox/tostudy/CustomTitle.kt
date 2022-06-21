package com.skillbox.tostudy

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.constraintlayout.widget.ConstraintLayout
import com.skillbox.tostudy.databinding.CustomTitleBinding

class CustomTitle @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : ConstraintLayout(context, attrs, defStyleAttr) {
    val binding = CustomTitleBinding.inflate(LayoutInflater.from(context))

    init {
        addView(binding.root)
    }

    fun setText(text: String) {
        binding.line1.text = text
    }
}