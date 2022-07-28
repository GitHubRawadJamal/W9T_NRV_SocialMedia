package com.example.w9t_nrv_socialmedia.ui.home.stories

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
import com.example.w9t_nrv_socialmedia.databinding.*
import com.example.w9t_nrv_socialmedia.ui.home.HomeActionsListener
import com.example.w9t_nrv_socialmedia.ui.home.HomeAdapter

class StoriesAdapter(private val items: List<Story>, private val listener: HomeActionsListener): RecyclerView.Adapter<StoriesAdapter.BaseStoryViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseStoryViewHolder {
        return when(viewType){
            VIEW_TYPE_ADD_STORY -> {
                val view = LayoutInflater.from(parent.context).inflate(R.layout.item_add_story,parent,false)
                AddStoryViewHolder(view)
            }
            VIEW_TYPE_STORY -> {
                val view = LayoutInflater.from(parent.context).inflate(R.layout.item_story,parent,false)
                StoryViewHolder(view)
            }
            else -> throw Exception("UNKNOWN VIEW TYPE")
        }
    }

    override fun onBindViewHolder(holder: BaseStoryViewHolder, position: Int) {
        when(holder){
            is AddStoryViewHolder -> bindAddStory(holder, position)
            is StoryViewHolder -> bindStory(holder, position)
         }
    }

    private fun bindAddStory(holder: AddStoryViewHolder, position: Int){
        holder.binding.apply {
            root.setOnClickListener { listener.addNewStory() }
        }
    }

    private fun bindStory(holder: StoryViewHolder, position: Int) {
        val currentStory = items[position - 1]
        holder.binding.apply {
            //if (currentStory.seen) { }
        imgStory.setOnClickListener() { boxStories.setBackgroundResource(R.drawable.story_false_state_style) }
        Glide.with(this.root.context).load(currentStory.storyProfileImageUrl).into(imgStory)
        root.setOnClickListener { listener.onClickStory(currentStory) }
       }
    }

    override fun getItemViewType(position: Int): Int {
        return when(position){
            0 -> VIEW_TYPE_ADD_STORY
            else -> VIEW_TYPE_STORY
        }
    }

    override fun getItemCount()= items.size+1

    abstract class BaseStoryViewHolder(viewItem: View): RecyclerView.ViewHolder(viewItem)

    class AddStoryViewHolder(viewItem: View): BaseStoryViewHolder(viewItem) {
        val binding = ItemAddStoryBinding.bind(viewItem)
    }

    class StoryViewHolder(viewItem: View): BaseStoryViewHolder(viewItem) {
        val binding = ItemStoryBinding.bind(viewItem)
    }

    companion object{
        const val VIEW_TYPE_ADD_STORY= 1
        const val VIEW_TYPE_STORY  = 2
    }

}