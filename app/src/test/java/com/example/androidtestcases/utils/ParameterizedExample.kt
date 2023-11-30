package com.example.androidtestcases.utils

import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized

/**
 * Created by admin on 30/11/23.
 */
@RunWith(value = Parameterized::class)
class ParameterizedExample(val input:String,val expected:Boolean) {

    @Test
    fun test(){
        //Arrange
        val helper = Helper()

        //Act
        val result = helper.isPalindrome(input)
        //First and last characters should be same == true else false
        //Output = false

        //Assert
        Assert.assertEquals(expected, result)
    }


    companion object {

        @JvmStatic
        @Parameterized.Parameters(name = "{index} : {0} is palindrome = {1}")
        fun data() : List<Array<Any>> {

            return listOf(
                arrayOf("hello",false),
                arrayOf("level",true),
                arrayOf("l",true),
                arrayOf("",true),
            )
        }



    }

}