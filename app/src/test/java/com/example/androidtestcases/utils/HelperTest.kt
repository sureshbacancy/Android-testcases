package com.example.androidtestcases.utils

import org.junit.After
import org.junit.Assert
import org.junit.Before
import org.junit.Test

/**
 * Created by admin on 29/11/23.
 */
class HelperTest {

    @Before
    fun setUp(){
        println("This will call before every test case")
    }

    @After
    fun tearDown(){
        println("This is will call after every test case")
    }



    @Test
    fun isPalindrome() {

        //Arrange
        val helper = Helper()

        //Act
        val result = helper.isPalindrome("Hello")
        //First and last characters should be same == true else false
        //Output = false

        //Assert
        Assert.assertEquals(false, result)
    }

    @Test
    fun isPalindrome_inputString_level_expected_true() {

        //Arrange
        val helper = Helper()

        //Act
        val result = helper.isPalindrome("level")
        //First and last characters should be same == true else false
        //Output = true

        //Assert
        Assert.assertEquals(true, result)
    }

}