| English | [简体中文](README.md) |

# [564. Find the Closest Palindrome](https://leetcode-cn.com/problems/find-the-closest-palindrome)
 ### Description
<p>Given a string <code>n</code> representing an integer, return <em>the closest integer (not including itself), which is a palindrome</em>. If there is a tie, return <em><strong>the smaller one</strong></em>.</p>

<p>The closest is defined as the absolute difference minimized between two integers.</p>

<p>&nbsp;</p>
<p><strong>Example 1:</strong></p>

<pre>
<strong>Input:</strong> n = &quot;123&quot;
<strong>Output:</strong> &quot;121&quot;
</pre>

<p><strong>Example 2:</strong></p>

<pre>
<strong>Input:</strong> n = &quot;1&quot;
<strong>Output:</strong> &quot;0&quot;
<strong>Explanation:</strong> 0 and 2 are the closest palindromes but we return the smallest which is 0.
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= n.length &lt;= 18</code></li>
	<li><code>n</code> consists of only digits.</li>
	<li><code>n</code> does not have leading zeros.</li>
	<li><code>n</code> is representing an integer in the range <code>[1, 10<sup>18</sup> - 1]</code>.</li>
</ul>

**Related Topics**  [Math](https://leetcode-cn.com/tag/math) [String](https://leetcode-cn.com/tag/string) 