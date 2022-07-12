| English | [简体中文](README.md) |

# [213. House Robber II](https://leetcode-cn.com/problems/house-robber-ii)
 ### Description
<p>You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed. All houses at this place are <strong>arranged in a circle.</strong> That means the first house is the neighbor of the last one. Meanwhile, adjacent houses have a security system connected, and&nbsp;<b>it will automatically contact the police if two adjacent houses were broken into on the same night</b>.</p>

<p>Given an integer array <code>nums</code> representing the amount of money of each house, return <em>the maximum amount of money you can rob tonight <strong>without alerting the police</strong></em>.</p>

<p>&nbsp;</p>
<p><strong>Example 1:</strong></p>

<pre>
<strong>Input:</strong> nums = [2,3,2]
<strong>Output:</strong> 3
<strong>Explanation:</strong> You cannot rob house 1 (money = 2) and then rob house 3 (money = 2), because they are adjacent houses.
</pre>

<p><strong>Example 2:</strong></p>

<pre>
<strong>Input:</strong> nums = [1,2,3,1]
<strong>Output:</strong> 4
<strong>Explanation:</strong> Rob house 1 (money = 1) and then rob house 3 (money = 3).
Total amount you can rob = 1 + 3 = 4.
</pre>

<p><strong>Example 3:</strong></p>

<pre>
<strong>Input:</strong> nums = [1,2,3]
<strong>Output:</strong> 3
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= nums.length &lt;= 100</code></li>
	<li><code>0 &lt;= nums[i] &lt;= 1000</code></li>
</ul>

**Related Topics**  [Array](https://leetcode-cn.com/tag/array) [Dynamic Programming](https://leetcode-cn.com/tag/dynamic-programming) 

### Similar Questions
 - Medium:	[House Robber](https://leetcode-cn.com/problems/house-robber) 
 - Medium:	[Paint House](https://leetcode-cn.com/problems/paint-house) 
 - Medium:	[Paint Fence](https://leetcode-cn.com/problems/paint-fence) 
 - Medium:	[House Robber III](https://leetcode-cn.com/problems/house-robber-iii) 
 - Hard:	[Non-negative Integers without Consecutive Ones](https://leetcode-cn.com/problems/non-negative-integers-without-consecutive-ones) 
 - Hard:	[Coin Path](https://leetcode-cn.com/problems/coin-path) 
