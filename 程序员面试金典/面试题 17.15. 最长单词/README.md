| [English](README_EN.md) | 简体中文 |

# [面试题 17.15. 最长单词](https://leetcode-cn.com/problems/longest-word-lcci)
<p>给定一组单词<code>words</code>，编写一个程序，找出其中的最长单词，且该单词由这组单词中的其他单词组合而成。若有多个长度相同的结果，返回其中字典序最小的一项，若没有符合要求的单词则返回空字符串。</p>

<p><strong>示例：</strong></p>

<pre><strong>输入：</strong> [&quot;cat&quot;,&quot;banana&quot;,&quot;dog&quot;,&quot;nana&quot;,&quot;walk&quot;,&quot;walker&quot;,&quot;dogwalker&quot;]
<strong>输出：</strong> &quot;dogwalker&quot;
<strong>解释：</strong> &quot;dogwalker&quot;可由&quot;dog&quot;和&quot;walker&quot;组成。
</pre>

<p><strong>提示：</strong></p>

<ul>
	<li><code>0 &lt;= len(words) &lt;= 200</code></li>
	<li><code>1 &lt;= len(words[i]) &lt;= 100</code></li>
</ul>

**标签:**  [字典树](https://leetcode-cn.com/tag/trie) [数组](https://leetcode-cn.com/tag/array) [哈希表](https://leetcode-cn.com/tag/hash-table) [字符串](https://leetcode-cn.com/tag/string) 