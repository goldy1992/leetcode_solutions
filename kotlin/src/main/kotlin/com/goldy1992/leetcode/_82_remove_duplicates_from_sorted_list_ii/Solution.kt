package com.goldy1992.leetcode._82_remove_duplicates_from_sorted_list_ii

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
    fun deleteDuplicates(head: ListNode?): ListNode? {
        val arr = IntArray(201) { _-> 0}
        var currentNode = head

        while (currentNode != null) {
            arr[currentNode.`val` + 100] += 1
            currentNode = currentNode.next
        }

        var newHead = head
        while (newHead != null && arr[newHead.`val` + 100] > 1) {
            newHead = newHead.next
        }
        if (newHead == null) {
            return null
        }
        var previousValidNode = newHead
        currentNode = newHead.next
        while (currentNode != null) {
            if (arr[currentNode.`val` + 100] <= 1) {
                previousValidNode?.next = currentNode
                previousValidNode = currentNode
            }
            currentNode = currentNode.next
        }
        previousValidNode?.next = null
        return newHead
    }
}