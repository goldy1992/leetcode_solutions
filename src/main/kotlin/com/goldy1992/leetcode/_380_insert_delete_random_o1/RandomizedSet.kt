package com.goldy1992.leetcode._380_insert_delete_random_o1

class Struct(val num: Int) {
    var left: Struct? = null
    var right: Struct? = null
}

class Tree {
    var root : Struct? = null
}


class RandomizedSet() {

    val tree : Tree = Tree()

    fun insert(`val`: Int): Boolean {
        if (tree.root == null) {
            tree.root = Struct(`val`)
            return true
        }
        var foundSpot = false
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
        return true

    }

    fun remove(`val`: Int): Boolean {
        return true
    }

    fun getRandom(): Int {
        return 0
    }

}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * var obj = RandomizedSet()
 * var param_1 = obj.insert(`val`)
 * var param_2 = obj.remove(`val`)
 * var param_3 = obj.getRandom()
 */