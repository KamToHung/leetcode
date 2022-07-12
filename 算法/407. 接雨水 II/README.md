| [English](README_EN.md) | 简体中文 |

# [407. 接雨水 II](https://leetcode-cn.com/problems/trapping-rain-water-ii)
<p>给你一个&nbsp;<code>m x n</code>&nbsp;的矩阵，其中的值均为非负整数，代表二维高度图每个单元的高度，请计算图中形状最多能接多少体积的雨水。</p>

<p>&nbsp;</p>

<p><strong>示例 1:</strong></p>

<p><img alt="" src="https://assets.leetcode.com/uploads/2021/04/08/trap1-3d.jpg" /></p>

<pre>
<strong>输入:</strong> heightMap = [[1,4,3,1,3,2],[3,2,1,3,2,4],[2,3,3,2,3,1]]
<strong>输出:</strong> 4
<strong>解释:</strong> 下雨后，雨水将会被上图蓝色的方块中。总的接雨水量为1+2+1=4。
</pre>

<p><strong>示例&nbsp;2:</strong></p>

<p><img alt="" src="https://assets.leetcode.com/uploads/2021/04/08/trap2-3d.jpg" /></p>

<pre>
<strong>输入:</strong> heightMap = [[3,3,3,3,3],[3,2,2,2,3],[3,2,1,2,3],[3,2,2,2,3],[3,3,3,3,3]]
<strong>输出:</strong> 10
</pre>

<p>&nbsp;</p>

<p><strong>提示:</strong></p>

<ul>
	<li><code>m == heightMap.length</code></li>
	<li><code>n == heightMap[i].length</code></li>
	<li><code>1 &lt;= m, n &lt;= 200</code></li>
	<li><code>0 &lt;= heightMap[i][j] &lt;= 2 * 10<sup>4</sup></code></li>
</ul>

<p>&nbsp;</p>

**标签:**  [广度优先搜索](https://leetcode-cn.com/tag/breadth-first-search) [数组](https://leetcode-cn.com/tag/array) [矩阵](https://leetcode-cn.com/tag/matrix) [堆（优先队列）](https://leetcode-cn.com/tag/heap-priority-queue) 
 ### 相似题目
- 困难:	[接雨水](https://leetcode-cn.com/problems/trapping-rain-water) 
