| English | [简体中文](README.md) |

# [239. Sliding Window Maximum](https://leetcode-cn.com/problems/sliding-window-maximum)
 ### Description
<p>You are given an array of integers&nbsp;<code>nums</code>, there is a sliding window of size <code>k</code> which is moving from the very left of the array to the very right. You can only see the <code>k</code> numbers in the window. Each time the sliding window moves right by one position.</p>

<p>Return <em>the max sliding window</em>.</p>

<p>&nbsp;</p>
<p><strong>Example 1:</strong></p>

<pre>
<strong>Input:</strong> nums = [1,3,-1,-3,5,3,6,7], k = 3
<strong>Output:</strong> [3,3,5,5,6,7]
<strong>Explanation:</strong> 
Window position                Max
---------------               -----
[1  3  -1] -3  5  3  6  7       <strong>3</strong>
 1 [3  -1  -3] 5  3  6  7       <strong>3</strong>
 1  3 [-1  -3  5] 3  6  7      <strong> 5</strong>
 1  3  -1 [-3  5  3] 6  7       <strong>5</strong>
 1  3  -1  -3 [5  3  6] 7       <strong>6</strong>
 1  3  -1  -3  5 [3  6  7]      <strong>7</strong>
</pre>

<p><strong>Example 2:</strong></p>

<pre>
<strong>Input:</strong> nums = [1], k = 1
<strong>Output:</strong> [1]
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= nums.length &lt;= 10<sup>5</sup></code></li>
	<li><code>-10<sup>4</sup> &lt;= nums[i] &lt;= 10<sup>4</sup></code></li>
	<li><code>1 &lt;= k &lt;= nums.length</code></li>
</ul>

**Related Topics**  [Queue](https://leetcode-cn.com/tag/queue) [Array](https://leetcode-cn.com/tag/array) [Sliding Window](https://leetcode-cn.com/tag/sliding-window) [Monotonic Queue](https://leetcode-cn.com/tag/monotonic-queue) [Heap (Priority Queue)](https://leetcode-cn.com/tag/heap-priority-queue) 

### Similar Questions
 - Hard:	[Minimum Window Substring](https://leetcode-cn.com/problems/minimum-window-substring) 
 - Medium:	[Min Stack](https://leetcode-cn.com/problems/min-stack) 
 - Medium:	[Longest Substring with At Most Two Distinct Characters](https://leetcode-cn.com/problems/longest-substring-with-at-most-two-distinct-characters) 
 - Hard:	[Paint House II](https://leetcode-cn.com/problems/paint-house-ii) 
