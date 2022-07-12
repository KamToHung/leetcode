| [English](README_EN.md) | 简体中文 |

# [719. 找出第 K 小的数对距离](https://leetcode-cn.com/problems/find-k-th-smallest-pair-distance)
<p>数对 <code>(a,b)</code> 由整数 <code>a</code> 和 <code>b</code> 组成，其数对距离定义为 <code>a</code> 和 <code>b</code> 的绝对差值。</p>

<p>给你一个整数数组 <code>nums</code> 和一个整数 <code>k</code> ，数对由 <code>nums[i]</code> 和 <code>nums[j]</code> 组成且满足 <code>0 &lt;= i &lt; j &lt; nums.length</code> 。返回 <strong>所有数对距离中</strong> 第 <code>k</code> 小的数对距离。</p>

<p>&nbsp;</p>

<p><strong>示例 1：</strong></p>

<pre>
<strong>输入：</strong>nums = [1,3,1], k = 1
<strong>输出：</strong>0
<strong>解释：</strong>数对和对应的距离如下：
(1,3) -&gt; 2
(1,1) -&gt; 0
(3,1) -&gt; 2
距离第 1 小的数对是 (1,1) ，距离为 0 。
</pre>

<p><strong>示例 2：</strong></p>

<pre>
<strong>输入：</strong>nums = [1,1,1], k = 2
<strong>输出：</strong>0
</pre>

<p><strong>示例 3：</strong></p>

<pre>
<strong>输入：</strong>nums = [1,6,1], k = 3
<strong>输出：</strong>5
</pre>

<p>&nbsp;</p>

<p><strong>提示：</strong></p>

<ul>
	<li><code>n == nums.length</code></li>
	<li><code>2 &lt;= n &lt;= 10<sup>4</sup></code></li>
	<li><code>0 &lt;= nums[i] &lt;= 10<sup>6</sup></code></li>
	<li><code>1 &lt;= k &lt;= n * (n - 1) / 2</code></li>
</ul>

**标签:**  [数组](https://leetcode-cn.com/tag/array) [双指针](https://leetcode-cn.com/tag/two-pointers) [二分查找](https://leetcode-cn.com/tag/binary-search) [排序](https://leetcode-cn.com/tag/sorting) 
 ### 相似题目
- 中等:	[查找和最小的 K 对数字](https://leetcode-cn.com/problems/find-k-pairs-with-smallest-sums) 
- 中等:	[有序矩阵中第 K 小的元素](https://leetcode-cn.com/problems/kth-smallest-element-in-a-sorted-matrix) 
- 中等:	[找到 K 个最接近的元素](https://leetcode-cn.com/problems/find-k-closest-elements) 
- 困难:	[乘法表中第k小的数](https://leetcode-cn.com/problems/kth-smallest-number-in-multiplication-table) 
- 中等:	[第 K 个最小的素数分数](https://leetcode-cn.com/problems/k-th-smallest-prime-fraction) 
