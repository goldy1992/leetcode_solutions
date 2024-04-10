# Minimum Number of Arrows to Burst Balloons

- There are some spherical balloons taped onto a flat wall that represents the XY-plane.
- The balloons are represented as a 2D integer array `points` where <code>points[i] = [x<sub>start</sub>, x<sub>end</sub>]</code> denotes a balloon whose horizontal diameter stretches between <code>x<sub>start</sub></code> and <code>x<sub>end</sub></code>. 
- You do not know the exact y-coordinates of the balloons.
- Arrows can be shot up **directly vertically** (in the positive y-direction) from different points along the x-axis. 
- A balloon with <code>x<sub>start</sub></code> and <code>x<sub>end</sub></code> is burst by an arrow shot at `x` if <code>x<sub>start</sub> <= x <= x<sub>end</sub></code>. There is **no limit** to the number of arrows that can be shot. 
- A shot arrow keeps traveling up infinitely, bursting any balloons in its path.
- Given the array `points`, return the _**minimum** number of arrows that must be shot to burst all balloons_.


## Example 1:
<pre>
<b>Input:</b> points = [[10,16],[2,8],[1,6],[7,12]]
<b>Output:</b> 2
<b>Explanation:</b> The balloons can be burst by 2 arrows:
- Shoot an arrow at x = 6, bursting the balloons [2,8] and [1,6].
- Shoot an arrow at x = 11, bursting the balloons [10,16] and [7,12].
</pre>

## Example 2:
<pre>
<b>Input:</b> points = [[1,2],[3,4],[5,6],[7,8]]
<b>Output:</b> 4
<b>Explanation:</b> One arrow needs to be shot for each balloon for a total of 4 arrows.
</pre>

## Example 3:
<pre>
<b>Input:</b> points = [[1,2],[2,3],[3,4],[4,5]]
<b>Output:</b> 2
<b>Explanation:</b> The balloons can be burst by 2 arrows:
- Shoot an arrow at x = 2, bursting the balloons [1,2] and [2,3].
- Shoot an arrow at x = 4, bursting the balloons [3,4] and [4,5].
</pre>


## Constraints:
- <code>1 <= points.length <= 10<sup>5</sup></code>
- <code>points[i].length == 2</code>
- <code>-2<sup>31</sup> <= x<sub>start</sub> < x<sub>end</sub> <= 2<sup>31</sup>-1</code>

