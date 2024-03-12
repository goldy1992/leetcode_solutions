package com.goldy1992.leetcode._15_3sum

import org.junit.jupiter.api.Assertions.*
import java.io.BufferedReader
import java.io.File
import kotlin.test.Test

class SolutionTest {

    companion object {
        const val INPUT_DELIMITER = ","
        const val TEST_CLASS_RES_DIR = "src/test/resources/_15_3sum"
    }
    private val solution = Solution()

    @Test
    fun testExample1() {
        val input = intArrayOf(-1,0,1,2,-1,-4)
        val expected = setOf(
            listOf(-1,-1,2),
            listOf(-1, 0, 1)
        )
        val result = solution.threeSum(input)
        for (r in result) {
            assertTrue(expected.contains(r))
        }
    }
    @Test
    fun testExample2() {
        val input = intArrayOf(0, 1, 1)
        val expected = setOf<List<Int>>()
        val result = solution.threeSum(input)
        for (r in result) {
            assertTrue(expected.contains(r))
        }
    }
    @Test
    fun testExample3() {
        val input = intArrayOf(0, 0, 0, 0, 0, 0)
        val expected = setOf(listOf(0,0,0))
        val result = solution.threeSum(input)
        for (r in result) {
            assertTrue(expected.contains(r))
        }
    }
    @Test
    fun testExample4() {
        val input = readFileAsIntArray("test_4_large_list.txt")
        val expectedSize = 16258
        val result = solution.threeSum(input)
        assertEquals(expectedSize, result.size)
    }
    @Test
    fun testExample5() {
        val input = intArrayOf(-1,0,1,0)
        val expectedSize = 1
        val expected = listOf(listOf(-1,0,1))
        val result = solution.threeSum(input)
        assertEquals(expectedSize, result.size)
        for (r in result) {
            assertTrue(expected.contains(r))
        }
    }


    private fun readFileAsIntArray(fileName: String) : IntArray {
        val filePath = TEST_CLASS_RES_DIR + File.separator + fileName
        val bufferedReader: BufferedReader = File(filePath).bufferedReader()
        val string = bufferedReader.use { it.readText() }
        val stringArray = string.split(INPUT_DELIMITER).toTypedArray()
        return stringArray.map { it.toInt() }.toTypedArray().toIntArray()
    }
}