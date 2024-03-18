package com.goldy1992.leetcode._76_minimum_window_substring

class Solution {
    fun minWindow(s: String, t: String): String {
        var currentMinWindowSize = s.length
        var currentMinWindow = ""
        // create set of t
        val tMap = mutableMapOf<Char, Int>()
        for (c in t) {
            if (tMap.containsKey(c)) {
                tMap[c] = tMap[c]!! + 1
            } else {
                tMap[c] = 1
            }
        }

        var currentIdx = 0
        while (currentIdx <= s.length - t.length) {
           if (tMap.containsKey(s[currentIdx])) {
               // iterate from currentIndex
               var numOfFinds = 0
               val iterationStart = currentIdx
               var currentSubIdx = currentIdx
               val tMapCopy = tMap.toMutableMap()
               var setNextIterStartPoint = false

               while (numOfFinds < t.length && currentSubIdx < s.length) {
                   if (tMapCopy.containsKey(s[currentSubIdx])) {
                       if (tMapCopy[s[currentSubIdx]]!! > 0) {
                           tMapCopy[s[currentSubIdx]] = tMapCopy[s[currentSubIdx]]!! - 1
                           numOfFinds++

                           if (numOfFinds == 2 && !setNextIterStartPoint) {
                               currentIdx = currentSubIdx
                               setNextIterStartPoint = true
                           }

                           if (numOfFinds == t.length) {
                               if (currentSubIdx - iterationStart < currentMinWindowSize) {
                                   currentMinWindowSize = currentSubIdx - iterationStart
                                   currentMinWindow = s.substring(iterationStart, currentSubIdx + 1)
                                   if (currentIdx == currentSubIdx && !setNextIterStartPoint) {
                                       currentIdx++
                                   }
                               }
                           }
                       } else {
                           if (numOfFinds == 1) {
                               currentIdx = currentSubIdx
                               setNextIterStartPoint = true
                           }
                       }
                   }
                   currentSubIdx++
               }

               if (currentIdx == iterationStart) {
                   currentIdx++
               }

           } else {
               currentIdx++
           }
        }

        return currentMinWindow
    }
}