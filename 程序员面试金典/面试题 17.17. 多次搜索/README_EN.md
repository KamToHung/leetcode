| English | [简体中文](README.md) |

# [面试题 17.17. Multi Search LCCI](https://leetcode-cn.com/problems/multi-search-lcci)
 ### Description
<p>Given a string band an array of smaller strings T, design a method to search b for each small string in T. Output&nbsp;<code>positions</code> of all strings in&nbsp;<code>smalls</code>&nbsp;that appear in <code>big</code>,&nbsp;where <code>positions[i]</code> is all positions of <code>smalls[i]</code>.</p>

<p><strong>Example: </strong></p>

<pre>
<strong>Input: </strong>
big = &quot;mississippi&quot;
smalls = [&quot;is&quot;,&quot;ppi&quot;,&quot;hi&quot;,&quot;sis&quot;,&quot;i&quot;,&quot;ssippi&quot;]
<strong>Output: </strong> [[1,4],[8],[],[3],[1,4,7,10],[5]]
</pre>

<p><strong>Note: </strong></p>

<ul>
	<li><code>0 &lt;= len(big) &lt;= 1000</code></li>
	<li><code>0 &lt;= len(smalls[i]) &lt;= 1000</code></li>
	<li>The total number of characters in&nbsp;<code>smalls</code>&nbsp;will not exceed 100000.</li>
	<li>No duplicated strings in&nbsp;<code>smalls</code>.</li>
	<li>All characters are lowercase letters.</li>
</ul>

**Related Topics**  [Trie](https://leetcode-cn.com/tag/trie) [Array](https://leetcode-cn.com/tag/array) [Hash Table](https://leetcode-cn.com/tag/hash-table) [String](https://leetcode-cn.com/tag/string) [String Matching](https://leetcode-cn.com/tag/string-matching) [Sliding Window](https://leetcode-cn.com/tag/sliding-window) 