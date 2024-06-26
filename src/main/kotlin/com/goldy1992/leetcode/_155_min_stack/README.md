# Min Stack
 
- Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

- Implement the `MinStack` class:
  - `MinStack()` initializes the stack object.
  - `void push(int val)` pushes the element `val` onto the stack.
  - `void pop()` removes the element on the top of the stack.
  - `int top()` gets the top element of the stack.
  - `int getMin()` retrieves the minimum element in the stack.
  - You must implement a solution with `O(1)` time complexity for each function.


## Example 1:
<pre>
<b>Input</b>
["MinStack","push","push","push","getMin","pop","top","getMin"]
[[],[-2],[0],[-3],[],[],[],[]]

<b>Output</b>
[null,null,null,null,-3,null,0,-2]

<b>Explanation</b>
MinStack minStack = new MinStack();
minStack.push(-2);
minStack.push(0);
minStack.push(-3);
minStack.getMin(); // return -3
minStack.pop();
minStack.top();    // return 0
minStack.getMin(); // return -2
</pre>

## Constraints:

- <code>-2<sup>31</sup> <= val <= 2<sup>31</sup> - 1</code>
- Methods `pop`, `top` and `getMin` operations will always be called on **non-empty** stacks.
- At most <code>3 * 10<sup>4</sup></code> calls will be made to `push`, `pop`, `top`, and `getMin`.