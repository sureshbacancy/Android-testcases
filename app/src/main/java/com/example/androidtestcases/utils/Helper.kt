package com.example.androidtestcases.utils

/**
 * Created by admin on 29/11/23.
 */
class Helper {



    fun isPalindrome(str: String): Boolean {
        var start = 0
        var end = str.length - 1
        while (start < end) {
            if (str[start] != str[end]) {
                return false
            }
            start++
            end--
        }
        return true
    }
}