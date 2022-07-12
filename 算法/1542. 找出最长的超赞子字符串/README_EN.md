| English | [简体中文](README.md) |

# [1542. Find Longest Awesome Substring](https://leetcode-cn.com/problems/find-longest-awesome-substring)
 ### Description
<p>You are given a string <code>s</code>. An <strong>awesome</strong> substring is a non-empty substring of <code>s</code> such that we can make any number of swaps in order to make it a palindrome.</p>

<p>Return <em>the length of the maximum length <strong>awesome substring</strong> of</em> <code>s</code>.</p>

<p>&nbsp;</p>
<p><strong>Example 1:</strong></p>

<pre>
<strong>Input:</strong> s = &quot;3242415&quot;
<strong>Output:</strong> 5
<strong>Explanation:</strong> &quot;24241&quot; is the longest awesome substring, we can form the palindrome &quot;24142&quot; with some swaps.
</pre>

<p><strong>Example 2:</strong></p>

<pre>
<strong>Input:</strong> s = &quot;12345678&quot;
<strong>Output:</strong> 1
</pre>

<p><strong>Example 3:</strong></p>

<pre>
<strong>Input:</strong> s = &quot;213123&quot;
<strong>Output:</strong> 6
<strong>Explanation:</strong> &quot;213123&quot; is the longest awesome substring, we can form the palindrome &quot;231132&quot; with some swaps.
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= s.length &lt;= 10<sup>5</sup></code></li>
	<li><code>s</code> consists only of digits.</li>
</ul>

**Related Topics**  [Bit Manipulation](https://leetcode-cn.com/tag/bit-manipulation) [Hash Table](https://leetcode-cn.com/tag/hash-table) [String](https://leetcode-cn.com/tag/string) 