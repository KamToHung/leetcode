| English | [简体中文](README.md) |

# [464. Can I Win](https://leetcode-cn.com/problems/can-i-win)
 ### Description
<p>In the &quot;100 game&quot; two players take turns adding, to a running total, any integer from <code>1</code> to <code>10</code>. The player who first causes the running total to <strong>reach or exceed</strong> 100 wins.</p>

<p>What if we change the game so that players <strong>cannot</strong> re-use integers?</p>

<p>For example, two players might take turns drawing from a common pool of numbers from 1 to 15 without replacement until they reach a total &gt;= 100.</p>

<p>Given two integers <code>maxChoosableInteger</code> and <code>desiredTotal</code>, return <code>true</code> if the first player to move can force a win, otherwise, return <code>false</code>. Assume both players play <strong>optimally</strong>.</p>

<p>&nbsp;</p>
<p><strong>Example 1:</strong></p>

<pre>
<strong>Input:</strong> maxChoosableInteger = 10, desiredTotal = 11
<strong>Output:</strong> false
<strong>Explanation:</strong>
No matter which integer the first player choose, the first player will lose.
The first player can choose an integer from 1 up to 10.
If the first player choose 1, the second player can only choose integers from 2 up to 10.
The second player will win by choosing 10 and get a total = 11, which is &gt;= desiredTotal.
Same with other integers chosen by the first player, the second player will always win.
</pre>

<p><strong>Example 2:</strong></p>

<pre>
<strong>Input:</strong> maxChoosableInteger = 10, desiredTotal = 0
<strong>Output:</strong> true
</pre>

<p><strong>Example 3:</strong></p>

<pre>
<strong>Input:</strong> maxChoosableInteger = 10, desiredTotal = 1
<strong>Output:</strong> true
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= maxChoosableInteger &lt;= 20</code></li>
	<li><code>0 &lt;= desiredTotal &lt;= 300</code></li>
</ul>

**Related Topics**  [Bit Manipulation](https://leetcode-cn.com/tag/bit-manipulation) [Memoization](https://leetcode-cn.com/tag/memoization) [Math](https://leetcode-cn.com/tag/math) [Dynamic Programming](https://leetcode-cn.com/tag/dynamic-programming) [Bitmask](https://leetcode-cn.com/tag/bitmask) [Game Theory](https://leetcode-cn.com/tag/game-theory) 

### Similar Questions
 - Medium:	[Flip Game II](https://leetcode-cn.com/problems/flip-game-ii) 
 - Medium:	[Guess Number Higher or Lower II](https://leetcode-cn.com/problems/guess-number-higher-or-lower-ii) 
 - Medium:	[Predict the Winner](https://leetcode-cn.com/problems/predict-the-winner) 
