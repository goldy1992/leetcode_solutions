package com.goldy1992.leetcode._30_substring_with_concatentation_of_all_words

class Solution {

    fun findSubstring(s: String, words: Array<String>): List<Int> {
        val wordLength = words[0].length
        val subStringSizeSize = wordLength * words.size
        val toReturn = mutableListOf<Int>()
        if (subStringSizeSize > s.length) {
            return toReturn
        }

        val wordMap = mutableMapOf<String, Int>()
        for (w in words) {
            if (wordMap.containsKey(w)) {
                wordMap[w] = wordMap[w]!! + 1
            } else {
                wordMap[w] = 1
            }
        }

        var startIdx = 0
        while (startIdx + subStringSizeSize  <= s.length) {
            var count = 0
            val wordMapCopy = wordMap.toMutableMap()

            val currentSubString = s.substring(startIdx , startIdx + subStringSizeSize)
            var currentIdx = 0
            while (currentIdx <= currentSubString.length - wordLength) {
                val word = currentSubString.substring(currentIdx, currentIdx + wordLength)
                if (wordMap.containsKey(word) && wordMapCopy[word]!! > 0) {
                    wordMapCopy[word] = wordMapCopy[word]!! - 1
                    currentIdx+= wordLength
                    count++
                } else {
                    break
                }


            }
            if (count == words.size) {
                toReturn.add(startIdx)
            }
            startIdx++
        }
        return toReturn
    }
}
