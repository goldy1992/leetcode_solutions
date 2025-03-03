# 141. Linked List Cycle


- Given `head`, the head of a linked list, determine if the linked list has a cycle in it.
- There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the `next` pointer. 
- Internally, `pos` is used to denote the index of the node that tail's `next` pointer is connected to. 
- **Note that `pos` is not passed as a parameter**.
- Return `true` if there is a cycle in the linked list. Otherwise, return `false`.



## Example 1:
![Example 1](example1.png)
<pre>
<b>Input:</b> head = [3,2,0,-4], pos = 1
<b>Output:</b> true
<b>Explanation:</b> There is a cycle in the linked list, where the tail connects to the 1st node (0-indexed).
</pre>

## Example 2:
![Example 2](example2.png)
<pre>
<b>Input:</b> head = [1,2], pos = 0
<b>Output:</b> true
<b>Explanation:</b> There is a cycle in the linked list, where the tail connects to the 0th node.
</pre>

## Example 3:
![Example 3](example3.png)
<pre>
<b>Input:</b> head = [1], pos = -1
<b>Output:</b> false
<b>Explanation:</b> There is no cycle in the linked list.
</pre>


## Constraints:
- The number of the nodes in the list is in the range <code>[0, 10<sup>4</sup>]</code>.
- <code>-10<sup>5</sup> <= Node.val <= 10<sup>5</sup></code>
- `pos` is `-1` or a **valid index** in the linked-list.



### Follow up: 
Can you solve it using `O(1)` (i.e. constant) memory?
