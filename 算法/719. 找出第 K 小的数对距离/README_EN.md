| English | [简体中文](README.md) |

# [719. Find K-th Smallest Pair Distance](https://leetcode-cn.com/problems/find-k-th-smallest-pair-distance)
 ### Description
<p>The <strong>distance of a pair</strong> of integers <code>a</code> and <code>b</code> is defined as the absolute difference between <code>a</code> and <code>b</code>.</p>

<p>Given an integer array <code>nums</code> and an integer <code>k</code>, return <em>the</em> <code>k<sup>th</sup></code> <em>smallest <strong>distance among all the pairs</strong></em> <code>nums[i]</code> <em>and</em> <code>nums[j]</code> <em>where</em> <code>0 &lt;= i &lt; j &lt; nums.length</code>.</p>

<p>&nbsp;</p>
<p><strong>Example 1:</strong></p>

<pre>
<strong>Input:</strong> nums = [1,3,1], k = 1
<strong>Output:</strong> 0
<strong>Explanation:</strong> Here are all the pairs:
(1,3) -&gt; 2
(1,1) -&gt; 0
(3,1) -&gt; 2
Then the 1<sup>st</sup> smallest distance pair is (1,1), and its distance is 0.
</pre>

<p><strong>Example 2:</strong></p>

<pre>
<strong>Input:</strong> nums = [1,1,1], k = 2
<strong>Output:</strong> 0
</pre>

<p><strong>Example 3:</strong></p>

<pre>
<strong>Input:</strong> nums = [1,6,1], k = 3
<strong>Output:</strong> 5
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>n == nums.length</code></li>
	<li><code>2 &lt;= n &lt;= 10<sup>4</sup></code></li>
	<li><code>0 &lt;= nums[i] &lt;= 10<sup>6</sup></code></li>
	<li><code>1 &lt;= k &lt;= n * (n - 1) / 2</code></li>
</ul>

**Related Topics**  [Array](https://leetcode-cn.com/tag/array) [Two Pointers](https://leetcode-cn.com/tag/two-pointers) [Binary Search](https://leetcode-cn.com/tag/binary-search) [Sorting](https://leetcode-cn.com/tag/sorting) 

### Similar Questions
 - Medium:	[Find K Pairs with Smallest Sums](https://leetcode-cn.com/problems/find-k-pairs-with-smallest-sums) 
 - Medium:	[Kth Smallest Element in a Sorted Matrix](https://leetcode-cn.com/problems/kth-smallest-element-in-a-sorted-matrix) 
 - Medium:	[Find K Closest Elements](https://leetcode-cn.com/problems/find-k-closest-elements) 
 - Hard:	[Kth Smallest Number in Multiplication Table](https://leetcode-cn.com/problems/kth-smallest-number-in-multiplication-table) 
 - Medium:	[K-th Smallest Prime Fraction](https://leetcode-cn.com/problems/k-th-smallest-prime-fraction) 
