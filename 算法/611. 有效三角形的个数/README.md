| [English](README_EN.md) | 简体中文 |

# [611. 有效三角形的个数](https://leetcode-cn.com/problems/valid-triangle-number)
<p>给定一个包含非负整数的数组&nbsp;<code>nums</code> ，返回其中可以组成三角形三条边的三元组个数。</p>

<p>&nbsp;</p>

<p><strong>示例 1:</strong></p>

<pre>
<strong>输入:</strong> nums = [2,2,3,4]
<strong>输出:</strong> 3
<strong>解释:</strong>有效的组合是: 
2,3,4 (使用第一个 2)
2,3,4 (使用第二个 2)
2,2,3
</pre>

<p><strong>示例 2:</strong></p>

<pre>
<strong>输入:</strong> nums = [4,2,3,4]
<strong>输出:</strong> 4</pre>

<p>&nbsp;</p>

<p><strong>提示:</strong></p>

<ul>
	<li><code>1 &lt;= nums.length &lt;= 1000</code></li>
	<li><code>0 &lt;= nums[i] &lt;= 1000</code></li>
</ul>

**标签:**  [贪心](https://leetcode-cn.com/tag/greedy) [数组](https://leetcode-cn.com/tag/array) [双指针](https://leetcode-cn.com/tag/two-pointers) [二分查找](https://leetcode-cn.com/tag/binary-search) [排序](https://leetcode-cn.com/tag/sorting) 
 ### 相似题目
- 中等:	[较小的三数之和](https://leetcode-cn.com/problems/3sum-smaller) 
