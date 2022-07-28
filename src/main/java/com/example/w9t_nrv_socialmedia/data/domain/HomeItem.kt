package com.example.w9t_nrv_socialmedia.data.domain

import com.example.w9t_nrv_socialmedia.data.domain.enums.HomeItemType

class HomeItem<T>(
    val item: T,
    val type: HomeItemType,
)