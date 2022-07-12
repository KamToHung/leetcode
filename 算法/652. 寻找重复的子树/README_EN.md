| English | [简体中文](README.md) |

# [652. Find Duplicate Subtrees](https://leetcode-cn.com/problems/find-duplicate-subtrees)
 ### Description
<p>Given the <code>root</code>&nbsp;of a binary tree, return all <strong>duplicate subtrees</strong>.</p>

<p>For each kind of duplicate subtrees, you only need to return the root node of any <b>one</b> of them.</p>

<p>Two trees are <strong>duplicate</strong> if they have the <strong>same structure</strong> with the <strong>same node values</strong>.</p>

<p>&nbsp;</p>
<p><strong>Example 1:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2020/08/16/e1.jpg" style="width: 450px; height: 354px;" />
<pre>
<strong>Input:</strong> root = [1,2,3,4,null,2,4,null,null,4]
<strong>Output:</strong> [[2,4],[4]]
</pre>

<p><strong>Example 2:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2020/08/16/e2.jpg" style="width: 321px; height: 201px;" />
<pre>
<strong>Input:</strong> root = [2,1,1]
<strong>Output:</strong> [[1]]
</pre>

<p><strong>Example 3:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2020/08/16/e33.jpg" style="width: 450px; height: 303px;" />
<pre>
<strong>Input:</strong> root = [2,2,2,3,null,3,null]
<strong>Output:</strong> [[2,3],[3]]
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li>The number of the nodes in the tree will be in the range <code>[1, 10^4]</code></li>
	<li><code>-200 &lt;= Node.val &lt;= 200</code></li>
</ul>

**Related Topics**  [Tree](https://leetcode-cn.com/tag/tree) [Depth-First Search](https://leetcode-cn.com/tag/depth-first-search) [Hash Table](https://leetcode-cn.com/tag/hash-table) [Binary Tree](https://leetcode-cn.com/tag/binary-tree) 

### Similar Questions
 - Hard:	[Serialize and Deserialize Binary Tree](https://leetcode-cn.com/problems/serialize-and-deserialize-binary-tree) 
 - Medium:	[Serialize and Deserialize BST](https://leetcode-cn.com/problems/serialize-and-deserialize-bst) 
 - Easy:	[Construct String from Binary Tree](https://leetcode-cn.com/problems/construct-string-from-binary-tree) 
