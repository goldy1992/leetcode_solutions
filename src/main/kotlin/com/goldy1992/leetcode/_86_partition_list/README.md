# Partition List
 
- Given the `head` of a linked list and a value `x`, partition it such that all nodes **less than** `x` come before nodes **greater than or equal** to `x`.
- You should **preserve** the original relative order of the nodes in each of the two partitions.


## Example 1:
![Example 1](example1.jpg)
<pre>
<b>Input:</b> head = [1,4,3,2,5,2], x = 3
<b>Output:</b> [1,2,2,4,3,5]
</pre>

## Example 2:
<pre>
<b>Input:</b> head = [2,1], x = 2
<b>Output:</b> [1,2]
</pre>


## Constraints:
- The number of nodes in the list is in the range `[0, 200]`.
- `-100 <= Node.val <= 100`
- `-200 <= x <= 200`

