| English | [简体中文](README.md) |

# [692. Top K Frequent Words](https://leetcode-cn.com/problems/top-k-frequent-words)
 ### Description
<p>Given an array of strings <code>words</code> and an integer <code>k</code>, return <em>the </em><code>k</code><em> most frequent strings</em>.</p>

<p>Return the answer <strong>sorted</strong> by <strong>the frequency</strong> from highest to lowest. Sort the words with the same frequency by their <strong>lexicographical order</strong>.</p>

<p>&nbsp;</p>
<p><strong>Example 1:</strong></p>

<pre>
<strong>Input:</strong> words = [&quot;i&quot;,&quot;love&quot;,&quot;leetcode&quot;,&quot;i&quot;,&quot;love&quot;,&quot;coding&quot;], k = 2
<strong>Output:</strong> [&quot;i&quot;,&quot;love&quot;]
<strong>Explanation:</strong> &quot;i&quot; and &quot;love&quot; are the two most frequent words.
Note that &quot;i&quot; comes before &quot;love&quot; due to a lower alphabetical order.
</pre>

<p><strong>Example 2:</strong></p>

<pre>
<strong>Input:</strong> words = [&quot;the&quot;,&quot;day&quot;,&quot;is&quot;,&quot;sunny&quot;,&quot;the&quot;,&quot;the&quot;,&quot;the&quot;,&quot;sunny&quot;,&quot;is&quot;,&quot;is&quot;], k = 4
<strong>Output:</strong> [&quot;the&quot;,&quot;is&quot;,&quot;sunny&quot;,&quot;day&quot;]
<strong>Explanation:</strong> &quot;the&quot;, &quot;is&quot;, &quot;sunny&quot; and &quot;day&quot; are the four most frequent words, with the number of occurrence being 4, 3, 2 and 1 respectively.
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= words.length &lt;= 500</code></li>
	<li><code>1 &lt;= words[i].length &lt;= 10</code></li>
	<li><code>words[i]</code> consists of lowercase English letters.</li>
	<li><code>k</code> is in the range <code>[1, The number of <strong>unique</strong> words[i]]</code></li>
</ul>

<p>&nbsp;</p>
<p><strong>Follow-up:</strong> Could you solve it in <code>O(n log(k))</code> time and <code>O(n)</code> extra space?</p>

**Related Topics**  [Trie](https://leetcode-cn.com/tag/trie) [Hash Table](https://leetcode-cn.com/tag/hash-table) [String](https://leetcode-cn.com/tag/string) [Bucket Sort](https://leetcode-cn.com/tag/bucket-sort) [Counting](https://leetcode-cn.com/tag/counting) [Sorting](https://leetcode-cn.com/tag/sorting) [Heap (Priority Queue)](https://leetcode-cn.com/tag/heap-priority-queue) 

### Similar Questions
 - Medium:	[Top K Frequent Elements](https://leetcode-cn.com/problems/top-k-frequent-elements) 
 - Medium:	[K Closest Points to Origin](https://leetcode-cn.com/problems/k-closest-points-to-origin) 
