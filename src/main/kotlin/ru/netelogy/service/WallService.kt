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
                val (_, _, _, textNew) = post
                val postUpdate = posts[index]
                posts[index] = postUpdate.copy(text = textNew)
                return true
            }
        }
        return false
    }
}