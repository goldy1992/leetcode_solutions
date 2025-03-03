package com.goldy1992.leetcode._146_lru_cache

import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test

class LRUCacheTest {

    lateinit var lruCache: LRUCache
    companion object{
        const val LRU_CACHE = "LRUCache"
        const val PUT = "put"
        const val GET = "get"
    }

    @Test
    fun testExample1() {
        val commandArray = arrayOf(
            LRU_CACHE, PUT, PUT, GET, PUT, GET, PUT, GET, GET, GET
        )
        val valueArray = arrayOf(
            intArrayOf(2),
            intArrayOf(1,1),
            intArrayOf(2,2),
            intArrayOf(1),
            intArrayOf(3,3),
            intArrayOf(2),
            intArrayOf(4,4),
            intArrayOf(1),
            intArrayOf(3),
            intArrayOf(4),
        )
        val expected = arrayOf<Int?>(null, null, null, 1, null, -1, null, -1, 3, 4)
        val result = performTest(commandArray, valueArray)
        assertArrayEquals(expected, result)
    }

    private fun performTest(commandArray: Array<String>, valueArray: Array<IntArray>): Array<Int?> {
        val toReturn = Array<Int?>(commandArray.size) { _-> null}
        for (i in commandArray.indices) {
            val command = commandArray[i]
            val value = valueArray[i]
            when (command) {
                LRU_CACHE -> {
                    lruCache = LRUCache(value[0])
                    toReturn[i] = null
                }
                GET -> {
                    toReturn[i] = lruCache.get(value[0])
                }
                PUT -> {
                    lruCache.put(value[0], value[1])
                    toReturn[i] = null
                }
            }
        }
        return toReturn
    }
}