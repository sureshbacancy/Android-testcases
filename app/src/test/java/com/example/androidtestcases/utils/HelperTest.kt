package com.example.androidtestcases.utils

import org.junit.Assert
import org.junit.Test

/**
 * Created by admin on 29/11/23.
 */
class HelperTest {

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