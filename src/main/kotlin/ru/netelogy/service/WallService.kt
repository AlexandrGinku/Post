package ru.netelogy.service

import ru.netelogy.data.Post

object WallService {
    private var posts = emptyArray<Post>()
    private var lastId = 0

    fun add(post: Post): Post {
        lastId ++
        val newPost = post.copy(id = lastId)
        posts += newPost
        return posts.last()
    }

    fun update(post: Post): Boolean {
        for ((index, item) in posts.withIndex()) {
            if (item.id == post.id) {
                posts[index] = post
                return true
            }
        }
        return false
    }
}