package com.goldy1992.leetcode._202_happy_number

class Solution {
    fun isHappy(n: Int): Boolean {

        val squareResult = mutableSetOf<Int>()
        var total = n
        var repeating = false
        while (total != 1 && !repeating) {
            total = getTotal(total)
            if (squareResult.contains(total)) {
                repeating = true
            } else {
                squareResult.add(total)
            }
        }

        return total == 1
    }

    private fun getTotal(n: Int) : Int {
        val s = n.toString()
        val arr = IntArray(s.length)
        for (idx in s.indices) {
            arr[idx] = s[idx].digitToInt()
        }
        var total = 0
        for (i in arr) {
            total += i*i
        }
        return total
    }
}