package com.example.w9t_nrv_socialmedia.util

import com.example.w9t_nrv_socialmedia.data.domain.HomeItem
import com.example.w9t_nrv_socialmedia.data.domain.Post
import com.example.w9t_nrv_socialmedia.data.domain.enums.HomeItemType

fun Post.toHomeItem(): HomeItem<Any>{
    return HomeItem(this, HomeItemType.TYPE_POST)
}