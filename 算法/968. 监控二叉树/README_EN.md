| English | [简体中文](README.md) |

# [968. Binary Tree Cameras](https://leetcode-cn.com/problems/binary-tree-cameras)
 ### Description
<p>You are given the <code>root</code> of a binary tree. We install cameras on the tree nodes where each camera at a node can monitor its parent, itself, and its immediate children.</p>

<p>Return <em>the minimum number of cameras needed to monitor all nodes of the tree</em>.</p>

<p>&nbsp;</p>
<p><strong>Example 1:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2018/12/29/bst_cameras_01.png" style="width: 138px; height: 163px;" />
<pre>
<strong>Input:</strong> root = [0,0,null,0,0]
<strong>Output:</strong> 1
<strong>Explanation:</strong> One camera is enough to monitor all nodes if placed as shown.
</pre>

<p><strong>Example 2:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2018/12/29/bst_cameras_02.png" style="width: 139px; height: 312px;" />
<pre>
<strong>Input:</strong> root = [0,0,null,0,null,0,null,null,0]
<strong>Output:</strong> 2
<strong>Explanation:</strong> At least two cameras are needed to monitor all nodes of the tree. The above image shows one of the valid configurations of camera placement.
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li>The number of nodes in the tree is in the range <code>[1, 1000]</code>.</li>
	<li><code>Node.val == 0</code></li>
</ul>

**Related Topics**  [Tree](https://leetcode-cn.com/tag/tree) [Depth-First Search](https://leetcode-cn.com/tag/depth-first-search) [Dynamic Programming](https://leetcode-cn.com/tag/dynamic-programming) [Binary Tree](https://leetcode-cn.com/tag/binary-tree) 

### Similar Question
 - Medium:	[Distribute Coins in Binary Tree](https://leetcode-cn.com/problems/distribute-coins-in-binary-tree) 
