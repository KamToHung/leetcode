| English | [简体中文](README.md) |

# [面试题 04.08. First Common Ancestor LCCI](https://leetcode-cn.com/problems/first-common-ancestor-lcci)
 ### Description
<p>Design an algorithm and write code to find the first common ancestor of two nodes in a binary tree. Avoid storing additional nodes in a data structure. NOTE: This is not necessarily a binary search tree.</p>

<p>For example, Given the following tree: root = [3,5,1,6,2,0,8,null,null,7,4]</p>

<pre>
    3
   / \
  5   1
 / \ / \
6  2 0  8
  / \
 7   4
</pre>

<p><strong>Example 1:</strong></p>

<pre>
<strong>Input:</strong> root = [3,5,1,6,2,0,8,null,null,7,4], p = 5, q = 1
<strong>Input:</strong> 3
<strong>Explanation:</strong> The first common ancestor of node 5 and node 1 is node 3.</pre>

<p><strong>Example 2:</strong></p>

<pre>
<strong>Input:</strong> root = [3,5,1,6,2,0,8,null,null,7,4], p = 5, q = 4
<strong>Output:</strong> 5
<strong>Explanation:</strong> The first common ancestor of node 5 and node 4 is node 5.</pre>

<p><strong>Notes:</strong></p>

<ul>
	<li>All node values are pairwise distinct.</li>
	<li>p, q are different node and both can be found in the given tree.</li>
</ul>

**Related Topics**  [Tree](https://leetcode-cn.com/tag/tree) [Depth-First Search](https://leetcode-cn.com/tag/depth-first-search) [Binary Tree](https://leetcode-cn.com/tag/binary-tree) 