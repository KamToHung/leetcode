| English | [简体中文](README.md) |

# [374. Guess Number Higher or Lower](https://leetcode-cn.com/problems/guess-number-higher-or-lower)
 ### Description
<p>We are playing the Guess Game. The game is as follows:</p>

<p>I pick a number from <code>1</code> to <code>n</code>. You have to guess which number I picked.</p>

<p>Every time you guess wrong, I will tell you whether the number I picked is higher or lower than your guess.</p>

<p>You call a pre-defined API <code>int guess(int num)</code>, which returns three possible results:</p>

<ul>
	<li><code>-1</code>: Your guess is higher than the number I picked (i.e. <code>num &gt; pick</code>).</li>
	<li><code>1</code>: Your guess is lower than the number I picked (i.e. <code>num &lt; pick</code>).</li>
	<li><code>0</code>: your guess is equal to the number I picked (i.e. <code>num == pick</code>).</li>
</ul>

<p>Return <em>the number that I picked</em>.</p>

<p>&nbsp;</p>
<p><strong>Example 1:</strong></p>

<pre>
<strong>Input:</strong> n = 10, pick = 6
<strong>Output:</strong> 6
</pre>

<p><strong>Example 2:</strong></p>

<pre>
<strong>Input:</strong> n = 1, pick = 1
<strong>Output:</strong> 1
</pre>

<p><strong>Example 3:</strong></p>

<pre>
<strong>Input:</strong> n = 2, pick = 1
<strong>Output:</strong> 1
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= n &lt;= 2<sup>31</sup> - 1</code></li>
	<li><code>1 &lt;= pick &lt;= n</code></li>
</ul>

**Related Topics**  [Binary Search](https://leetcode-cn.com/tag/binary-search) [Interactive](https://leetcode-cn.com/tag/interactive) 

### Similar Questions
 - Easy:	[First Bad Version](https://leetcode-cn.com/problems/first-bad-version) 
 - Medium:	[Guess Number Higher or Lower II](https://leetcode-cn.com/problems/guess-number-higher-or-lower-ii) 
 - Medium:	[Find K Closest Elements](https://leetcode-cn.com/problems/find-k-closest-elements) 
