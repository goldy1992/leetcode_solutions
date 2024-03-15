package com.goldy1992.leetcode._30_substring_with_concatentation_of_all_words

class Solution {
    fun findSubstring(s: String, words: Array<String>): List<Int> {
        val wordLength = words[0].length
        val subStringSizeSize = wordLength * words.size
        val toReturn = mutableListOf<Int>()
        if (subStringSizeSize > s.length) {
            return toReturn
        }
        var startIdx = 0
        while (startIdx + subStringSizeSize  <= s.length) {
            var currentIdx = startIdx
            val indicesUsed = mutableSetOf<Int>()
            for (i in currentIdx until currentIdx + subStringSizeSize step(wordLength)) {
                var subStringFound = false
                val currentSubString = s.substring(i , i + wordLength)
                wordLoop@ for (index in words.indices) {
                    if (!indicesUsed.contains(index) ) {
                        val word = words[index]
                        if (word == currentSubString) {
                            indicesUsed.add(index)
                            subStringFound = true
                            break@wordLoop
                        }
                    }
                }
                if (subStringFound) {
                    currentIdx += wordLength
                } else {
                    break
                }
            }

            if (indicesUsed.size == words.size) {
                toReturn.add(startIdx)
            }
            startIdx++
        }
        return toReturn
    }
}