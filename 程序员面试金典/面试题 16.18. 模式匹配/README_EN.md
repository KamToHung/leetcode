| English | [简体中文](README.md) |

# [面试题 16.18. Pattern Matching LCCI](https://leetcode-cn.com/problems/pattern-matching-lcci)
 ### Description
<p>You are given two strings, pattern and value. The pattern string consists of just the letters a and b, describing a pattern within a string. For example, the string catcatgocatgo matches the pattern aabab (where cat is a and go is b). It also matches patterns like a, ab, and b. Write a method to determine if value matches pattern. a and b cannot be the same string.</p>

<p><strong>Example 1: </strong></p>

<pre>
<strong>Input: </strong> pattern = &quot;abba&quot;, value = &quot;dogcatcatdog&quot;
<strong>Output: </strong> true
</pre>

<p><strong>Example 2: </strong></p>

<pre>
<strong>Input: </strong> pattern = &quot;abba&quot;, value = &quot;dogcatcatfish&quot;
<strong>Output: </strong> false
</pre>

<p><strong>Example 3: </strong></p>

<pre>
<strong>Input: </strong> pattern = &quot;aaaa&quot;, value = &quot;dogcatcatdog&quot;
<strong>Output: </strong> false
</pre>

<p><strong>Example 4: </strong></p>

<pre>
<strong>Input: </strong> pattern = &quot;abba&quot;, value = &quot;dogdogdogdog&quot;
<strong>Output: </strong> true
<strong>Explanation: </strong> &quot;a&quot;=&quot;dogdog&quot;,b=&quot;&quot;，vice versa.
</pre>

<p><strong>Note: </strong></p>

<ul>
	<li><code>0 &lt;= len(pattern) &lt;= 1000</code></li>
	<li><code>0 &lt;= len(value) &lt;= 1000</code></li>
	<li><code>pattern</code>&nbsp;only contains&nbsp;<code>&quot;a&quot;</code>&nbsp;and&nbsp;<code>&quot;b&quot;</code>,&nbsp;<code>value</code> only contains lowercase letters.</li>
</ul>

**Related Topics**  [Math](https://leetcode-cn.com/tag/math) [String](https://leetcode-cn.com/tag/string) [Backtracking](https://leetcode-cn.com/tag/backtracking) [Enumeration](https://leetcode-cn.com/tag/enumeration) 