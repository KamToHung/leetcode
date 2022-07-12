| English | [简体中文](README.md) |

# [658. Find K Closest Elements](https://leetcode-cn.com/problems/find-k-closest-elements)
 ### Description
<p>Given a <strong>sorted</strong> integer array <code>arr</code>, two integers <code>k</code> and <code>x</code>, return the <code>k</code> closest integers to <code>x</code> in the array. The result should also be sorted in ascending order.</p>

<p>An integer <code>a</code> is closer to <code>x</code> than an integer <code>b</code> if:</p>

<ul>
	<li><code>|a - x| &lt; |b - x|</code>, or</li>
	<li><code>|a - x| == |b - x|</code> and <code>a &lt; b</code></li>
</ul>

<p>&nbsp;</p>
<p><strong>Example 1:</strong></p>
<pre><strong>Input:</strong> arr = [1,2,3,4,5], k = 4, x = 3
<strong>Output:</strong> [1,2,3,4]
</pre><p><strong>Example 2:</strong></p>
<pre><strong>Input:</strong> arr = [1,2,3,4,5], k = 4, x = -1
<strong>Output:</strong> [1,2,3,4]
</pre>
<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= k &lt;= arr.length</code></li>
	<li><code>1 &lt;= arr.length &lt;= 10<sup>4</sup></code></li>
	<li><code>arr</code> is sorted in <strong>ascending</strong> order.</li>
	<li><code>-10<sup>4</sup> &lt;= arr[i], x &lt;= 10<sup>4</sup></code></li>
</ul>

**Related Topics**  [Array](https://leetcode-cn.com/tag/array) [Two Pointers](https://leetcode-cn.com/tag/two-pointers) [Binary Search](https://leetcode-cn.com/tag/binary-search) [Sorting](https://leetcode-cn.com/tag/sorting) [Heap (Priority Queue)](https://leetcode-cn.com/tag/heap-priority-queue) 

### Similar Questions
 - Easy:	[Guess Number Higher or Lower](https://leetcode-cn.com/problems/guess-number-higher-or-lower) 
 - Medium:	[Guess Number Higher or Lower II](https://leetcode-cn.com/problems/guess-number-higher-or-lower-ii) 
 - Hard:	[Find K-th Smallest Pair Distance](https://leetcode-cn.com/problems/find-k-th-smallest-pair-distance) 
