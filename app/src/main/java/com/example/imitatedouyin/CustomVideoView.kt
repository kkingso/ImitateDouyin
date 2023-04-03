package com.example.imitatedouyin

import android.content.Context
import android.util.AttributeSet
import android.widget.VideoView

/**
 * 自定义大小VideoView
 *
 * @author kaiwang
 * @date 2023-04-03
 */
class CustomVideoView : VideoView {

    constructor(context: Context?) : this(context, null)

    constructor(context: Context?, attrs: AttributeSet?) : this(context, attrs, 0)

    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : this(context, attrs, defStyleAttr, 0)

    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int, defStyleRes: Int) : super(context, attrs, defStyleAttr, defStyleRes)

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)
        val width = getDefaultSize(width, widthMeasureSpec)
        val height = getDefaultSize(height, heightMeasureSpec)
        setMeasuredDimension(width, height)
    }
}