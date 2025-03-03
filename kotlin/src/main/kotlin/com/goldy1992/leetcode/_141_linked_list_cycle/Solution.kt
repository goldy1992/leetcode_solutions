package com.goldy1992.leetcode._141_linked_list_cycle

import com.goldy1992.leetcode.linked_lists.ListNode

/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution {
    fun hasCycle(head: ListNode?): Boolean {
        if (head?.next == null) {
            return false
        }
        /**
         * Two pointers approach, pFast moves 2x pSlow
         */
        var pFast = head
        var pSlow = head

        do {
            pSlow = pSlow?.next
            if (pSlow == null) {
                return false
            }
            for (i in 1..2) {
                pFast = pFast?.next
                if (pFast?.next == null) {
                    return false
                }
            }
        } while (pSlow != pFast)
        return true
    }
}