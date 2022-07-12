| English | [简体中文](README.md) |

# [336. Palindrome Pairs](https://leetcode-cn.com/problems/palindrome-pairs)
 ### Description
<p>Given a list of <b>unique</b> words, return all the pairs of the&nbsp;<b><i>distinct</i></b> indices <code>(i, j)</code> in the given list, so that the concatenation of the two words&nbsp;<code>words[i] + words[j]</code> is a palindrome.</p>

<p>&nbsp;</p>
<p><strong>Example 1:</strong></p>

<pre>
<strong>Input:</strong> words = [&quot;abcd&quot;,&quot;dcba&quot;,&quot;lls&quot;,&quot;s&quot;,&quot;sssll&quot;]
<strong>Output:</strong> [[0,1],[1,0],[3,2],[2,4]]
<strong>Explanation:</strong> The palindromes are [&quot;dcbaabcd&quot;,&quot;abcddcba&quot;,&quot;slls&quot;,&quot;llssssll&quot;]
</pre>

<p><strong>Example 2:</strong></p>

<pre>
<strong>Input:</strong> words = [&quot;bat&quot;,&quot;tab&quot;,&quot;cat&quot;]
<strong>Output:</strong> [[0,1],[1,0]]
<strong>Explanation:</strong> The palindromes are [&quot;battab&quot;,&quot;tabbat&quot;]
</pre>

<p><strong>Example 3:</strong></p>

<pre>
<strong>Input:</strong> words = [&quot;a&quot;,&quot;&quot;]
<strong>Output:</strong> [[0,1],[1,0]]
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= words.length &lt;= 5000</code></li>
	<li><code>0 &lt;= words[i].length &lt;= 300</code></li>
	<li><code>words[i]</code> consists of lower-case English letters.</li>
</ul>

**Related Topics**  [Trie](https://leetcode-cn.com/tag/trie) [Array](https://leetcode-cn.com/tag/array) [Hash Table](https://leetcode-cn.com/tag/hash-table) [String](https://leetcode-cn.com/tag/string) 

### Similar Questions
 - Medium:	[Longest Palindromic Substring](https://leetcode-cn.com/problems/longest-palindromic-substring) 
 - Hard:	[Shortest Palindrome](https://leetcode-cn.com/problems/shortest-palindrome) 
