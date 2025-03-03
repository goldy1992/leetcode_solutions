package com.goldy1992.leetcode._49_group_anagrams

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertTrue
import kotlin.test.Test

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
        assertExpectedAgainstResult(expected, result)
    }

    @Test
    fun testExample2() {
        val input = arrayOf("")
        val expected = arrayOf(
            arrayOf(""),
        )
        val result = solution.groupAnagrams(input)
        assertExpectedAgainstResult(expected, result)
    }

    @Test
    fun testExample3() {
        val input = arrayOf("a")
        val expected = arrayOf(
            arrayOf("a"),
        )
        val result = solution.groupAnagrams(input)
        assertExpectedAgainstResult(expected, result)
    }

    private fun assertExpectedAgainstResult(expected: Array<Array<String>>, result: List<List<String>>) {
        assertEquals(expected.size, result.size)
        for (idx in expected.indices) {
            val exp : Array<String> = expected[idx]
            if (exp.isEmpty()) {
                assertTrue(result.contains(emptyList()))
            } else {
                for (r in result) {
                    if (r.contains(exp[0])) {
                        assertEquals(exp.size, r.size)
                        for (e in exp) {
                            assertTrue(r.contains(e))
                        }
                        break
                    }
                }
            }
        }
    }

}