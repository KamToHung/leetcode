| [English](README_EN.md) | 简体中文 |

# [786. 第 K 个最小的素数分数](https://leetcode-cn.com/problems/k-th-smallest-prime-fraction)
<p>给你一个按递增顺序排序的数组 <code>arr</code> 和一个整数 <code>k</code> 。数组 <code>arr</code> 由 <code>1</code> 和若干 <strong>素数</strong>&nbsp; 组成，且其中所有整数互不相同。</p>

<p>对于每对满足 <code>0 &lt;= i &lt; j &lt; arr.length</code> 的 <code>i</code> 和 <code>j</code> ，可以得到分数 <code>arr[i] / arr[j]</code> 。</p>

<p>那么第&nbsp;<code>k</code>&nbsp;个最小的分数是多少呢?&nbsp; 以长度为 <code>2</code> 的整数数组返回你的答案, 这里&nbsp;<code>answer[0] == arr[i]</code>&nbsp;且&nbsp;<code>answer[1] == arr[j]</code> 。</p>
&nbsp;

<p><strong>示例 1：</strong></p>

<pre>
<strong>输入：</strong>arr = [1,2,3,5], k = 3
<strong>输出：</strong>[2,5]
<strong>解释：</strong>已构造好的分数,排序后如下所示: 
1/5, 1/3, 2/5, 1/2, 3/5, 2/3
很明显第三个最小的分数是 2/5
</pre>

<p><strong>示例 2：</strong></p>

<pre>
<strong>输入：</strong>arr = [1,7], k = 1
<strong>输出：</strong>[1,7]
</pre>

<p>&nbsp;</p>

<p><strong>提示：</strong></p>

<ul>
	<li><code>2 &lt;= arr.length &lt;= 1000</code></li>
	<li><code>1 &lt;= arr[i] &lt;= 3 * 10<sup>4</sup></code></li>
	<li><code>arr[0] == 1</code></li>
	<li><code>arr[i]</code> 是一个 <strong>素数</strong> ，<code>i &gt; 0</code></li>
	<li><code>arr</code> 中的所有数字 <strong>互不相同</strong> ，且按 <strong>严格递增</strong> 排序</li>
	<li><code>1 &lt;= k &lt;= arr.length * (arr.length - 1) / 2</code></li>
</ul>

**标签:**  [数组](https://leetcode-cn.com/tag/array) [二分查找](https://leetcode-cn.com/tag/binary-search) [排序](https://leetcode-cn.com/tag/sorting) [堆（优先队列）](https://leetcode-cn.com/tag/heap-priority-queue) 
 ### 相似题目
- 中等:	[有序矩阵中第 K 小的元素](https://leetcode-cn.com/problems/kth-smallest-element-in-a-sorted-matrix) 
- 困难:	[乘法表中第k小的数](https://leetcode-cn.com/problems/kth-smallest-number-in-multiplication-table) 
- 困难:	[找出第 K 小的数对距离](https://leetcode-cn.com/problems/find-k-th-smallest-pair-distance) 
