package com.example.imitatedouyin

import android.os.Bundle
import android.view.View
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity

/**
 * Activity基类
 *
 * @author kaiwang
 * @date 2023-03-29
 */
abstract class BaseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayoutView())
        initView()
    }

    abstract fun getLayoutView(): View

    abstract fun initView()
}