package com.goldy1992.leetcode._61_rotate_list

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

    fun rotateRight(head: ListNode?, k: Int): ListNode? {

        var currentNode = head
        // find count
        var count = 0
        while (currentNode != null) {
            count++
            currentNode = currentNode.next
        }

        if (count <= 1) {
            return head
        }

        val nRotations = k % count
        if (nRotations == 0) {
            return head
        }
        // find new head
        currentNode = head
        for (i in 1 ..  count- nRotations) {
            currentNode = currentNode?.next
        }
        // point last node at old head
        val newHead = currentNode
        while (currentNode?.next != null) {
            currentNode = currentNode.next
        }
        currentNode?.next = head

        // find old node pointing to new head and set next to null
        currentNode = head
        while (currentNode?.next != null && currentNode.next != newHead) {
            currentNode = currentNode.next
        }
        currentNode?.next = null
        return newHead
    }
    // naive approach
//    fun rotateRight(head: ListNode?, k: Int): ListNode? {
//        var toReturn = head
//        var currentNode = toReturn
//        var nextToLast: ListNode? = null
//        for (i in 1 .. k) {
//            while (currentNode?.next != null) {
//                nextToLast = currentNode
//                currentNode = currentNode.next
//            }
//            currentNode?.next = toReturn
//            nextToLast?.next = null
//            toReturn = currentNode
//        }
//        return toReturn
//    }
}