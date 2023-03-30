package com.example.imitatedouyin

import android.view.LayoutInflater
import android.view.View
import com.example.imitatedouyin.databinding.ActivityHomeBinding

/**
 * 主页
 *
 * @author kaiwang
 * @date 2023-03-29
 */
class HomeActivity : BaseActivity() {

    lateinit var mHomeAdapter: HomeAdapter
    lateinit var mBinding: ActivityHomeBinding

    override fun getLayoutView(): View {
        mBinding = ActivityHomeBinding.inflate(layoutInflater)
        return mBinding.root
    }

    override fun initView() {
        mHomeAdapter = HomeAdapter()
        mBinding.videoList.adapter = mHomeAdapter
    }
}