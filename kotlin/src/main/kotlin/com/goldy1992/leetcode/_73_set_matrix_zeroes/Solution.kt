package com.goldy1992.leetcode._73_set_matrix_zeroes

class Solution {
    /**
     * Solution uses 0(1) extra memory, which is a boolean to denote whether to fill the first column with 0.
     */
    fun setZeroes(matrix: Array<IntArray>): Unit {
        // c0 denotes whether the first column will be
        var firstCol0 = false

        // for constant space use the first row and first column to denote which will be filled with zeroes.
        for (row in matrix.indices) {
            for (col in matrix[0].indices) {
                if (matrix[row][col] == 0) {
                    matrix[row][0] = 0

                    // set the first column flag to be zero
                    if (col == 0) {
                        firstCol0 = true
                    } else {
                        matrix[0][col] = 0
                    }
                }
            }
        }

        // traverse through all but the first column and row
        for ( row in 1 until matrix.size) {
            for (col in 1 until matrix[0].size) {
                if (matrix[row][col] != 0) {
                    if (matrix[0][col] == 0 || matrix[row][0] == 0) {
                        matrix[row][col] = 0
                    }
                }
            }
        }

        if (matrix[0][0] == 0) {
            for (col in 1 until matrix[0].size) {
                if (matrix[0][col] != 0) {
                    matrix[0][col] = 0
                }
            }
        }

        if (firstCol0) {
            for (row in matrix.indices) {
                if (matrix[row][0] != 0) {
                    matrix[row][0] = 0
                }
            }
        }
    }

    /* First naive approach
    fun setZeroes(matrix: Array<IntArray>): Unit {
        val m = matrix.size
        val n = matrix[0].size

        val mCheck = BooleanArray(m) { _ -> false}
        val nCheck = BooleanArray(n) { _ -> false}

        var row = 0


        while (row < m) {
            if (!mCheck[row]) {
                var col = 0
                breakCol@while (col < n) {
                    if (!nCheck[col]) {
                        if (matrix[row][col] == 0) {
                            mCheck[row] = true
                            nCheck[col] = true
                            setZeros(matrix, row, col)
                            break@breakCol
                        }
                    }
                    col++
                }
            }
            row++
        }
    }

    private fun setZeros(matrix: Array<IntArray>, row: Int, col:Int ) {
        for (n in matrix[row].indices) {
            matrix[row][n] = 0
        }

        for (n in matrix.indices) {
            matrix[n][col] = 0
        }
    }
    */

}