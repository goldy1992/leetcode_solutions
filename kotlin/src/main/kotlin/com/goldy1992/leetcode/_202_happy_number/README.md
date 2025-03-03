# Happy Number

- Write an algorithm to determine if a number `n` is _happy_.
- A **happy number** is a number defined by the following process:
   - Starting with any _positive_ integer, replace the number by the _sum of the squares_ of its digits. 
   - Repeat the process until the number equals `1` (where it will stay), or it loops endlessly in a cycle which does not include `1`. 
   - Those numbers for which this process ends in `1` are happy.

- Return `true` if `n` is a happy number, and `false` if not.

## Example 1:
<pre>
  <b>Input:</b> n = 19
  <b>Output:</b> true
  <b>Explanation:</b>
    1<sup>2</sup> + 9<sup>2</sup> = 82
    8<sup>2</sup> + 2<sup>2</sup> = 68
    6<sup>2</sup> + 8<sup>2</sup> = 100
    1<sup>2</sup> + 0<sup>2</sup> + 0<sup>2</sup> = 1
</pre>
## Example 2:
```
Input: n = 2
Output: false
```

## Constraints:
- `1 <= n <= 231 - 1`

