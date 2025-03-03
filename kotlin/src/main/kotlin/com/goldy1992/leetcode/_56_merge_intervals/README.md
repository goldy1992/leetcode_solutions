# Merge Intervals

- Given an array of `intervals` where `intervals[i] = [starti, endi]`, merge all overlapping intervals, and return _an array of the non-overlapping intervals that cover all the intervals in the input_.

## Example 1:
<pre>
<b>Input:</b> intervals = [[1,3],[2,6],[8,10],[15,18]]
<b>Output:</b> [[1,6],[8,10],[15,18]]
<b>Explanation:</b> Since intervals [1,3] and [2,6] overlap, merge them into [1,6].
</pre>

## Example 2:
<pre>
<b>Input:</b> intervals = [[1,4],[4,5]]
<b>Output:</b> [[1,5]]
<b>Explanation:</b> Intervals [1,4] and [4,5] are considered overlapping.
</pre>

## Constraints:

- `1 <= intervals.length <= 104`
- `intervals[i].length == 2`
- `0 <= starti <= endi <= 104`

