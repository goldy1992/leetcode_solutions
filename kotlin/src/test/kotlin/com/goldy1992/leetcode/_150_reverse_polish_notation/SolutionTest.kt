package com.goldy1992.leetcode._150_reverse_polish_notation

import org.junit.jupiter.api.Assertions.assertEquals
import kotlin.test.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun testExample1() {
        val input = arrayOf("2","1","+","3","*")
        val expected = 9
        val result = solution.evalRPN(input)
        assertEquals(expected, result)
    }

    @Test
    fun testExample2() {
        val input = arrayOf("4","13","5","/","+")
        val expected = 6
        val result = solution.evalRPN(input)
        assertEquals(expected, result)
    }

    @Test
    fun testExample3() {
        val input = arrayOf("10","6","9","3","+","-11","*","/","*","17","+","5","+")
        val expected = 22
        val result = solution.evalRPN(input)
        assertEquals(expected, result)
    }
}