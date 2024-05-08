package com.goldy1992.leetcode._92_reverse_linked_list_ii

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
    fun reverseBetween(head: ListNode?, left: Int, right: Int): ListNode? {
        if (left == right) {
            return head
        }
        var count = 1
        var currentItem = head
        var changeStart: ListNode? = null
        while (count < left && currentItem != null) {
            if (count == left - 1) {
                changeStart = currentItem
            }
            currentItem = currentItem.next
            count++
        }


        val changeArray = Array<ListNode?>(right - left + 1) { _-> null}

        for (i in 0 .. right - left) {
            changeArray[i] = currentItem
            currentItem = currentItem!!.next
        }

        val changeEnd = currentItem

        for (i in changeArray.size - 1 downTo 1) {
            changeArray[i]!!.next = changeArray[i-1]
        }
        if (changeEnd != null) {
            changeArray[0]!!.next = changeEnd
        } else {
            changeArray[0]!!.next = null
        }
        return if (changeStart == null) {
             changeArray[changeArray.size - 1]
        } else {
            changeStart.next = changeArray[changeArray.size - 1]
            return head
        }

    }
}