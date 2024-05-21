package com.goldy1992.leetcode._86_partition_list

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
    fun partition(head: ListNode?, x: Int): ListNode? {
        if (head == null) {
            return null
        }
        var lessThan: ListNode? = null
        var lessThanHead: ListNode? = null
        var greaterThan: ListNode? = null
        var greaterThanHead: ListNode? = null

        var currentNode = head
        while (currentNode != null) {
            if (currentNode.`val` < x) {
                if (lessThanHead == null) {
                    lessThanHead = currentNode
                    lessThan = currentNode
                } else {
                    lessThan?.next = currentNode
                    lessThan = currentNode
                }
            } else {
                if (greaterThanHead == null) {
                    greaterThanHead = currentNode
                    greaterThan = currentNode
                } else {
                    greaterThan?.next = currentNode
                    greaterThan = currentNode
                }
            }
            currentNode = currentNode.next
        }
        greaterThan?.next = null
        return if (lessThanHead != null) {
            lessThan?.next = greaterThanHead
            lessThanHead
        } else {
            greaterThanHead
        }
    }
}