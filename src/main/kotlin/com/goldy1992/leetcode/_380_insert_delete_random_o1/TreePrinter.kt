package com.goldy1992.leetcode._380_insert_delete_random_o1

import java.io.PrintStream
import java.util.*
import java.util.function.Function
import kotlin.math.max
import kotlin.math.min

class TreePrinter<T>(
    private val getLabel: Function<T, String>,
    private val getLeft: Function<T, T>,
    private val getRight: Function<T, T>
) {
    private var outStream: PrintStream = System.out

    private var squareBranches = false
    private var lrAgnostic = false
    private var hspace = 2
    private val tspace = 1

    fun setPrintStream(outStream: PrintStream) {
        this.outStream = outStream
    }

    fun setSquareBranches(squareBranches: Boolean) {
        this.squareBranches = squareBranches
    }

    fun setLrAgnostic(lrAgnostic: Boolean) {
        this.lrAgnostic = lrAgnostic
    }

    fun setHspace(hspace: Int) {
        this.hspace = hspace
    }

    fun setTspace(tspace: Int) {
        this.hspace = tspace
    }

    /*
        Prints ascii representation of binary tree.
        Parameter hspace is minimum number of spaces between adjacent node labels.
        Parameter squareBranches, when set to true, results in branches being printed with ASCII box
        drawing characters.
     */
    fun printTree(root: T) {
        val treeLines = buildTreeLines(root)
        printTreeLines(treeLines)
    }

    /*
        Prints ascii representations of multiple trees across page.
        Parameter hspace is minimum number of spaces between adjacent node labels in a tree.
        Parameter tspace is horizontal distance between trees, as well as number of blank lines
        between rows of trees.
        Parameter lineWidth is maximum width of output
        Parameter squareBranches, when set to true, results in branches being printed with ASCII box
        drawing characters.
     */
    fun printTrees(trees: List<T>, lineWidth: Int) {
        val allTreeLines: MutableList<List<TreeLine>> = ArrayList()
        val treeWidths = IntArray(trees.size)
        val minLeftOffsets = IntArray(trees.size)
        val maxRightOffsets = IntArray(trees.size)
        for (i in trees.indices) {
            val treeNode = trees[i]
            val treeLines = buildTreeLines(treeNode)
            allTreeLines.add(treeLines)
            minLeftOffsets[i] = minLeftOffset(treeLines)
            maxRightOffsets[i] = maxRightOffset(treeLines)
            treeWidths[i] = maxRightOffsets[i] - minLeftOffsets[i] + 1
        }

        var nextTreeIndex = 0
        while (nextTreeIndex < trees.size) {
            // print a row of trees starting at nextTreeIndex

            // first figure range of trees we can print for next row

            var sumOfWidths = treeWidths[nextTreeIndex]
            var endTreeIndex = nextTreeIndex + 1
            while (endTreeIndex < trees.size && sumOfWidths + tspace + treeWidths[endTreeIndex] < lineWidth) {
                sumOfWidths += (tspace + treeWidths[endTreeIndex])
                endTreeIndex++
            }
            endTreeIndex--

            // find max number of lines for tallest tree
            val maxLines = allTreeLines.stream().mapToInt { list: List<TreeLine> -> list.size }.max().orElse(0)

            // print trees line by line
            for (i in 0 until maxLines) {
                for (j in nextTreeIndex..endTreeIndex) {
                    val treeLines = allTreeLines[j]
                    if (i >= treeLines.size) {
                        print(spaces(treeWidths[j]))
                    } else {
                        val leftSpaces = -(minLeftOffsets[j] - treeLines[i].leftOffset)
                        val rightSpaces = maxRightOffsets[j] - treeLines[i].rightOffset
                        print(spaces(leftSpaces) + treeLines[i].line + spaces(rightSpaces))
                    }
                    if (j < endTreeIndex) print(spaces(tspace))
                }
                println()
            }

            for (i in 0 until tspace) {
                println()
            }

            nextTreeIndex = endTreeIndex + 1
        }
    }

    private fun printTreeLines(treeLines: List<TreeLine>) {
        if (treeLines.size > 0) {
            val minLeftOffset = minLeftOffset(treeLines)
            val maxRightOffset = maxRightOffset(treeLines)
            for (treeLine in treeLines) {
                val leftSpaces = -(minLeftOffset - treeLine.leftOffset)
                val rightSpaces = maxRightOffset - treeLine.rightOffset
                outStream.println(spaces(leftSpaces) + treeLine.line + spaces(rightSpaces))
            }
        }
    }

    private fun buildTreeLines(root: T?): List<TreeLine> {
        if (root == null) return emptyList()
        else {
            val rootLabel = getLabel.apply(root)
            val leftTreeLines = buildTreeLines(getLeft.apply(root))
            val rightTreeLines = buildTreeLines(getRight.apply(root))

            val leftCount = leftTreeLines.size
            val rightCount = rightTreeLines.size
            val minCount = min(leftCount.toDouble(), rightCount.toDouble()).toInt()
            val maxCount = max(leftCount.toDouble(), rightCount.toDouble()).toInt()

            // The left and right subtree print representations have jagged edges, and we essentially we have to
            // figure out how close together we can bring the left and right roots so that the edges just meet on
            // some line.  Then we add hspace, and round up to next odd number.
            var maxRootSpacing = 0
            for (i in 0 until minCount) {
                val spacing = leftTreeLines[i].rightOffset - rightTreeLines[i].leftOffset
                if (spacing > maxRootSpacing) maxRootSpacing = spacing
            }
            var rootSpacing = maxRootSpacing + hspace
            if (rootSpacing % 2 == 0) rootSpacing++

            // rootSpacing is now the number of spaces between the roots of the two subtrees
            val allTreeLines: MutableList<TreeLine> = ArrayList()

            // strip ANSI escape codes to get length of rendered string. Fixes wrong padding when labels use ANSI escapes for colored nodes.
            val renderedRootLabel = rootLabel.replace("\\e\\[[\\d;]*[^\\d;]".toRegex(), "")

            // add the root and the two branches leading to the subtrees
            allTreeLines.add(TreeLine(rootLabel, -(renderedRootLabel.length - 1) / 2, renderedRootLabel.length / 2))

            // also calculate offset adjustments for left and right subtrees
            var leftTreeAdjust = 0
            var rightTreeAdjust = 0

            if (leftTreeLines.isEmpty()) {
                if (!rightTreeLines.isEmpty()) {
                    // there's a right subtree only
                    if (squareBranches) {
                        if (lrAgnostic) {
                            allTreeLines.add(TreeLine("\u2502", 0, 0))
                        } else {
                            allTreeLines.add(TreeLine("\u2514\u2510", 0, 1))
                            rightTreeAdjust = 1
                        }
                    } else {
                        allTreeLines.add(TreeLine("\\", 1, 1))
                        rightTreeAdjust = 2
                    }
                }
            } else if (rightTreeLines.isEmpty()) {
                // there's a left subtree only
                if (squareBranches) {
                    if (lrAgnostic) {
                        allTreeLines.add(TreeLine("\u2502", 0, 0))
                    } else {
                        allTreeLines.add(TreeLine("\u250C\u2518", -1, 0))
                        leftTreeAdjust = -1
                    }
                } else {
                    allTreeLines.add(TreeLine("/", -1, -1))
                    leftTreeAdjust = -2
                }
            } else {
                // there's a left and right subtree
                if (squareBranches) {
                    val adjust = (rootSpacing / 2) + 1
                    val horizontal = java.lang.String.join("", Collections.nCopies(rootSpacing / 2, "\u2500"))
                    val branch = "\u250C" + horizontal + "\u2534" + horizontal + "\u2510"
                    allTreeLines.add(TreeLine(branch, -adjust, adjust))
                    rightTreeAdjust = adjust
                    leftTreeAdjust = -adjust
                } else {
                    if (rootSpacing == 1) {
                        allTreeLines.add(TreeLine("/ \\", -1, 1))
                        rightTreeAdjust = 2
                        leftTreeAdjust = -2
                    } else {
                        var i = 1
                        while (i < rootSpacing) {
                            val branches = "/" + spaces(i) + "\\"
                            allTreeLines.add(TreeLine(branches, -((i + 1) / 2), (i + 1) / 2))
                            i += 2
                        }
                        rightTreeAdjust = (rootSpacing / 2) + 1
                        leftTreeAdjust = -((rootSpacing / 2) + 1)
                    }
                }
            }

            // now add joined lines of subtrees, with appropriate number of separating spaces, and adjusting offsets
            for (i in 0 until maxCount) {
                var leftLine: TreeLine
                var rightLine: TreeLine
                if (i >= leftTreeLines.size) {
                    // nothing remaining on left subtree
                    rightLine = rightTreeLines[i]
                    rightLine.leftOffset += rightTreeAdjust
                    rightLine.rightOffset += rightTreeAdjust
                    allTreeLines.add(rightLine)
                } else if (i >= rightTreeLines.size) {
                    // nothing remaining on right subtree
                    leftLine = leftTreeLines[i]
                    leftLine.leftOffset += leftTreeAdjust
                    leftLine.rightOffset += leftTreeAdjust
                    allTreeLines.add(leftLine)
                } else {
                    leftLine = leftTreeLines[i]
                    rightLine = rightTreeLines[i]
                    val adjustedRootSpacing = (if (rootSpacing == 1) (if (squareBranches) 1 else 3) else rootSpacing)
                    val combined = TreeLine(
                        leftLine.line + spaces(adjustedRootSpacing - leftLine.rightOffset + rightLine.leftOffset) + rightLine.line,
                        leftLine.leftOffset + leftTreeAdjust, rightLine.rightOffset + rightTreeAdjust
                    )
                    allTreeLines.add(combined)
                }
            }
            return allTreeLines
        }
    }

    private class TreeLine(var line: String, var leftOffset: Int, var rightOffset: Int)
    companion object {
        private fun minLeftOffset(treeLines: List<TreeLine>): Int {
            return treeLines.stream().mapToInt { l: TreeLine -> l.leftOffset }.min().orElse(0)
        }

        private fun maxRightOffset(treeLines: List<TreeLine>): Int {
            return treeLines.stream().mapToInt { l: TreeLine -> l.rightOffset }.max().orElse(0)
        }

        private fun spaces(n: Int): String {
            return java.lang.String.join("", Collections.nCopies(n, " "))
        }
    }
}