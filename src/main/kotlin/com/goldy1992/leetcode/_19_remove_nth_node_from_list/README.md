# Remove Nth Node From End of List
 
- Given the `head` of a linked list, remove the <code>n<sup>th</sup></code> node from the end of the list and return its head.



## Example 1:
![Example 1](example1.jpg)
<pre>
<b>Input:</b> head = [1,2,3,4,5], n = 2
<b>Output:</b> [1,2,3,5]
</pre>

## Example 2:
<pre>
<b>Input:</b> head = [1], n = 1
<b>Output:</b> []
</pre>

## Example 3:
<pre>
<b>Input:</b> head = [1,2], n = 1
<b>Output:</b> [1]
</pre>

## Constraints:
- The number of nodes in the list is `sz`.
- `1 <= sz <= 30`
- `0 <= Node.val <= 100`
- `1 <= n <= sz`


### Follow up: 
Could you do this in one pass?