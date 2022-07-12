| [English](README_EN.md) | 简体中文 |

# [336. 回文对](https://leetcode-cn.com/problems/palindrome-pairs)
<p>给定一组<strong> 互不相同</strong> 的单词， 找出所有<strong> 不同<em> </em></strong>的索引对 <code>(i, j)</code>，使得列表中的两个单词， <code>words[i] + words[j]</code> ，可拼接成回文串。</p>

<p> </p>

<p><strong>示例 1：</strong></p>

<pre>
<strong>输入：</strong>words = ["abcd","dcba","lls","s","sssll"]
<strong>输出：</strong>[[0,1],[1,0],[3,2],[2,4]] 
<strong>解释：</strong>可拼接成的回文串为 <code>["dcbaabcd","abcddcba","slls","llssssll"]</code>
</pre>

<p><strong>示例 2：</strong></p>

<pre>
<strong>输入：</strong>words = ["bat","tab","cat"]
<strong>输出：</strong>[[0,1],[1,0]] 
<strong>解释：</strong>可拼接成的回文串为 <code>["battab","tabbat"]</code></pre>

<p><strong>示例 3：</strong></p>

<pre>
<strong>输入：</strong>words = ["a",""]
<strong>输出：</strong>[[0,1],[1,0]]
</pre>
 

<p><strong>提示：</strong></p>

<ul>
	<li><code>1 <= words.length <= 5000</code></li>
	<li><code>0 <= words[i].length <= 300</code></li>
	<li><code>words[i]</code> 由小写英文字母组成</li>
</ul>

**标签:**  [字典树](https://leetcode-cn.com/tag/trie) [数组](https://leetcode-cn.com/tag/array) [哈希表](https://leetcode-cn.com/tag/hash-table) [字符串](https://leetcode-cn.com/tag/string) 
 ### 相似题目
- 中等:	[最长回文子串](https://leetcode-cn.com/problems/longest-palindromic-substring) 
- 困难:	[最短回文串](https://leetcode-cn.com/problems/shortest-palindrome) 
