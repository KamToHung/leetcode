| [English](README_EN.md) | 简体中文 |

# [94. 二叉树的中序遍历](https://leetcode-cn.com/problems/binary-tree-inorder-traversal)
<p>给定一个二叉树的根节点 <code>root</code> ，返回 <em>它的 <strong>中序</strong>&nbsp;遍历</em> 。</p>

<p>&nbsp;</p>

<p><strong>示例 1：</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2020/09/15/inorder_1.jpg" style="height: 200px; width: 125px;" />
<pre>
<strong>输入：</strong>root = [1,null,2,3]
<strong>输出：</strong>[1,3,2]
</pre>

<p><strong>示例 2：</strong></p>

<pre>
<strong>输入：</strong>root = []
<strong>输出：</strong>[]
</pre>

<p><strong>示例 3：</strong></p>

<pre>
<strong>输入：</strong>root = [1]
<strong>输出：</strong>[1]
</pre>

<p>&nbsp;</p>

<p><strong>提示：</strong></p>

<ul>
	<li>树中节点数目在范围 <code>[0, 100]</code> 内</li>
	<li><code>-100 &lt;= Node.val &lt;= 100</code></li>
</ul>

<p>&nbsp;</p>

<p><strong>进阶:</strong>&nbsp;递归算法很简单，你可以通过迭代算法完成吗？</p>

**标签:**  [栈](https://leetcode-cn.com/tag/stack) [树](https://leetcode-cn.com/tag/tree) [深度优先搜索](https://leetcode-cn.com/tag/depth-first-search) [二叉树](https://leetcode-cn.com/tag/binary-tree) 
 ### 相似题目
- 中等:	[验证二叉搜索树](https://leetcode-cn.com/problems/validate-binary-search-tree) 
- 简单:	[二叉树的前序遍历](https://leetcode-cn.com/problems/binary-tree-preorder-traversal) 
- 简单:	[二叉树的后序遍历](https://leetcode-cn.com/problems/binary-tree-postorder-traversal) 
- 中等:	[二叉搜索树迭代器](https://leetcode-cn.com/problems/binary-search-tree-iterator) 
- 中等:	[二叉搜索树中第K小的元素](https://leetcode-cn.com/problems/kth-smallest-element-in-a-bst) 
- 困难:	[最接近的二叉搜索树值 II](https://leetcode-cn.com/problems/closest-binary-search-tree-value-ii) 
- 中等:	[二叉搜索树中的中序后继](https://leetcode-cn.com/problems/inorder-successor-in-bst) 
- 中等:	[将二叉搜索树转化为排序的双向链表](https://leetcode-cn.com/problems/convert-binary-search-tree-to-sorted-doubly-linked-list) 
- 简单:	[二叉搜索树节点最小距离](https://leetcode-cn.com/problems/minimum-distance-between-bst-nodes) 
