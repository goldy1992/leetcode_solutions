package com.goldy1992.leetcode._189_rotate_array

import org.junit.jupiter.api.Assertions.assertArrayEquals
import kotlin.test.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun testExample1() {
        val nums = intArrayOf(1,2,3,4,5,6,7)
        val expected = intArrayOf(5,6,7,1,2,3,4)
        val k = 3
        solution.rotate(nums, k)
        print(nums.joinToString(","))
        assertArrayEquals(expected, nums)
    }
    @Test
    fun testExample2() {
        val nums = intArrayOf(-1,-100,3,99)
        val expected = intArrayOf(3,99,-1,-100)
        val k = 2
        solution.rotate(nums, k)
        print(nums.joinToString(","))

        assertArrayEquals(expected, nums)
    }

    @Test
    fun testExample3() {
        val nums = intArrayOf(-1,-100,3,99,4,5)
        val expected = intArrayOf(4,5,-1,-100,3,99)
        val k = 2
        solution.rotate(nums, k)
        print(nums.joinToString(","))

        assertArrayEquals(expected, nums)
    }

    @Test
    fun testExample4() {
        val nums = intArrayOf(1)
        val expected = intArrayOf(1)
        val k = 0
        solution.rotate(nums, k)
        print(nums.joinToString(","))

        assertArrayEquals(expected, nums)
    }
}