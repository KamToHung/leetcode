| [English](README_EN.md) | 简体中文 |

# [102. 二叉树的层序遍历](https://leetcode-cn.com/problems/binary-tree-level-order-traversal)
<p>给你二叉树的根节点 <code>root</code> ，返回其节点值的 <strong>层序遍历</strong> 。 （即逐层地，从左到右访问所有节点）。</p>

<p>&nbsp;</p>

<p><strong>示例 1：</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2021/02/19/tree1.jpg" style="width: 277px; height: 302px;" />
<pre>
<strong>输入：</strong>root = [3,9,20,null,null,15,7]
<strong>输出：</strong>[[3],[9,20],[15,7]]
</pre>

<p><strong>示例 2：</strong></p>

<pre>
<strong>输入：</strong>root = [1]
<strong>输出：</strong>[[1]]
</pre>

<p><strong>示例 3：</strong></p>

<pre>
<strong>输入：</strong>root = []
<strong>输出：</strong>[]
</pre>

<p>&nbsp;</p>

<p><strong>提示：</strong></p>

<ul>
	<li>树中节点数目在范围 <code>[0, 2000]</code> 内</li>
	<li><code>-1000 &lt;= Node.val &lt;= 1000</code></li>
</ul>

**标签:**  [树](https://leetcode-cn.com/tag/tree) [广度优先搜索](https://leetcode-cn.com/tag/breadth-first-search) [二叉树](https://leetcode-cn.com/tag/binary-tree) 
 ### 相似题目
- 中等:	[二叉树的锯齿形层序遍历](https://leetcode-cn.com/problems/binary-tree-zigzag-level-order-traversal) 
- 中等:	[二叉树的层序遍历 II](https://leetcode-cn.com/problems/binary-tree-level-order-traversal-ii) 
- 简单:	[二叉树的最小深度](https://leetcode-cn.com/problems/minimum-depth-of-binary-tree) 
- 中等:	[二叉树的垂直遍历](https://leetcode-cn.com/problems/binary-tree-vertical-order-traversal) 
- 简单:	[二叉树的层平均值](https://leetcode-cn.com/problems/average-of-levels-in-binary-tree) 
- 中等:	[N 叉树的层序遍历](https://leetcode-cn.com/problems/n-ary-tree-level-order-traversal) 
- 简单:	[二叉树的堂兄弟节点](https://leetcode-cn.com/problems/cousins-in-binary-tree) 
