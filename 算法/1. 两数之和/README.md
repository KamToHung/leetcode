| [English](README_EN.md) | 简体中文 |

# [1. 两数之和](https://leetcode-cn.com/problems/two-sum)
<p>给定一个整数数组 <code>nums</code>&nbsp;和一个整数目标值 <code>target</code>，请你在该数组中找出 <strong>和为目标值 </strong><em><code>target</code></em>&nbsp; 的那&nbsp;<strong>两个</strong>&nbsp;整数，并返回它们的数组下标。</p>

<p>你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。</p>

<p>你可以按任意顺序返回答案。</p>

<p>&nbsp;</p>

<p><strong>示例 1：</strong></p>

<pre>
<strong>输入：</strong>nums = [2,7,11,15], target = 9
<strong>输出：</strong>[0,1]
<strong>解释：</strong>因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
</pre>

<p><strong>示例 2：</strong></p>

<pre>
<strong>输入：</strong>nums = [3,2,4], target = 6
<strong>输出：</strong>[1,2]
</pre>

<p><strong>示例 3：</strong></p>

<pre>
<strong>输入：</strong>nums = [3,3], target = 6
<strong>输出：</strong>[0,1]
</pre>

<p>&nbsp;</p>

<p><strong>提示：</strong></p>

<ul>
	<li><code>2 &lt;= nums.length &lt;= 10<sup>4</sup></code></li>
	<li><code>-10<sup>9</sup> &lt;= nums[i] &lt;= 10<sup>9</sup></code></li>
	<li><code>-10<sup>9</sup> &lt;= target &lt;= 10<sup>9</sup></code></li>
	<li><strong>只会存在一个有效答案</strong></li>
</ul>

<p><strong>进阶：</strong>你可以想出一个时间复杂度小于 <code>O(n<sup>2</sup>)</code> 的算法吗？</p>

**标签:**  [数组](https://leetcode-cn.com/tag/array) [哈希表](https://leetcode-cn.com/tag/hash-table) 
 ### 相似题目
- 中等:	[三数之和](https://leetcode-cn.com/problems/3sum) 
- 中等:	[四数之和](https://leetcode-cn.com/problems/4sum) 
- 中等:	[两数之和 II - 输入有序数组](https://leetcode-cn.com/problems/two-sum-ii-input-array-is-sorted) 
- 简单:	[两数之和 III - 数据结构设计](https://leetcode-cn.com/problems/two-sum-iii-data-structure-design) 
- 中等:	[和为 K 的子数组](https://leetcode-cn.com/problems/subarray-sum-equals-k) 
- 简单:	[两数之和 IV - 输入 BST](https://leetcode-cn.com/problems/two-sum-iv-input-is-a-bst) 
- 简单:	[小于 K 的两数之和](https://leetcode-cn.com/problems/two-sum-less-than-k) 
