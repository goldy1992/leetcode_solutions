package com.goldy1992.leetcode._146_lru_cache

class LRUCache(val capacity: Int) {
    class LRUEntry(
        val key: Int,
        val prev: LRUEntry?,
        val next: LRUEntry?
    )
    var lruHead: LRUEntry? = null
    var lruTail: LRUEntry? = null
    val map = mutableMapOf<Int, Int>()

    fun get(key: Int): Int {
        return map[key] ?: -1
    }

    fun put(key: Int, value: Int) {
        var currentNode = lruHead
        var found = false
        while (currentNode != null && !found) {
            if (currentNode.key == key) {
                found = true
            } else {
                currentNode = currentNode.next
            }
        }
        if (map.size > capacity){
            map.remove(lruHead?.key)
            lruHead = lruHead?.next
        }
    }

}

/**
 * Your LRUCache object will be instantiated and called as such:
 * var obj = LRUCache(capacity)
 * var param_1 = obj.get(key)
 * obj.put(key,value)
 */