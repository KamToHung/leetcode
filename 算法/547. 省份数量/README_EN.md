| English | [简体中文](README.md) |

# [547. Number of Provinces](https://leetcode-cn.com/problems/number-of-provinces)
 ### Description
<p>There are <code>n</code> cities. Some of them are connected, while some are not. If city <code>a</code> is connected directly with city <code>b</code>, and city <code>b</code> is connected directly with city <code>c</code>, then city <code>a</code> is connected indirectly with city <code>c</code>.</p>

<p>A <strong>province</strong> is a group of directly or indirectly connected cities and no other cities outside of the group.</p>

<p>You are given an <code>n x n</code> matrix <code>isConnected</code> where <code>isConnected[i][j] = 1</code> if the <code>i<sup>th</sup></code> city and the <code>j<sup>th</sup></code> city are directly connected, and <code>isConnected[i][j] = 0</code> otherwise.</p>

<p>Return <em>the total number of <strong>provinces</strong></em>.</p>

<p>&nbsp;</p>
<p><strong>Example 1:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2020/12/24/graph1.jpg" style="width: 222px; height: 142px;" />
<pre>
<strong>Input:</strong> isConnected = [[1,1,0],[1,1,0],[0,0,1]]
<strong>Output:</strong> 2
</pre>

<p><strong>Example 2:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2020/12/24/graph2.jpg" style="width: 222px; height: 142px;" />
<pre>
<strong>Input:</strong> isConnected = [[1,0,0],[0,1,0],[0,0,1]]
<strong>Output:</strong> 3
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= n &lt;= 200</code></li>
	<li><code>n == isConnected.length</code></li>
	<li><code>n == isConnected[i].length</code></li>
	<li><code>isConnected[i][j]</code> is <code>1</code> or <code>0</code>.</li>
	<li><code>isConnected[i][i] == 1</code></li>
	<li><code>isConnected[i][j] == isConnected[j][i]</code></li>
</ul>

**Related Topics**  [Depth-First Search](https://leetcode-cn.com/tag/depth-first-search) [Breadth-First Search](https://leetcode-cn.com/tag/breadth-first-search) [Union Find](https://leetcode-cn.com/tag/union-find) [Graph](https://leetcode-cn.com/tag/graph) 

### Similar Questions
 - Medium:	[Number of Connected Components in an Undirected Graph](https://leetcode-cn.com/problems/number-of-connected-components-in-an-undirected-graph) 
 - Easy:	[Robot Return to Origin](https://leetcode-cn.com/problems/robot-return-to-origin) 
 - Easy:	[Sentence Similarity](https://leetcode-cn.com/problems/sentence-similarity) 
 - Medium:	[Sentence Similarity II](https://leetcode-cn.com/problems/sentence-similarity-ii) 
 - Medium:	[The Earliest Moment When Everyone Become Friends](https://leetcode-cn.com/problems/the-earliest-moment-when-everyone-become-friends) 
