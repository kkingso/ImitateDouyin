package com.example.imitatedouyin.activity

import android.view.View
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.imitatedouyin.base.BaseActivity
import com.example.imitatedouyin.databinding.ActivityHomeBinding
import com.example.imitatedouyin.fragment.RecommendFragment
import com.google.android.material.tabs.TabLayoutMediator

/**
 * 首页Activity
 *
 * @author kaiwang
 * @date 2023-03-29
 */
class HomeActivity : BaseActivity() {

    private val TAG = "HomeActivity"

    private lateinit var mBinding: ActivityHomeBinding
    private val tabs = arrayOf("关注", "推荐")
    private val fragmentList = arrayListOf<Fragment>()

    override fun getLayoutView(): View {
        mBinding = ActivityHomeBinding.inflate(layoutInflater)
        return mBinding.root
    }

    override fun initView() {
        fragmentList.add(RecommendFragment())
        mBinding.vp2Home.adapter = object : FragmentStateAdapter(this) {
            override fun createFragment(position: Int): Fragment {
                return fragmentList[position]
            }

            override fun getItemCount(): Int {
                return fragmentList.size
            }
        }

        val mediator = TabLayoutMediator(mBinding.tabHome, mBinding.vp2Home) { tab, position ->
            tab.text = tabs[position]
        }
        mediator.attach()
    }
}