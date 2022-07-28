package com.example.w9t_nrv_socialmedia.ui.home

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.w9t_nrv_socialmedia.R
import com.example.w9t_nrv_socialmedia.data.domain.HomeItem
import com.example.w9t_nrv_socialmedia.data.domain.Post
import com.example.w9t_nrv_socialmedia.data.domain.Story
import com.example.w9t_nrv_socialmedia.data.domain.enums.HomeItemType
import com.example.w9t_nrv_socialmedia.databinding.NewPostBinding
import com.example.w9t_nrv_socialmedia.databinding.PostItemBinding
import com.example.w9t_nrv_socialmedia.databinding.StoriesListBinding
import com.example.w9t_nrv_socialmedia.ui.home.stories.StoriesAdapter

class HomeAdapter(private val items: List<HomeItem<Any>>, private val listener: HomeActionsListener): RecyclerView.Adapter<HomeAdapter.BaseHomeViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseHomeViewHolder {
        return when(viewType){

            VIEW_TYPE_STORIES -> {
                val view = LayoutInflater.from(parent.context).inflate(R.layout.stories_list,parent,false)
                StoriesViewHolder(view)
            }
            VIEW_TYPE_NEW_POST -> {
                val view = LayoutInflater.from(parent.context).inflate(R.layout.new_post,parent,false)
                 NewPostViewHolder(view)
            }
            VIEW_TYPE_POST -> {
                val view = LayoutInflater.from(parent.context).inflate(R.layout.post_item,parent,false)
                 PostViewHolder(view)
            }
            else -> throw Exception("UNKNOWN VIEW TYPE")
        }
    }

    override fun onBindViewHolder(holder: BaseHomeViewHolder, position: Int) {
        when(holder){
            is StoriesViewHolder -> bindStories(holder, position)
            is NewPostViewHolder -> bindNewPost(holder, position)
            is PostViewHolder -> bindPost(holder, position)
        }
    }

    private fun bindStories(holder: StoriesViewHolder, position: Int){
        val stories = items[position].item as List<Story>
        val adapter = StoriesAdapter(stories,listener)
        holder.binding.apply {
            recyclerStory.adapter = adapter
        }
    }

    private fun bindNewPost(holder: NewPostViewHolder, position: Int){
        val hintText = items[position].item as String
        holder.binding.apply {
            inputNewPost.hint = hintText
            iconPublish.setOnClickListener { listener.onPublish(inputNewPost.text.toString()) }
        }
    }

    private fun bindPost(holder: PostViewHolder, position: Int){
        val currentPost = items[position].item as Post
        holder.binding.apply {
            textUserName.text = currentPost.userName
            textDate.text = currentPost.date
            Glide.with(this.root.context).load(currentPost.postImageUrl).into(imgPost)
            Glide.with(this.root.context).load(currentPost.profileImageUrl).into(imgProfile)
            iconFavorite.setOnClickListener { listener.onFavoritePost(currentPost) }
            iconShare.setOnClickListener { listener.onFavoritePost(currentPost) }
        }
    }

    override fun getItemCount()= items.size

    override fun getItemViewType(position: Int): Int {
        return when(items[position].type){
            HomeItemType.TYPE_STORIES -> VIEW_TYPE_STORIES
            HomeItemType.TYPE_NEW_POST -> VIEW_TYPE_NEW_POST
            HomeItemType.TYPE_POST -> VIEW_TYPE_POST
        }
    }

    abstract class BaseHomeViewHolder(viewItem: View): RecyclerView.ViewHolder(viewItem)

    class PostViewHolder(viewItem: View): BaseHomeViewHolder(viewItem) {
        val binding = PostItemBinding.bind(viewItem)
    }

    class NewPostViewHolder(viewItem: View): BaseHomeViewHolder(viewItem) {
        val binding = NewPostBinding.bind(viewItem)
    }

    class StoriesViewHolder(viewItem: View): BaseHomeViewHolder(viewItem) {
        val binding = StoriesListBinding.bind(viewItem)
    }

    companion object{
        const val VIEW_TYPE_STORIES = 1
        const val VIEW_TYPE_NEW_POST = 2
        const val VIEW_TYPE_POST = 3
    }

}