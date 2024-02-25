package com.goldy1992.leetcode._380_insert_delete_random_o1

import kotlin.random.Random

class Struct(val num: Int) {
    var left: Struct? = null
    var right: Struct? = null
}

class Tree {
    var root : Struct? = null
    var size = 0
}


class RandomizedSet() {

    val tree : Tree = Tree()


    fun insert(`val`: Int): Boolean {
        var foundSpot = false
        if (tree.root == null) {
            tree.root = Struct(`val`)
            foundSpot = true
        }

        var currentStruct : Struct = tree.root!!
        while (!foundSpot) {
            val currentNum = currentStruct.num
            if (currentNum == `val`) {
                return false
            } else if (`val` < currentNum) {
                if (currentStruct.left == null) {
                    currentStruct.left = Struct(`val`)
                    foundSpot = true
                }
                currentStruct = currentStruct.left!!
            } else {
                if (currentStruct.right == null) {
                    currentStruct.right = Struct(`val`)
                    foundSpot = true
                }
                currentStruct = currentStruct.right!!
            }
        }
        tree.size++
        return true

    }

    fun remove(`val`: Int): Boolean {
        if (tree.root == null) {
            return false
        }

        var foundSpot = false
        var parent: Struct? = null
        var parentLeft = false
        var currentStruct : Struct = tree.root!!
        while (!foundSpot) {
            val currentNum = currentStruct.num
            if (currentNum == `val`) {
                foundSpot = true
            } else if (`val` < currentNum) {
                if (currentStruct.left != null) {
                    parent = currentStruct
                    parentLeft = true
                    currentStruct = currentStruct.left!!
                } else {
                    return false
                }
            } else {
                if (currentStruct.right != null) {
                    parent = currentStruct
                    parentLeft = false
                    currentStruct = currentStruct.right!!
                } else {
                    return false
                }
            }
        }

        var numChildren = 0
        if (currentStruct.left != null) {
            numChildren++
        }
        if (currentStruct.right != null) {
            numChildren++
        }

        if (numChildren == 0) {
            if (parent != null) {
                if (parentLeft) {
                    parent.left = null
                } else {
                    parent.right = null
                }
            } else {
                tree.root = null
            }
            return true
        } else if (numChildren == 1) {
            val replaceStruct = if (currentStruct.left != null)
                currentStruct.left else currentStruct.right
            if (parent != null) {
                if (parentLeft) {
                    parent.left = replaceStruct
                } else {
                    parent.right = replaceStruct
                }
            } else {
                tree.root = replaceStruct
            }
        } else {
            // find replacement Node
            var foundReplacement= false
            var replaceParent = currentStruct
            var replaceParentLeft = false
            var replaceStruct : Struct = currentStruct.left!!
            while (!foundReplacement) {
                if (replaceStruct.right != null) {
                    replaceParent = replaceStruct
                    replaceParentLeft = false

                    replaceStruct = replaceStruct.right!!
                } else if (replaceStruct.left != null) {
                    replaceParent = replaceStruct
                    replaceParentLeft = true
                    replaceStruct = replaceStruct.left!!
                } else {
                    if (replaceParentLeft) {
                        replaceParent.left = null
                    }
                    else {
                        replaceParent.right = null
                    }
                    foundReplacement = true
                }
            }

            if (parent != null) {
                if (parentLeft) {
                    parent.left = replaceStruct
                } else {
                    parent.right = replaceStruct
                }
            } else {
                tree.root = replaceStruct
            }
        }


        tree.size--
        return true

    }

    data class Traversal(
        val index: Int,
        val value: Int
    )
    fun traverse(node: Struct, traversal: Traversal, targetIdx: Int) : Traversal {
        if (traversal.index == targetIdx) {
            return traversal
        }
        var newTraversal = traversal
        if (node.left != null) {
            newTraversal = traverse(node.left!!, newTraversal, targetIdx)
            if (newTraversal.index == targetIdx) {
                return newTraversal
            }
        }
        newTraversal = Traversal(newTraversal.index + 1, node.num)
        if (newTraversal.index == targetIdx) {
            return newTraversal
        }
        if (node.right != null) {
            newTraversal = traverse(node.right!!, newTraversal, targetIdx)
        }

        return newTraversal

    }
    fun getRandom(): Int {
        if (tree.size == 1) {
            return tree.root!!.num
        }
        val toRetrieveIdx = Random.nextInt(1, tree.size)
        return traverse(tree.root!!, Traversal(0, -1), toRetrieveIdx).value
    }

}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * var obj = RandomizedSet()
 * var param_1 = obj.insert(`val`)
 * var param_2 = obj.remove(`val`)
 * var param_3 = obj.getRandom()
 */