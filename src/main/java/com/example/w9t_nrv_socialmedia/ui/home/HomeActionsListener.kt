package com.example.w9t_nrv_socialmedia.ui.home

import com.example.w9t_nrv_socialmedia.data.domain.Post
import com.example.w9t_nrv_socialmedia.data.domain.Story

interface HomeActionsListener {
    fun addNewStory()
    fun onClickStory(story: Story)

    fun onClickPost(post: Post)
    fun onFavoritePost(post: Post)
    fun onSharePost(post: Post)
    fun onPublish(newPost: String)
}