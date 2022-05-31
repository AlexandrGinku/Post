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
        val postNew = Post(0,1,"22.01.2022","Test Add New Post")
        val expectedPost = Post(1,1,"22.01.2022","Test Add New Post")
        // act
        val actualPost = add(postNew)
        // assert
        assertEquals(expectedPost,actualPost)
    }

    @Test
    fun update_correct() {
        // arrange
        val postNew = Post(0,1, "22.01.2022", "Test Add New Post")
        val postNewUpdate = Post(1,1, "22.01.2022","Test Update Post")
        val expectedUpdate = true
        // act
        val postUpdate = update(postNewUpdate)
        // assert
        assertEquals(expectedUpdate,postUpdate)
    }

    @Test
    fun update_incorrect() {
        // arrange
        val postNew = Post(1,1, "22.01.2022","Test Add New Post")
        val postNewUpdate = Post(2,1, "22.01.2022","Test Update Post")
        val expectedUpdate = false
        // act
        val postUpdate = update(postNewUpdate)
        // assert
        assertEquals(expectedUpdate,postUpdate)
    }


}