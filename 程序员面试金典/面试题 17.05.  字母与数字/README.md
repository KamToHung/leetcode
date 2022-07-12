| [English](README_EN.md) | 简体中文 |

# [面试题 17.05.  字母与数字](https://leetcode-cn.com/problems/find-longest-subarray-lcci)
<p>给定一个放有字母和数字的数组，找到最长的子数组，且包含的字母和数字的个数相同。</p>

<p>返回该子数组，若存在多个最长子数组，返回左端点下标值最小的子数组。若不存在这样的数组，返回一个空数组。</p>

<p><strong>示例 1:</strong></p>

<pre>
<strong>输入: </strong>["A","1","B","C","D","2","3","4","E","5","F","G","6","7","H","I","J","K","L","M"]

<strong>输出: </strong>["A","1","B","C","D","2","3","4","E","5","F","G","6","7"]
</pre>

<p><strong>示例 2:</strong></p>

<pre>
<strong>输入: </strong>["A","A"]

<strong>输出: </strong>[]
</pre>

<p><strong>提示：</strong></p>

<ul>
	<li><code>array.length <= 100000</code></li>
</ul>

**标签:**  [数组](https://leetcode-cn.com/tag/array) [哈希表](https://leetcode-cn.com/tag/hash-table) [前缀和](https://leetcode-cn.com/tag/prefix-sum) 