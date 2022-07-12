| [English](README_EN.md) | 简体中文 |

# [21. 合并两个有序链表](https://leetcode-cn.com/problems/merge-two-sorted-lists)
<p>将两个升序链表合并为一个新的 <strong>升序</strong> 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。 </p>

<p> </p>

<p><strong>示例 1：</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2020/10/03/merge_ex1.jpg" style="width: 662px; height: 302px;" />
<pre>
<strong>输入：</strong>l1 = [1,2,4], l2 = [1,3,4]
<strong>输出：</strong>[1,1,2,3,4,4]
</pre>

<p><strong>示例 2：</strong></p>

<pre>
<strong>输入：</strong>l1 = [], l2 = []
<strong>输出：</strong>[]
</pre>

<p><strong>示例 3：</strong></p>

<pre>
<strong>输入：</strong>l1 = [], l2 = [0]
<strong>输出：</strong>[0]
</pre>

<p> </p>

<p><strong>提示：</strong></p>

<ul>
	<li>两个链表的节点数目范围是 <code>[0, 50]</code></li>
	<li><code>-100 <= Node.val <= 100</code></li>
	<li><code>l1</code> 和 <code>l2</code> 均按 <strong>非递减顺序</strong> 排列</li>
</ul>

**标签:**  [递归](https://leetcode-cn.com/tag/recursion) [链表](https://leetcode-cn.com/tag/linked-list) 
 ### 相似题目
- 困难:	[合并K个升序链表](https://leetcode-cn.com/problems/merge-k-sorted-lists) 
- 简单:	[合并两个有序数组](https://leetcode-cn.com/problems/merge-sorted-array) 
- 中等:	[排序链表](https://leetcode-cn.com/problems/sort-list) 
- 中等:	[最短单词距离 II](https://leetcode-cn.com/problems/shortest-word-distance-ii) 
