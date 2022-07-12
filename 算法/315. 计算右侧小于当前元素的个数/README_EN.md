| English | [简体中文](README.md) |

# [315. Count of Smaller Numbers After Self](https://leetcode-cn.com/problems/count-of-smaller-numbers-after-self)
 ### Description
<p>You are given an integer array <code>nums</code> and you have to return a new <code>counts</code> array. The <code>counts</code> array has the property where <code>counts[i]</code> is the number of smaller elements to the right of <code>nums[i]</code>.</p>

<p>&nbsp;</p>
<p><strong>Example 1:</strong></p>

<pre>
<strong>Input:</strong> nums = [5,2,6,1]
<strong>Output:</strong> [2,1,1,0]
<strong>Explanation:</strong>
To the right of 5 there are <b>2</b> smaller elements (2 and 1).
To the right of 2 there is only <b>1</b> smaller element (1).
To the right of 6 there is <b>1</b> smaller element (1).
To the right of 1 there is <b>0</b> smaller element.
</pre>

<p><strong>Example 2:</strong></p>

<pre>
<strong>Input:</strong> nums = [-1]
<strong>Output:</strong> [0]
</pre>

<p><strong>Example 3:</strong></p>

<pre>
<strong>Input:</strong> nums = [-1,-1]
<strong>Output:</strong> [0,0]
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= nums.length &lt;= 10<sup>5</sup></code></li>
	<li><code>-10<sup>4</sup> &lt;= nums[i] &lt;= 10<sup>4</sup></code></li>
</ul>

**Related Topics**  [Binary Indexed Tree](https://leetcode-cn.com/tag/binary-indexed-tree) [Segment Tree](https://leetcode-cn.com/tag/segment-tree) [Array](https://leetcode-cn.com/tag/array) [Binary Search](https://leetcode-cn.com/tag/binary-search) [Divide and Conquer](https://leetcode-cn.com/tag/divide-and-conquer) [Ordered Set](https://leetcode-cn.com/tag/ordered-set) [Merge Sort](https://leetcode-cn.com/tag/merge-sort) 

### Similar Questions
 - Hard:	[Count of Range Sum](https://leetcode-cn.com/problems/count-of-range-sum) 
 - Medium:	[Queue Reconstruction by Height](https://leetcode-cn.com/problems/queue-reconstruction-by-height) 
 - Hard:	[Reverse Pairs](https://leetcode-cn.com/problems/reverse-pairs) 
