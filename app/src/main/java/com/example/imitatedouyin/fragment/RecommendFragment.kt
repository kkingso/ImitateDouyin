package com.example.imitatedouyin.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.PagerSnapHelper
import androidx.recyclerview.widget.RecyclerView
import com.example.imitatedouyin.adapter.VideoAdapter
import com.example.imitatedouyin.bean.VideoBean
import com.example.imitatedouyin.databinding.FragmentRecommendBinding

/**
 * 视频推荐页
 *
 * @author kaiwang
 * @date 2023-04-03
 */
class RecommendFragment : Fragment() {

    private val TAG = "RecommendFragment"

    private lateinit var mBinding: FragmentRecommendBinding
    private lateinit var mVideoAdapter: VideoAdapter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        mBinding = FragmentRecommendBinding.inflate(inflater)
        return mBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
        initData()
    }

    private fun initView() {
        mVideoAdapter = VideoAdapter()
        mBinding.videoList.adapter = mVideoAdapter
        val layoutManager = LinearLayoutManager(context)
        layoutManager.orientation = RecyclerView.VERTICAL
        mBinding.videoList.layoutManager = layoutManager
        // 实现viewPager的滑动效果
        PagerSnapHelper().attachToRecyclerView(mBinding.videoList)
    }

    private fun initData() {
        val list = arrayListOf<VideoBean>()
        list.add(VideoBean("https://stream7.iqilu.com/10339/upload_transcode/202002/18/20200218114723HDu3hhxqIT.mp4"))
        list.add(VideoBean("https://stream7.iqilu.com/10339/upload_transcode/202002/18/20200218093206z8V1JuPlpe.mp4"))
        list.add(VideoBean("https://stream7.iqilu.com/10339/upload_transcode/202002/18/20200218093206z8V1JuPlpe.mp4"))
        mVideoAdapter.submitList(list)
    }
}