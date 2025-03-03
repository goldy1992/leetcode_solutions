package com.goldy1992.leetcode._138_copy_list_with_random_pointer

import com.goldy1992.leetcode.linked_lists.Node

/**
 * Example:
 * var ti = Node(5)
 * var v = ti.`val`
 * Definition for a Node.
 * class Node(var `val`: Int) {
 *     var next: Node? = null
 *     var random: Node? = null
 * }
 */

class Solution {
    class NodeToIndex(var node: Node) {
        var index: Int? = -1
    }

    fun copyRandomList(node: Node?): Node? {
        if (node == null) {
            return null
        }

        val currentNodeList = mutableListOf<NodeToIndex>()
        val newNodeList = mutableListOf<Node>()
        var currentNode = node
        while (currentNode != null) {
            currentNodeList.add(NodeToIndex(currentNode))
            newNodeList.add(Node(currentNode.`val`))
            currentNode = currentNode.next
        }

        // TODO: swap finding in O(n^2) with hash map
        for (i in currentNodeList.indices) {
            var found = false
            val randomNode = currentNodeList[i].node.random
            if (randomNode == null) {
                currentNodeList[i].index = null
            } else {
                while (!found) {
                    for (j in currentNodeList.indices) {
                        if (currentNodeList[j].node == randomNode) {
                            found = true
                            currentNodeList[i].index = j
                            break
                        }
                    }
                }
            }
        }

        for (n in newNodeList.indices) {
            if (n == newNodeList.size - 1) {
                newNodeList[n].next = null
            } else {
                newNodeList[n].next = newNodeList[n + 1]
            }
            val randomNodeIdx = currentNodeList[n].index
            newNodeList[n].random = if (randomNodeIdx == null) null else newNodeList[randomNodeIdx]
          }
        return newNodeList[0]
    }
}