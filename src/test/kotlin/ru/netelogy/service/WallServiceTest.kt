package ru.netelogy.service

import org.junit.Test

import org.junit.Assert.*
import ru.netelogy.data.Post
import ru.netelogy.service.WallService.add
import ru.netelogy.service.WallService.update

internal class WallServiceTest {

    @Test
    fun add_new_post() {
        // arrange
        val postNew = Post(0,"Test Add New Post")
        val expectedPostId = 1
        // act
        val actualPostId = add(postNew)
        val (postId, _) = actualPostId
        // assert
        assertEquals(expectedPostId,postId)
    }

    @Test
    fun update_correct() {
        // arrange
        val postNew = Post(0,"Test Add New Post")
        val postNewUpdate = Post(1,"Test Update Post")
        val expectedUpdate = true
        // act
        val actualPost = add(postNew)
        val postUpdate = update(postNewUpdate)
        // assert
        assertEquals(expectedUpdate,postUpdate)
    }

    @Test
    fun update_incorrect() {
        // arrange
        val postNew = Post(0,"Test Add New Post")
        val postNewUpdate = Post(2,"Test Update Post")
        val expectedUpdate = false
        // act
        val actualPost = add(postNew)
        val postUpdate = update(postNewUpdate)
        // assert
        assertEquals(expectedUpdate,postUpdate)
    }
}