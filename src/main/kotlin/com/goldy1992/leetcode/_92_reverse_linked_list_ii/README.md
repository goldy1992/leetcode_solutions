# Reverse Linked List II
  
- Given the `head` of a singly linked list and two integers `left` and `right` where `left <= right`, reverse the nodes of the list from position `left` to position `right`, and return _the reversed list_.

## Example 1:
![Example 1](example1.jpg)
<pre>
<b>Input:</b> head = [1,2,3,4,5], left = 2, right = 4
<b>Output:</b> [1,4,3,2,5]
</pre>
## Example 2:
<pre>
<b>Input:</b> head = [5], left = 1, right = 1
<b>Output:</b> [5]
</pre>


## Constraints:
- The number of nodes in the list is `n`.
- `1 <= n <= 500`
- `-500 <= Node.val <= 500`
- `1 <= left <= right <= n`


### Follow up: 
Could you do it in one pass?