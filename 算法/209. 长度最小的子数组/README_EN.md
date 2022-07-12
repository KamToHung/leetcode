| English | [简体中文](README.md) |

# [209. Minimum Size Subarray Sum](https://leetcode-cn.com/problems/minimum-size-subarray-sum)
 ### Description
<p>Given an array of positive integers <code>nums</code> and a positive integer <code>target</code>, return the minimal length of a <strong>contiguous subarray</strong> <code>[nums<sub>l</sub>, nums<sub>l+1</sub>, ..., nums<sub>r-1</sub>, nums<sub>r</sub>]</code> of which the sum is greater than or equal to <code>target</code>. If there is no such subarray, return <code>0</code> instead.</p>

<p>&nbsp;</p>
<p><strong>Example 1:</strong></p>

<pre>
<strong>Input:</strong> target = 7, nums = [2,3,1,2,4,3]
<strong>Output:</strong> 2
<strong>Explanation:</strong> The subarray [4,3] has the minimal length under the problem constraint.
</pre>

<p><strong>Example 2:</strong></p>

<pre>
<strong>Input:</strong> target = 4, nums = [1,4,4]
<strong>Output:</strong> 1
</pre>

<p><strong>Example 3:</strong></p>

<pre>
<strong>Input:</strong> target = 11, nums = [1,1,1,1,1,1,1,1]
<strong>Output:</strong> 0
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= target &lt;= 10<sup>9</sup></code></li>
	<li><code>1 &lt;= nums.length &lt;= 10<sup>5</sup></code></li>
	<li><code>1 &lt;= nums[i] &lt;= 10<sup>4</sup></code></li>
</ul>

<p>&nbsp;</p>
<strong>Follow up:</strong> If you have figured out the <code>O(n)</code> solution, try coding another solution of which the time complexity is <code>O(n log(n))</code>.
**Related Topics**  [Array](https://leetcode-cn.com/tag/array) [Binary Search](https://leetcode-cn.com/tag/binary-search) [Prefix Sum](https://leetcode-cn.com/tag/prefix-sum) [Sliding Window](https://leetcode-cn.com/tag/sliding-window) 

### Similar Questions
 - Hard:	[Minimum Window Substring](https://leetcode-cn.com/problems/minimum-window-substring) 
 - Medium:	[Maximum Size Subarray Sum Equals k](https://leetcode-cn.com/problems/maximum-size-subarray-sum-equals-k) 
 - Medium:	[Maximum Length of Repeated Subarray](https://leetcode-cn.com/problems/maximum-length-of-repeated-subarray) 
