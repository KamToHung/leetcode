| [English](README_EN.md) | 简体中文 |

# [152. 乘积最大子数组](https://leetcode-cn.com/problems/maximum-product-subarray)
<p>给你一个整数数组 <code>nums</code>&nbsp;，请你找出数组中乘积最大的非空连续子数组（该子数组中至少包含一个数字），并返回该子数组所对应的乘积。</p>

<p>测试用例的答案是一个&nbsp;<strong>32-位</strong> 整数。</p>

<p><strong>子数组</strong> 是数组的连续子序列。</p>

<p>&nbsp;</p>

<p><strong>示例 1:</strong></p>

<pre>
<strong>输入:</strong> nums = [2,3,-2,4]
<strong>输出:</strong> <code>6</code>
<strong>解释:</strong>&nbsp;子数组 [2,3] 有最大乘积 6。
</pre>

<p><strong>示例 2:</strong></p>

<pre>
<strong>输入:</strong> nums = [-2,0,-1]
<strong>输出:</strong> 0
<strong>解释:</strong>&nbsp;结果不能为 2, 因为 [-2,-1] 不是子数组。</pre>

<p>&nbsp;</p>

<p><strong>提示:</strong></p>

<ul>
	<li><code>1 &lt;= nums.length &lt;= 2 * 10<sup>4</sup></code></li>
	<li><code>-10 &lt;= nums[i] &lt;= 10</code></li>
	<li><code>nums</code> 的任何前缀或后缀的乘积都 <strong>保证</strong>&nbsp;是一个 <strong>32-位</strong> 整数</li>
</ul>

**标签:**  [数组](https://leetcode-cn.com/tag/array) [动态规划](https://leetcode-cn.com/tag/dynamic-programming) 
 ### 相似题目
- 简单:	[最大子数组和](https://leetcode-cn.com/problems/maximum-subarray) 
- 中等:	[打家劫舍](https://leetcode-cn.com/problems/house-robber) 
- 中等:	[除自身以外数组的乘积](https://leetcode-cn.com/problems/product-of-array-except-self) 
- 简单:	[三个数的最大乘积](https://leetcode-cn.com/problems/maximum-product-of-three-numbers) 
- 中等:	[乘积小于 K 的子数组](https://leetcode-cn.com/problems/subarray-product-less-than-k) 
