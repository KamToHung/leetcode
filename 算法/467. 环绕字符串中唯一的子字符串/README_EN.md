| English | [简体中文](README.md) |

# [467. Unique Substrings in Wraparound String](https://leetcode-cn.com/problems/unique-substrings-in-wraparound-string)
 ### Description
<p>We define the string <code>s</code> to be the infinite wraparound string of <code>&quot;abcdefghijklmnopqrstuvwxyz&quot;</code>, so <code>s</code> will look like this:</p>

<ul>
	<li><code>&quot;...zabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcd....&quot;</code>.</li>
</ul>

<p>Given a string <code>p</code>, return <em>the number of <strong>unique non-empty substrings</strong> of </em><code>p</code><em> are present in </em><code>s</code>.</p>

<p>&nbsp;</p>
<p><strong>Example 1:</strong></p>

<pre>
<strong>Input:</strong> p = &quot;a&quot;
<strong>Output:</strong> 1
Explanation: Only the substring &quot;a&quot; of p is in s.
</pre>

<p><strong>Example 2:</strong></p>

<pre>
<strong>Input:</strong> p = &quot;cac&quot;
<strong>Output:</strong> 2
<strong>Explanation:</strong> There are two substrings (&quot;a&quot;, &quot;c&quot;) of p in s.
</pre>

<p><strong>Example 3:</strong></p>

<pre>
<strong>Input:</strong> p = &quot;zab&quot;
<strong>Output:</strong> 6
<strong>Explanation:</strong> There are six substrings (&quot;z&quot;, &quot;a&quot;, &quot;b&quot;, &quot;za&quot;, &quot;ab&quot;, and &quot;zab&quot;) of p in s.
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= p.length &lt;= 10<sup>5</sup></code></li>
	<li><code>p</code> consists of lowercase English letters.</li>
</ul>

**Related Topics**  [String](https://leetcode-cn.com/tag/string) [Dynamic Programming](https://leetcode-cn.com/tag/dynamic-programming) 