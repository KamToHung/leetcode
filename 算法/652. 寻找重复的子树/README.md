| [English](README_EN.md) | 简体中文 |

# [652. 寻找重复的子树](https://leetcode-cn.com/problems/find-duplicate-subtrees)
<p>给定一棵二叉树 <code>root</code>，返回所有<strong>重复的子树</strong>。</p>

<p>对于同一类的重复子树，你只需要返回其中任意<strong>一棵</strong>的根结点即可。</p>

<p>如果两棵树具有<strong>相同的结构</strong>和<strong>相同的结点值</strong>，则它们是<strong>重复</strong>的。</p>

<p>&nbsp;</p>

<p><strong>示例 1：</strong></p>

<p><img alt="" src="https://assets.leetcode.com/uploads/2020/08/16/e1.jpg" style="height: 236px; width: 300px;" /></p>

<pre>
<strong>输入：</strong>root = [1,2,3,4,null,2,4,null,null,4]
<strong>输出：</strong>[[2,4],[4]]</pre>

<p><strong>示例 2：</strong></p>

<p><img alt="" src="https://assets.leetcode.com/uploads/2020/08/16/e2.jpg" style="height: 125px; width: 200px;" /></p>

<pre>
<strong>输入：</strong>root = [2,1,1]
<strong>输出：</strong>[[1]]</pre>

<p><strong>示例 3：</strong></p>

<p><strong><img alt="" src="https://assets.leetcode.com/uploads/2020/08/16/e33.jpg" style="height: 202px; width: 300px;" /></strong></p>

<pre>
<strong>输入：</strong>root = [2,2,2,3,null,3,null]
<strong>输出：</strong>[[2,3],[3]]</pre>

<p>&nbsp;</p>

<p><strong>提示：</strong></p>

<ul>
	<li>树中的结点数在<code>[1,10^4]</code>范围内。</li>
	<li><code>-200 &lt;= Node.val &lt;= 200</code></li>
</ul>

**标签:**  [树](https://leetcode-cn.com/tag/tree) [深度优先搜索](https://leetcode-cn.com/tag/depth-first-search) [哈希表](https://leetcode-cn.com/tag/hash-table) [二叉树](https://leetcode-cn.com/tag/binary-tree) 
 ### 相似题目
- 困难:	[二叉树的序列化与反序列化](https://leetcode-cn.com/problems/serialize-and-deserialize-binary-tree) 
- 中等:	[序列化和反序列化二叉搜索树](https://leetcode-cn.com/problems/serialize-and-deserialize-bst) 
- 简单:	[根据二叉树创建字符串](https://leetcode-cn.com/problems/construct-string-from-binary-tree) 
