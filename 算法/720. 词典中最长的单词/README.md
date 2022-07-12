| [English](README_EN.md) | 简体中文 |

# [720. 词典中最长的单词](https://leetcode-cn.com/problems/longest-word-in-dictionary)
<p>给出一个字符串数组&nbsp;<code>words</code> 组成的一本英语词典。返回&nbsp;<code>words</code> 中最长的一个单词，该单词是由&nbsp;<code>words</code>&nbsp;词典中其他单词逐步添加一个字母组成。</p>

<p>若其中有多个可行的答案，则返回答案中字典序最小的单词。若无答案，则返回空字符串。</p>

<p>&nbsp;</p>

<p><strong>示例 1：</strong></p>

<pre>
<strong>输入：</strong>words = ["w","wo","wor","worl", "world"]
<strong>输出：</strong>"world"
<strong>解释：</strong> 单词"world"可由"w", "wo", "wor", 和 "worl"逐步添加一个字母组成。
</pre>

<p><strong>示例 2：</strong></p>

<pre>
<strong>输入：</strong>words = ["a", "banana", "app", "appl", "ap", "apply", "apple"]
<strong>输出：</strong>"apple"
<strong>解释：</strong>"apply" 和 "apple" 都能由词典中的单词组成。但是 "apple" 的字典序小于 "apply" 
</pre>

<p>&nbsp;</p>

<p><strong>提示：</strong></p>

<ul>
	<li><code>1 &lt;= words.length &lt;= 1000</code></li>
	<li><code>1 &lt;= words[i].length &lt;= 30</code></li>
	<li>所有输入的字符串&nbsp;<code>words[i]</code>&nbsp;都只包含小写字母。</li>
</ul>

**标签:**  [字典树](https://leetcode-cn.com/tag/trie) [数组](https://leetcode-cn.com/tag/array) [哈希表](https://leetcode-cn.com/tag/hash-table) [字符串](https://leetcode-cn.com/tag/string) [排序](https://leetcode-cn.com/tag/sorting) 
 ### 相似题目
- 中等:	[通过删除字母匹配到字典里最长单词](https://leetcode-cn.com/problems/longest-word-in-dictionary-through-deleting) 
- 中等:	[实现一个魔法字典](https://leetcode-cn.com/problems/implement-magic-dictionary) 
