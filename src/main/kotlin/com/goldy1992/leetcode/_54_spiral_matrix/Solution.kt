package com.goldy1992.leetcode._54_spiral_matrix

import kotlin.math.max

class Solution {

    class Cell(
        var row : Int = 0,
        var col : Int = 0
    )
    fun spiralOrder(matrix: Array<IntArray>): List<Int> {
        val rowSize = matrix.size
        val colSize = matrix[0].size

        val toReturn = IntArray(rowSize * colSize)
        var currentIdx = 0

        var increasing = true
        //var rowStartIdx = 0
        //var colStartIdx = 0
        var currentCell = Cell()
        var iteration = 0
        val rowIterations : (Int) -> Int = { iter -> rowSize - iter - 2 }
        val colIterations : (Int) -> Int = { iter -> colSize - iter -1 }
        breakWhile@ while (currentIdx < toReturn.size) {
            // loop row
            if (increasing) {
                val colStartIdx = currentCell.col
                val lastColIdx = colStartIdx + colIterations(iteration)
                for ( c in colStartIdx .. lastColIdx) {
                    toReturn[currentIdx] = matrix[currentCell.row][c]
                    currentIdx++
                    if (currentIdx >= toReturn.size) {
                        break@breakWhile
                    }
                    if (currentCell.col < lastColIdx) {
                        currentCell.col++
                    }
                }
                currentCell.row += 1
                val rowStartIdx = currentCell.row

                val lastRowIdx = rowStartIdx + rowIterations(iteration)
                for (r in rowStartIdx .. lastRowIdx) {
                    toReturn[currentIdx] = matrix[r][currentCell.col]
                    currentIdx++
                    if (currentIdx >= toReturn.size) {
                        break@breakWhile
                    }
                    if (currentCell.row < lastRowIdx  ) {
                        currentCell.row++
                    }

                }
                increasing = false
                iteration++
            } else {
                val colStartIdx = currentCell.col - 1
                for ( c in colStartIdx downTo  colStartIdx - iteration -1 ) {
                    toReturn[currentIdx] = matrix[currentCell.row][c]
                    currentIdx++
                    if (currentIdx >= toReturn.size) {
                        break@breakWhile
                    }
                    if (currentCell.col >= colStartIdx - iteration) {
                        currentCell.col--
                    }
                }
                val rowStartIdx = currentCell.row -1

                for (r in rowStartIdx downTo  iteration ) {
                    toReturn[currentIdx] = matrix[r][currentCell.col]
                    currentIdx++
                    if (currentIdx >= toReturn.size) {
                        break@breakWhile
                    }
                    if (currentCell.row > iteration) {
                        currentCell.row--
                    }

                }
                increasing = true
                currentCell.col++
                iteration++
            }
        }
        return toReturn.asList()
    }

}