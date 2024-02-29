package com.goldy1992.leetcode._134_gas_station

import org.example.com.goldy1992.leetcode._134_gas_station.Solution
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun testExample1() {
        val gas = intArrayOf(1,2,3,4,5)
        val cost = intArrayOf(3,4,5,1,2)
        val expected = 3
        val result = solution.canCompleteCircuit(gas, cost)
        assertEquals(expected, result)
    }
    @Test
    fun testExample2() {
        val gas = intArrayOf(2,3,4)
        val cost = intArrayOf(3,4,3)
        val expected = -1
        val result = solution.canCompleteCircuit(gas, cost)
        assertEquals(expected, result)
    }
}