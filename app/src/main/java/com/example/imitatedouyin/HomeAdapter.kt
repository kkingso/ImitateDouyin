package com.example.imitatedouyin

import android.content.Context
import android.net.Uri
import android.view.ViewGroup
import android.widget.VideoView
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.viewholder.QuickViewHolder

/**
 * 主页短视频适配器
 *
 * @author kaiwang
 * @date 2023-03-29
 */
class HomeAdapter : BaseQuickAdapter<List<VideoBean>, QuickViewHolder>() {

//    class VH(parent: ViewGroup, val binding: List)

    override fun onCreateViewHolder(context: Context, parent: ViewGroup, viewType: Int): QuickViewHolder {
        // 返回一个ViewHolder
        return QuickViewHolder(R.layout.item_home_list, parent)
    }

    override fun onBindViewHolder(holder: QuickViewHolder, position: Int, item: List<VideoBean>?) {
        // 设置item数据
        holder.getView<VideoView>(R.id.video_item).setVideoPath(item?.get(position)?.uri)
    }

}