package com.goldy1992.leetcode._134_gas_station

import com.goldy1992.leetcode._380_insert_delete_random_o1.RandomizedSetTest
import com.goldy1992.leetcode._134_gas_station.Solution
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import java.io.BufferedReader
import java.io.File

class SolutionTest {

    companion object {
        const val TEST_CLASS_RES_DIR = "src/test/resources/_134_gas_station"
    }

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
    @Test
    fun testExample3() {
        val gas = intArrayOf(5,8,2,8)
        val cost = intArrayOf(6,5,6,6)
        val expected = 3
        val result = solution.canCompleteCircuit(gas, cost)
        assertEquals(expected, result)
    }
    @Test
    fun testExample4() {
        val gas = intArrayOf(5,1,2,3,4)
        val cost = intArrayOf(4,4,1,5,1)
        val expected = 4
        val result = solution.canCompleteCircuit(gas, cost)
        assertEquals(expected, result)
    }

    @Test
    fun testExample5() {
        val gas = readFileAsIntArray("test_5_gas.txt")
        val cost = readFileAsIntArray("test_5_cost.txt")

        for (i in gas.indices) {
            if (gas[i] != cost[i]) {
                println("$i, gas: ${gas[i]} cost: ${cost[i]}")
            }
        }
//        val expected = 4
//        val result = solution.canCompleteCircuit(gas, cost)
//        assertEquals(expected, result)
    }

    private fun readFileAsIntArray(fileName: String) : IntArray {
        val filePath = RandomizedSetTest.TEST_CLASS_RES_DIR + File.separator + fileName
        val bufferedReader: BufferedReader = File(filePath).bufferedReader()
        val string = bufferedReader.use { it.readText() }
        val stringArray = string.split(RandomizedSetTest.INPUT_DELIMITER).toTypedArray()
        return stringArray.map { it.toInt() }.toTypedArray().toIntArray()
    }
}