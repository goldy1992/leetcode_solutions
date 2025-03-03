package com.goldy1992.leetcode._125_valid_palindrome

class Solution {
    fun isPalindrome(s: String): Boolean {
        var startPointer = 0
        var endPointer = s.length - 1

        var validPalindrome = true
        while (startPointer < endPointer && validPalindrome) {
            var startChar : Char = s[startPointer]
            while (!startChar.isLetterOrDigit() && startPointer < s.length - 1) {
                startChar = s[++startPointer]
            }

            var endChar : Char = s[endPointer]
            while (!endChar.isLetterOrDigit() && endPointer > 0) {
                endChar = s[--endPointer]
            }

            if (startChar.isLetterOrDigit() && endChar.isLetterOrDigit() && startChar.lowercaseChar() != endChar.lowercaseChar()) {
                validPalindrome = false
            } else {
                startPointer++
                endPointer--
            }
        }
        return validPalindrome
    }

}