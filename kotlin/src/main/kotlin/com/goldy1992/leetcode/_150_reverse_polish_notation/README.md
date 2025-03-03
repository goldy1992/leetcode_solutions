# 150. Evaluate Reverse Polish Notation
  
- You are given an array of strings `tokens` that represents an arithmetic expression in a [Reverse Polish Notation](http://en.wikipedia.org/wiki/Reverse_Polish_notation).
- Evaluate the expression. Return _an integer that represents the value of the expression_.

- **Note** that:
  - The valid operators are `'+'`, `'-'`, `'*'`, and `'/'`.
  - Each operand may be an integer or another expression.
  - The division between two integers always **truncates toward zero**.
  - There will not be any division by zero.
  - The input represents a valid arithmetic expression in a reverse polish notation.
  - The answer and all the intermediate calculations can be represented in a **32-bit** integer.



## Example 1:
<pre>
<b>Input:</b> tokens = ["2","1","+","3","*"]
<b>Output:</b> 9
<b>Explanation:</b> ((2 + 1) * 3) = 9
</pre>

## Example 2:
<pre>
<b>Input:</b> tokens = ["4","13","5","/","+"]
<b>Output:</b> 6
<b>Explanation:</b> (4 + (13 / 5)) = 6
</pre>

## Example 3:
<pre>
<b>Input:</b> tokens = ["10","6","9","3","+","-11","*","/","*","17","+","5","+"]
<b>Output:</b> 22
<b>Explanation:</b> ((10 * (6 / ((9 + 3) * -11))) + 17) + 5
= ((10 * (6 / (12 * -11))) + 17) + 5
= ((10 * (6 / -132)) + 17) + 5
= ((10 * 0) + 17) + 5
= (0 + 17) + 5
= 17 + 5
= 22
</pre>

## Constraints:

- <code>1 <= tokens.length <= 10<sup>4</sup></code>
- `tokens[i]` is either an operator: `"+"`, `"-"`, `"*"`, or `"/"`, or an integer in the range `[-200, 200]`.

