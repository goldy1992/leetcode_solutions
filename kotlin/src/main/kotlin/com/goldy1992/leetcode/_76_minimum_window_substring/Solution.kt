package com.goldy1992.leetcode._76_minimum_window_substring

class Solution {

    fun minWindow(s: String, t: String): String {
        if (s.length == 1) {
            return if (s == t) s else ""
        } else if (t.length > s.length) {
            return ""
        }
        var currentMinWindowSize = s.length + 1
        var currentMinWindow = ""
        val tMap = mutableMapOf<Char, Int>()
        for (c in t) {
            if (tMap.containsKey(c)) {
                tMap[c] = tMap[c]!! + 1
            } else {
                tMap[c] = 1
            }
        }
        var leftIdx = 0
        var rightIdx = -1
        var moveRight = true
        val mMap = mutableMapOf<Char, Int>()
        for (k in tMap.keys) {
            mMap[k] = 0
        }
        val andOp : Long = (1L shl (tMap.size + 1)) -1L
        var currentBitOp : Long = (1L shl tMap.size)
        while (leftIdx < rightIdx || rightIdx < s.length -1) {
            if (moveRight) {
                var found = false
                while (!found && rightIdx < s.length -1 && leftIdx < s.length -1  ) {
                    rightIdx++
                    if (mMap.containsKey(s[rightIdx])) {

                        mMap[s[rightIdx]] = mMap[s[rightIdx]]!! + 1
                        if (mMap[s[rightIdx]]!! == tMap[s[rightIdx]]!!) {
                            val keyIdx = tMap.keys.indexOf(s[rightIdx])
                            currentBitOp += 1L shl keyIdx
                        }
                    }

                    if ((currentBitOp and andOp) == andOp) {
                        val newString = s.substring(leftIdx, rightIdx + 1)
                        if (newString.length < currentMinWindowSize) {
                            currentMinWindowSize = newString.length
                            currentMinWindow = newString
                        }

                        found = true

                    }
                    moveRight = false
                }
            } else if (leftIdx < rightIdx) {
                if (mMap.containsKey(s[leftIdx])) {
                    mMap[s[leftIdx]] = mMap[s[leftIdx]]!! - 1
                    if (mMap[s[leftIdx]]!! == tMap[s[leftIdx]]!! -1) {
                        val keyIdx = tMap.keys.indexOf(s[leftIdx])
                        currentBitOp -= 1L shl keyIdx
                    }
                }
                leftIdx++
                var found = false
                while (!found && leftIdx < rightIdx) {
                    if (mMap.containsKey(s[leftIdx])) {
                       found = true
                    } else {
                        leftIdx++
                    }
                }
                if ((currentBitOp and andOp) == andOp) {
                    val newString = s.substring(leftIdx, rightIdx + 1)
                    if (newString.length < currentMinWindowSize) {
                        currentMinWindowSize = newString.length
                        currentMinWindow = newString
                    }
                } else {
                    moveRight = rightIdx < s.length -1
                }

            } else {
                moveRight = rightIdx < s.length -1
            }
        }
        return currentMinWindow
    }

}