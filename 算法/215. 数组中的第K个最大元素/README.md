| [English](README_EN.md) | 简体中文 |

# [215. 数组中的第K个最大元素](https://leetcode-cn.com/problems/kth-largest-element-in-an-array)
<p>给定整数数组 <code>nums</code> 和整数 <code>k</code>，请返回数组中第 <code><strong>k</strong></code> 个最大的元素。</p>

<p>请注意，你需要找的是数组排序后的第 <code>k</code> 个最大的元素，而不是第 <code>k</code> 个不同的元素。</p>

<p> </p>

<p><strong>示例 1:</strong></p>

<pre>
<strong>输入:</strong> <code>[3,2,1,5,6,4] 和</code> k = 2
<strong>输出:</strong> 5
</pre>

<p><strong>示例 2:</strong></p>

<pre>
<strong>输入:</strong> <code>[3,2,3,1,2,4,5,5,6] 和</code> k = 4
<strong>输出:</strong> 4</pre>

<p> </p>

<p><strong>提示： </strong></p>

<ul>
	<li><code>1 <= k <= nums.length <= 10<sup>4</sup></code></li>
	<li><code>-10<sup>4</sup> <= nums[i] <= 10<sup>4</sup></code></li>
</ul>

**标签:**  [数组](https://leetcode-cn.com/tag/array) [分治](https://leetcode-cn.com/tag/divide-and-conquer) [快速选择](https://leetcode-cn.com/tag/quickselect) [排序](https://leetcode-cn.com/tag/sorting) [堆（优先队列）](https://leetcode-cn.com/tag/heap-priority-queue) 
 ### 相似题目
- 中等:	[摆动排序 II](https://leetcode-cn.com/problems/wiggle-sort-ii) 
- 中等:	[前 K 个高频元素](https://leetcode-cn.com/problems/top-k-frequent-elements) 
- 简单:	[第三大的数](https://leetcode-cn.com/problems/third-maximum-number) 
- 简单:	[数据流中的第 K 大元素](https://leetcode-cn.com/problems/kth-largest-element-in-a-stream) 
- 中等:	[最接近原点的 K 个点](https://leetcode-cn.com/problems/k-closest-points-to-origin) 
