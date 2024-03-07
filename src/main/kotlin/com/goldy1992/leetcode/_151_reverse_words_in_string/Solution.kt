package org.example.com.goldy1992.leetcode._151_reverse_words_in_string

class Solution {
    fun reverseWords(s: String): String {
        var currentIndex = s.length - 1
        var returnString = ""
        var isWhitespace = s[s.length - 1].isWhitespace()
        var endIndex = currentIndex
        var lastStartIndex = currentIndex + 1
        var startIndex = currentIndex
        currentIndex--
        while(currentIndex >= 0) {

            if (s[currentIndex].isWhitespace()) {
                if (!isWhitespace) {
                    returnString += s.substring(startIndex, endIndex + 1) + " "
                    lastStartIndex = startIndex
                    isWhitespace = true
                }
            } else {
                startIndex = currentIndex
                if (isWhitespace) {
                    endIndex = currentIndex
                    isWhitespace = false
                }
            }
            currentIndex--
        }
        if (lastStartIndex != startIndex) {
            returnString += s.substring(startIndex, endIndex + 1) + " "
        }
        return returnString.trim()
    }
}