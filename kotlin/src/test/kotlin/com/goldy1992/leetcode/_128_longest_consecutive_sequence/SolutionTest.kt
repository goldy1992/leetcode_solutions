package com.goldy1992.leetcode._128_longest_consecutive_sequence

import com.goldy1992.leetcode.TestUtils
import com.goldy1992.leetcode.TestUtils.buildFilePath
import org.junit.jupiter.api.Assertions.assertEquals
import kotlin.test.Test

class SolutionTest {

    companion object {
        const val TEST_CLASS_RES_DIR = "src/test/resources/_128_longest_consecutive_sequence"
    }
    private val solution = Solution()

    @Test
    fun testExample1() {
        val nums = intArrayOf(100,4,200,1,3,2)
        val expected = 4
        val result = solution.longestConsecutive(nums)
        assertEquals(expected, result)
    }
    @Test
    fun testExample2() {
        val nums = intArrayOf(0,3,7,2,5,8,4,6,0,1)
        val expected = 9
        val result = solution.longestConsecutive(nums)
        assertEquals(expected, result)
    }
    @Test
    fun testExample3() {
        val nums = intArrayOf()
        val expected = 0
        val result = solution.longestConsecutive(nums)
        assertEquals(expected, result)
    }
    @Test
    fun testExample4() {
        val nums = intArrayOf(1)
        val expected = 1
        val result = solution.longestConsecutive(nums)
        assertEquals(expected, result)
    }
    @Test
    fun testExample5() {
        val nums = intArrayOf(10,9,8,7,5)
        val expected = 4
        val result = solution.longestConsecutive(nums)
        assertEquals(expected, result)
    }

    @Test
    fun testExample6() {
        val filePath = buildFilePath(TEST_CLASS_RES_DIR, "test_6_nums.txt")
        val nums = TestUtils.readFileAsIntArray(filePath)
        //val expected = 4
        val result = solution.longestConsecutive(nums)
        print(result)
        //assertEquals(expected, result)
    }
}