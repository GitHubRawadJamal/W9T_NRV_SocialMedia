package com.example.w9t_nrv_socialmedia.ui.home

import android.view.LayoutInflater
import androidx.fragment.app.Fragment
import com.example.w9t_nrv_socialmedia.data.DataSource
import com.example.w9t_nrv_socialmedia.data.domain.HomeItem
import com.example.w9t_nrv_socialmedia.data.domain.Post
import com.example.w9t_nrv_socialmedia.data.domain.Story
import com.example.w9t_nrv_socialmedia.data.domain.enums.HomeItemType
import com.example.w9t_nrv_socialmedia.databinding.FragmentHomeBinding
import com.example.w9t_nrv_socialmedia.ui.base.BaseFragment
import com.example.w9t_nrv_socialmedia.util.toHomeItem

class HomeFragment: BaseFragment<FragmentHomeBinding>(),HomeActionsListener {
    override val LOG_TAG = HomeFragment::class.java.simpleName
    override val bindingInflater: (LayoutInflater) -> FragmentHomeBinding = FragmentHomeBinding::inflate

    lateinit var adapter: HomeAdapter

    override fun setup(){
        val itemsList: MutableList<HomeItem<Any>> = mutableListOf()
        itemsList.add(HomeItem(DataSource.getStories(), HomeItemType.TYPE_STORIES))
        itemsList.add(HomeItem("Update your status", HomeItemType.TYPE_NEW_POST))
        itemsList.addAll(
            DataSource.getPosts().map { it.toHomeItem() }
        )
        adapter = HomeAdapter(itemsList, this)
        binding?.recyclerPost?.adapter = adapter
    }


    override fun addNewStory() {
        TODO("Not yet implemented")
    }

    override fun onClickStory(story: Story) {
        TODO("Not yet implemented")
    }

    override fun onClickPost(post: Post) {
        TODO("Not yet implemented")
    }

    override fun onFavoritePost(post: Post) {
        TODO("Not yet implemented")
    }

    override fun onSharePost(post: Post) {
        TODO("Not yet implemented")
    }

    override fun onPublish(newPost: String) {
        TODO("Not yet implemented")
    }

}