package com.goldy1992.leetcode._25_reverse_nodes_in_kgroup

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
    fun reverseKGroup(head: ListNode?, k: Int): ListNode? {
        var toReturn : ListNode? = null
        var currentNode = head
        var lastNodeOfPrevious: ListNode? = null
        val reverseArray = Array<ListNode?>(k) { _->null}
        var groupCount = 0

        while ( currentNode != null) {
            if (groupCount < k) {
                reverseArray[groupCount] = currentNode
                groupCount++
                currentNode = currentNode.next
            } else {
                if (toReturn == null) {
                    toReturn = reverseArray[k - 1]
                }
                if (lastNodeOfPrevious != null) {
                    lastNodeOfPrevious.next = reverseArray[k - 1]
                }
                for (i in k-1 downTo 1) {
                    reverseArray[i]!!.next = reverseArray[i - 1]
                }
                // reverse the nodes
                groupCount = 0
                lastNodeOfPrevious = reverseArray[0]
            }
        }
        if (toReturn == null) {
            toReturn = reverseArray[k - 1]
        }

        if (groupCount == k) {
            for (i in k-1 downTo 1) {
                reverseArray[i]!!.next = reverseArray[i - 1]
            }
            if (lastNodeOfPrevious != null) {
                lastNodeOfPrevious.next = reverseArray[k - 1]
            }
            reverseArray[0]!!.next = null
        } else {
            if (lastNodeOfPrevious != null && groupCount >= 1 && groupCount < k) {
                lastNodeOfPrevious.next = reverseArray[0]
            }
        }

        return toReturn
    }
}