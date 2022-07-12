| English | [简体中文](README.md) |

# [面试题 16.19. Pond Sizes LCCI](https://leetcode-cn.com/problems/pond-sizes-lcci)
 ### Description
<p>You have an integer matrix representing a plot of land, where the value at that loca&shy;tion represents the height above sea level. A value of zero indicates water. A pond is a region of water connected vertically, horizontally, or diagonally. The size of the pond is the total number of connected water cells. Write a method to compute the sizes of all ponds in the matrix.</p>

<p><strong>Example: </strong></p>

<pre>
<strong>Input: </strong>
[
  [0,2,1,0],
  [0,1,0,1],
  [1,1,0,1],
  [0,1,0,1]
]
<strong>Output: </strong> [1,2,4]
</pre>

<p><strong>Note: </strong></p>

<ul>
	<li><code>0 &lt; len(land) &lt;= 1000</code></li>
	<li><code>0 &lt; len(land[i]) &lt;= 1000</code></li>
</ul>

**Related Topics**  [Depth-First Search](https://leetcode-cn.com/tag/depth-first-search) [Breadth-First Search](https://leetcode-cn.com/tag/breadth-first-search) [Union Find](https://leetcode-cn.com/tag/union-find) [Array](https://leetcode-cn.com/tag/array) [Matrix](https://leetcode-cn.com/tag/matrix) 