package com.goldy1992.leetcode._19_remove_nth_node_from_list

import com.goldy1992.leetcode.linked_lists.ListNode

class Solution {
    fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
        var currentNode = head
        var count = 0
        while (currentNode != null) {
            currentNode = currentNode.next
            count++
        }

        if (count == 1) {
            return null
        } else if (count == 2) {
            return if (n == 1) {
                head?.next = null
                head
            } else {
                head?.next
            }
        } else {
            val removeAt = count - n
            if (removeAt == 0) {
                return head?.next
            }
            currentNode = head
            count = 0
            var previousNode: ListNode? = null
            while (count < removeAt && currentNode != null) {
                if (count == removeAt - 1) {
                    previousNode = currentNode
                }
                currentNode = currentNode.next
                count++

            }
            if (previousNode != null) {
                previousNode.next = currentNode?.next
            }
        }
        return head
    }
}