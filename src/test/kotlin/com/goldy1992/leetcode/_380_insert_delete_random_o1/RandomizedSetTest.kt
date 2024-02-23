package com.goldy1992.leetcode._380_insert_delete_random_o1

import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test

class RandomizedSetTest {
    private val set = RandomizedSet()

    @Test
    fun testExample1() {
        assertTrue(set.insert(0))
        assertTrue(set.insert(1))
        assertFalse(set.insert(1))
    }
}