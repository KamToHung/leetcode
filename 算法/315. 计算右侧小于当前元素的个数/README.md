| [English](README_EN.md) | 简体中文 |

# [315. 计算右侧小于当前元素的个数](https://leetcode-cn.com/problems/count-of-smaller-numbers-after-self)
<p>给你一个整数数组 <code>nums</code><em> </em>，按要求返回一个新数组&nbsp;<code>counts</code><em> </em>。数组 <code>counts</code> 有该性质： <code>counts[i]</code> 的值是&nbsp; <code>nums[i]</code> 右侧小于&nbsp;<code>nums[i]</code> 的元素的数量。</p>

<p>&nbsp;</p>

<p><strong>示例 1：</strong></p>

<pre>
<strong>输入：</strong>nums = [5,2,6,1]
<strong>输出：</strong><code>[2,1,1,0] 
<strong>解释：</strong></code>
5 的右侧有 <strong>2 </strong>个更小的元素 (2 和 1)
2 的右侧仅有 <strong>1 </strong>个更小的元素 (1)
6 的右侧有 <strong>1 </strong>个更小的元素 (1)
1 的右侧有 <strong>0 </strong>个更小的元素
</pre>

<p><strong>示例 2：</strong></p>

<pre>
<strong>输入：</strong>nums = [-1]
<strong>输出：</strong>[0]
</pre>

<p><strong>示例 3：</strong></p>

<pre>
<strong>输入：</strong>nums = [-1,-1]
<strong>输出：</strong>[0,0]
</pre>

<p>&nbsp;</p>

<p><strong>提示：</strong></p>

<ul>
	<li><code>1 &lt;= nums.length &lt;= 10<sup>5</sup></code></li>
	<li><code>-10<sup>4</sup> &lt;= nums[i] &lt;= 10<sup>4</sup></code></li>
</ul>

**标签:**  [树状数组](https://leetcode-cn.com/tag/binary-indexed-tree) [线段树](https://leetcode-cn.com/tag/segment-tree) [数组](https://leetcode-cn.com/tag/array) [二分查找](https://leetcode-cn.com/tag/binary-search) [分治](https://leetcode-cn.com/tag/divide-and-conquer) [有序集合](https://leetcode-cn.com/tag/ordered-set) [归并排序](https://leetcode-cn.com/tag/merge-sort) 
 ### 相似题目
- 困难:	[区间和的个数](https://leetcode-cn.com/problems/count-of-range-sum) 
- 中等:	[根据身高重建队列](https://leetcode-cn.com/problems/queue-reconstruction-by-height) 
- 困难:	[翻转对](https://leetcode-cn.com/problems/reverse-pairs) 
