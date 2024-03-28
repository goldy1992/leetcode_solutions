package com.goldy1992.leetcode._49_group_anagrams

import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test
import kotlin.test.assertContentEquals

class SolutionTest {
    private val solution = Solution()

    @Test
    fun testExample1() {
        val input = arrayOf("eat","tea","tan","ate","nat","bat")
        val expected = arrayOf(
            arrayOf("bat"),
            arrayOf("nat","tan"),
            arrayOf("ate","eat","tea")
        )
        val result = solution.groupAnagrams(input)
        assertEquals(expected.size, result.size)
        for (idx in expected.indices) {
            val exp : Array<String> = expected[idx]
            val res : Array<String> = result[idx].toTypedArray()
            assertEquals(exp.size, res.size)
            assertContentEquals(exp, res)
        }
    }
    @Test
    fun testExample2() {
        val input = arrayOf("")
        val expected = arrayOf(
            arrayOf(""),
        )
        val result = solution.groupAnagrams(input)
        assertEquals(expected.size, result.size)
        for (idx in expected.indices) {
            val exp : Array<String> = expected[idx]
            val res : Array<String> = result[idx].toTypedArray()
            assertEquals(exp.size, res.size)
            assertContentEquals(exp, res)
        }
    }

    @Test
    fun testExample3() {
        val input = arrayOf("a")
        val expected = arrayOf(
            arrayOf("a"),
        )
        val result = solution.groupAnagrams(input)
        assertEquals(expected.size, result.size)
        for (idx in expected.indices) {
            val exp : Array<String> = expected[idx]
            val res : Array<String> = result[idx].toTypedArray()
            assertEquals(exp.size, res.size)
            assertContentEquals(exp, res)
        }
    }
}