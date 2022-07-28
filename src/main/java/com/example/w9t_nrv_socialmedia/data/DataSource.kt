package com.example.w9t_nrv_socialmedia.data

import com.example.w9t_nrv_socialmedia.data.domain.Post
import com.example.w9t_nrv_socialmedia.data.domain.Story

object DataSource {
    fun getStories(): List<Story> = listOf(
        Story(false,"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRn5tYGUqfK03Q8ErisM8cFTJVJq9bZL85_Ng&usqp=CAU"),
        Story(true,"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRn5tYGUqfK03Q8ErisM8cFTJVJq9bZL85_Ng&usqp=CAU"),
        Story(true,"https://www.ahpd.org/assets/1/6/Chris-FVPersonalw.jpg"),
        Story(true,"https://www.ahpd.org/assets/1/6/Chris-FVPersonalw.jpg"),
        Story(true,"https://www.ahpd.org/assets/1/6/Chris-FVPersonalw.jpg"),
        Story(false,"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRn5tYGUqfK03Q8ErisM8cFTJVJq9bZL85_Ng&usqp=CAU"),
        Story(false,"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRn5tYGUqfK03Q8ErisM8cFTJVJq9bZL85_Ng&usqp=CAU"),
        Story(true,"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRn5tYGUqfK03Q8ErisM8cFTJVJq9bZL85_Ng&usqp=CAU"),
        Story(true,"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRn5tYGUqfK03Q8ErisM8cFTJVJq9bZL85_Ng&usqp=CAU"),
        Story(false,"https://www.ahpd.org/assets/1/6/Chris-FVPersonalw.jpg"),
        Story(false,"https://www.ahpd.org/assets/1/6/Chris-FVPersonalw.jpg"),
        Story(false,"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRn5tYGUqfK03Q8ErisM8cFTJVJq9bZL85_Ng&usqp=CAU")
    )

    fun getPosts(): List<Post> = listOf(
        Post(userName = "Rana Moner", date = "2022/6/6", profileImageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRn5tYGUqfK03Q8ErisM8cFTJVJq9bZL85_Ng&usqp=CAU", postImageUrl = "https://empire-s3-production.bobvila.com/articles/wp-content/uploads/2022/04/lilac-varieties_21.jpg"),
        Post(userName = "Ali Ahmed", date = "2022/5/10", profileImageUrl = "https://www.ahpd.org/assets/1/6/Chris-FVPersonalw.jpg", postImageUrl = "https://cdn.pixabay.com/photo/2018/10/20/20/31/rose-3761685__480.jpg"),
        Post(userName = "Ahmed Mohamed", date = "2022/5/6", profileImageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRn5tYGUqfK03Q8ErisM8cFTJVJq9bZL85_Ng&usqp=CAU", postImageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSdmu7cCJXMX0-NH1fMp9pfjyLN2Ra1ijxOpZCKDmKVF3dkJgDMpgeFVIVM0zKc9y9DAW8&usqp=CAU"),
        Post(userName = "Ali Ahmed", date = "2022/5/1", profileImageUrl = "https://www.ahpd.org/assets/1/6/Chris-FVPersonalw.jpg", postImageUrl = "https://img2.chinadaily.com.cn/images/201903/12/5c87109ea3106c65fffed1b0.jpeg"),
        Post(userName = "Sora Ali", date = "2022/6/6", profileImageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRn5tYGUqfK03Q8ErisM8cFTJVJq9bZL85_Ng&usqp=CAU", postImageUrl = "https://empire-s3-production.bobvila.com/articles/wp-content/uploads/2022/04/lilac-varieties_21.jpg"),
        Post(userName = "Ali6 Ahmed", date = "2022/6/6", profileImageUrl = "https://www.ahpd.org/assets/1/6/Chris-FVPersonalw.jpg", postImageUrl = "https://empire-s3-production.bobvila.com/articles/wp-content/uploads/2022/04/lilac-varieties_21.jpg"),
        Post(userName = "Ali7 Ahmed", date = "2022/6/6", profileImageUrl = "https://www.ahpd.org/assets/1/6/Chris-FVPersonalw.jpg", postImageUrl = "https://empire-s3-production.bobvila.com/articles/wp-content/uploads/2022/04/lilac-varieties_21.jpg"),
        Post(userName = "Ali8 Ahmed", date = "2022/6/6", profileImageUrl = "https://www.ahpd.org/assets/1/6/Chris-FVPersonalw.jpg", postImageUrl = "https://empire-s3-production.bobvila.com/articles/wp-content/uploads/2022/04/lilac-varieties_21.jpg"),
        Post(userName = "Ali9 Ahmed", date = "2022/6/6", profileImageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRn5tYGUqfK03Q8ErisM8cFTJVJq9bZL85_Ng&usqp=CAU", postImageUrl = "https://empire-s3-production.bobvila.com/articles/wp-content/uploads/2022/04/lilac-varieties_21.jpg"),
        Post(userName = "Ali0 Ahmed", date = "2022/6/6", profileImageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRn5tYGUqfK03Q8ErisM8cFTJVJq9bZL85_Ng&usqp=CAU", postImageUrl = "https://empire-s3-production.bobvila.com/articles/wp-content/uploads/2022/04/lilac-varieties_21.jpg")

        )

    /*
    https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRn5tYGUqfK03Q8ErisM8cFTJVJq9bZL85_Ng&usqp=CAU
    https://www.ahpd.org/assets/1/6/Chris-FVPersonalw.jpg
    */

    /*
    https://empire-s3-production.bobvila.com/articles/wp-content/uploads/2022/04/lilac-varieties_21.jpg
    https://cdn.pixabay.com/photo/2018/10/20/20/31/rose-3761685__480.jpg
    https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSdmu7cCJXMX0-NH1fMp9pfjyLN2Ra1ijxOpZCKDmKVF3dkJgDMpgeFVIVM0zKc9y9DAW8&usqp=CAU
    https://img2.chinadaily.com.cn/images/201903/12/5c87109ea3106c65fffed1b0.jpeg
    */

}