package com.example.imitatedouyin

import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.imitatedouyin.databinding.ActivityHomeBinding

/**
 * 主页
 *
 * @author kaiwang
 * @date 2023-03-29
 */
class HomeActivity : BaseActivity() {

    private val TAG = "HomeActivity"

    private lateinit var mHomeAdapter: HomeAdapter
    private lateinit var mBinding: ActivityHomeBinding

    override fun getLayoutView(): View {
        mBinding = ActivityHomeBinding.inflate(layoutInflater)
        return mBinding.root
    }

    override fun initView() {
        mHomeAdapter = HomeAdapter()
        mBinding.videoList.adapter = mHomeAdapter
        val layoutManager = LinearLayoutManager(this)
        layoutManager.orientation = RecyclerView.VERTICAL
        mBinding.videoList.layoutManager = layoutManager

        val list = arrayListOf<VideoBean>()
        list.add(VideoBean("https://stream7.iqilu.com/10339/upload_transcode/202002/18/20200218114723HDu3hhxqIT.mp4"))
        list.add(VideoBean("https://stream7.iqilu.com/10339/upload_transcode/202002/18/20200218093206z8V1JuPlpe.mp4"))
        mHomeAdapter.submitList(list)
    }
}