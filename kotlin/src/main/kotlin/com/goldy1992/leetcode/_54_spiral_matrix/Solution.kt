package com.goldy1992.leetcode._54_spiral_matrix

/**
 * Example:
 * 1, 2, 3, 4,
 * 12,13,14, 5,
 * 11,16,15, 6,
 * 10, 9, 8, 7
 *
 * (0,0) -> 4 iter -> (0,3)
 * R+1
 * (1,3) -> 3 iter -> (3,3)
 * C-1
 * (3,2) -> 3 iter -> (3,0)
 * R-1
 * (2,0) -> 2 iter -> (1,0)
 * C+1
 * (1,1) -> 2 iter -> (1,2)
 * R+1
 * (2,2) -> 1 iter -> (2,2)
 * C-1
 * (2,1) -> 1 iter -> (2,1)
 */
class Solution {

    fun spiralOrder(matrix: Array<IntArray>): List<Int> {
        val rowSize = matrix.size
        val colSize = matrix[0].size

        val toReturn = IntArray(rowSize * colSize)
        var currentIdx = 0

        var increasing = true

        var currentRow = 0
        var currentCol = 0

        var rowIterCount = matrix.size - 2
        var colIterCount = matrix[0].size - 1

        breakWhile@ while (currentIdx < toReturn.size) {
            // loop row
            if (increasing) {
                val startCol = currentCol
                val lastCol = startCol + colIterCount
                for ( c in startCol .. lastCol) {
                    toReturn[currentIdx] = matrix[currentRow][c]
                    currentIdx++
                    if (currentIdx >= toReturn.size) {
                        break@breakWhile
                    }
                    if (currentCol < lastCol) {
                        currentCol++
                    }
                }
                colIterCount--
                currentRow += 1
                val lastRowIdx = currentRow + rowIterCount
                for (r in currentRow .. lastRowIdx) {
                    toReturn[currentIdx] = matrix[r][currentCol]
                    currentIdx++
                    if (currentIdx >= toReturn.size) {
                        break@breakWhile
                    }
                    if (currentRow < lastRowIdx  ) {
                        currentRow++
                    }

                }
                rowIterCount--
                currentCol--
                increasing = false
            } else {
                val startCol = currentCol
                val lastCol = startCol - colIterCount
                for ( c in startCol downTo  lastCol) {
                    toReturn[currentIdx] = matrix[currentRow][c]
                    currentIdx++
                    if (currentIdx >= toReturn.size) {
                        break@breakWhile
                    }
                    if (currentCol > lastCol) {
                        currentCol--
                    }
                }
                colIterCount--
                currentRow -= 1
                val lastRowIdx = currentRow - rowIterCount
                for (r in currentRow downTo lastRowIdx) {
                    toReturn[currentIdx] = matrix[r][currentCol]
                    currentIdx++
                    if (currentIdx >= toReturn.size) {
                        break@breakWhile
                    }
                    if (currentRow > lastRowIdx  ) {
                        currentRow--
                    }

                }
                rowIterCount--
                currentCol++
                increasing = true
            }
        }
        return toReturn.asList()
    }

}