package com.example.imitatedouyin

import android.content.Context
import android.view.ViewGroup
import android.widget.MediaController
import android.widget.TextView
import android.widget.Toast
import android.widget.VideoView
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.viewholder.QuickViewHolder

/**
 * 主页短视频适配器
 *
 * @author kaiwang
 * @date 2023-03-29
 */
class HomeAdapter : BaseQuickAdapter<VideoBean, QuickViewHolder>() {

    private val TAG = "HomeAdapter"

//    class VH(parent: ViewGroup, val binding: List)

    override fun onCreateViewHolder(context: Context, parent: ViewGroup, viewType: Int): QuickViewHolder {
        // 返回一个ViewHolder
        return QuickViewHolder(R.layout.item_home_list, parent)
    }

    override fun onBindViewHolder(holder: QuickViewHolder, position: Int, item: VideoBean?) {
        // 设置item数据
        val videoView = holder.getView<VideoView>(R.id.video_item)
        val videoPath = holder.getView<TextView>(R.id.video_path)

        videoView.setVideoPath(item?.path)
        videoView.setOnPreparedListener {
            videoView.start()
        }
        videoView.setOnCompletionListener {
            Toast.makeText(context, "视频播放完成", Toast.LENGTH_SHORT).show()
        }

        val mediaController = MediaController(context)
        videoView.setMediaController(mediaController)
        mediaController.setMediaPlayer(videoView)
        videoPath.text = "path: ${item?.path}"
    }
}