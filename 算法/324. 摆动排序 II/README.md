| [English](README_EN.md) | 简体中文 |

# [324. 摆动排序 II](https://leetcode-cn.com/problems/wiggle-sort-ii)
<p>给你一个整数数组 <code>nums</code>，将它重新排列成 <code>nums[0] < nums[1] > nums[2] < nums[3]...</code> 的顺序。</p>

<p>你可以假设所有输入数组都可以得到满足题目要求的结果。</p>

<p> </p>

<p><strong>示例 1：</strong></p>

<pre>
<strong>输入：</strong>nums = [1,5,1,1,6,4]
<strong>输出：</strong>[1,6,1,5,1,4]
<strong>解释：</strong>[1,4,1,5,1,6] 同样是符合题目要求的结果，可以被判题程序接受。
</pre>

<p><strong>示例 2：</strong></p>

<pre>
<strong>输入：</strong>nums = [1,3,2,2,3,1]
<strong>输出：</strong>[2,3,1,3,1,2]
</pre>

<p> </p>

<p><strong>提示：</strong></p>

<ul>
	<li><code>1 <= nums.length <= 5 * 10<sup>4</sup></code></li>
	<li><code>0 <= nums[i] <= 5000</code></li>
	<li>题目数据保证，对于给定的输入 <code>nums</code> ，总能产生满足题目要求的结果</li>
</ul>

<p> </p>

<p><strong>进阶：</strong>你能用 O(n) 时间复杂度和 / 或原地 O(1) 额外空间来实现吗？</p>

**标签:**  [数组](https://leetcode-cn.com/tag/array) [分治](https://leetcode-cn.com/tag/divide-and-conquer) [快速选择](https://leetcode-cn.com/tag/quickselect) [排序](https://leetcode-cn.com/tag/sorting) 
 ### 相似题目
- 中等:	[颜色分类](https://leetcode-cn.com/problems/sort-colors) 
- 中等:	[数组中的第K个最大元素](https://leetcode-cn.com/problems/kth-largest-element-in-an-array) 
- 中等:	[摆动排序](https://leetcode-cn.com/problems/wiggle-sort) 
