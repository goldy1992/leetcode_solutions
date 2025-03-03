package com.goldy1992.leetcode._48_rotate_image

class Solution {
    fun rotate(matrix: Array<IntArray>): Unit {
        val n = matrix.size
        var temp: Int
        var temp1: Int
        val numIterations = n / 2
        val lastN = n - 1

        for (i in 0 until numIterations) {

            var cellCol = i
            for (j in i until lastN - i) {
                temp = matrix[j][lastN-i]
                matrix[j][lastN-i] = matrix[i][cellCol]

                temp1 = matrix[lastN-i][lastN-j]
                matrix[lastN-i][lastN-j] = temp

                temp = matrix[lastN-j][i]
                matrix[lastN-j][i] = temp1

                matrix[i][cellCol] = temp
                cellCol++
            }
        }
    }
}