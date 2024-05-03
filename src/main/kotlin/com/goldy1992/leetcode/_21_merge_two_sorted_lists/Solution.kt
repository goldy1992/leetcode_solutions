package com.goldy1992.leetcode._21_merge_two_sorted_lists

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
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        var currentL1 = list1
        var currentL2 = list2
        var toReturn: ListNode? = null
        var currentNode: ListNode? = null

        while (currentL1 != null || currentL2 != null ) {
            val v1 : Int = currentL1?.`val` ?: 101
            val v2 : Int = currentL2?.`val` ?: 101
            val toAdd: ListNode
            if (v1 < v2) {
                toAdd = ListNode(v1)
                if (toReturn == null) {
                    toReturn = toAdd
                }
                currentL1 = currentL1?.next

            } else {
                toAdd = ListNode(v2)
                if (toReturn == null) {
                    toReturn = toAdd
                }
                currentL2 = currentL2?.next
            }


            if (currentNode != null) {
                currentNode.next = toAdd
            }
            currentNode = toAdd


        }
        return toReturn
    }
}