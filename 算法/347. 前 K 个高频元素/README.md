| [English](README_EN.md) | 简体中文 |

# [347. 前 K 个高频元素](https://leetcode-cn.com/problems/top-k-frequent-elements)
<p>给你一个整数数组 <code>nums</code> 和一个整数 <code>k</code> ，请你返回其中出现频率前 <code>k</code> 高的元素。你可以按 <strong>任意顺序</strong> 返回答案。</p>

<p> </p>

<p><strong>示例 1:</strong></p>

<pre>
<strong>输入: </strong>nums = [1,1,1,2,2,3], k = 2
<strong>输出: </strong>[1,2]
</pre>

<p><strong>示例 2:</strong></p>

<pre>
<strong>输入: </strong>nums = [1], k = 1
<strong>输出: </strong>[1]</pre>

<p> </p>

<p><strong>提示：</strong></p>

<ul>
	<li><code>1 <= nums.length <= 10<sup>5</sup></code></li>
	<li><code>k</code> 的取值范围是 <code>[1, 数组中不相同的元素的个数]</code></li>
	<li>题目数据保证答案唯一，换句话说，数组中前 <code>k</code> 个高频元素的集合是唯一的</li>
</ul>

<p> </p>

<p><strong>进阶：</strong>你所设计算法的时间复杂度 <strong>必须</strong> 优于 <code>O(n log n)</code> ，其中 <code>n</code><em> </em>是数组大小。</p>

**标签:**  [数组](https://leetcode-cn.com/tag/array) [哈希表](https://leetcode-cn.com/tag/hash-table) [分治](https://leetcode-cn.com/tag/divide-and-conquer) [桶排序](https://leetcode-cn.com/tag/bucket-sort) [计数](https://leetcode-cn.com/tag/counting) [快速选择](https://leetcode-cn.com/tag/quickselect) [排序](https://leetcode-cn.com/tag/sorting) [堆（优先队列）](https://leetcode-cn.com/tag/heap-priority-queue) 
 ### 相似题目
- 中等:	[统计词频](https://leetcode-cn.com/problems/word-frequency) 
- 中等:	[数组中的第K个最大元素](https://leetcode-cn.com/problems/kth-largest-element-in-an-array) 
- 中等:	[根据字符出现频率排序](https://leetcode-cn.com/problems/sort-characters-by-frequency) 
- 中等:	[分割数组为连续子序列](https://leetcode-cn.com/problems/split-array-into-consecutive-subsequences) 
- 中等:	[前K个高频单词](https://leetcode-cn.com/problems/top-k-frequent-words) 
- 中等:	[最接近原点的 K 个点](https://leetcode-cn.com/problems/k-closest-points-to-origin) 
