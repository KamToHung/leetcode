| [English](README_EN.md) | 简体中文 |

# [854. 相似度为 K 的字符串](https://leetcode-cn.com/problems/k-similar-strings)
<p>字符串 <code>s1</code> 和 <code>s2</code> 是 <strong><code>k</code> 相似</strong> 的(对于某些非负整数 <code>k</code> )，如果我们可以交换 <code>s1</code> 中两个字母的位置正好 <code>k</code> 次，使结果字符串等于 <code>s2</code> 。</p>

<p>给定两个字谜游戏 <code>s1</code> 和 <code>s2</code> ，返回 <code>s1</code> 和 <code>s2</code> 与 <strong><code>k</code> 相似&nbsp;</strong>的最小 <code>k</code> 。</p>

<p>&nbsp;</p>

<p><strong>示例 1：</strong></p>

<pre>
<strong>输入：</strong>s1 = "ab", s2 = "ba"
<strong>输出：</strong>1
</pre>

<p><strong>示例 2：</strong></p>

<pre>
<strong>输入：</strong>s1 = "abc", s2 = "bca"
<strong>输出：</strong>2
</pre>

<p>&nbsp;</p>

<p><strong>提示：</strong></p>

<ul>
	<li><code>1 &lt;= s1.length &lt;= 20</code></li>
	<li><code>s2.length == s1.length</code></li>
	<li><code>s1</code>&nbsp;和&nbsp;<code>s2</code>&nbsp;&nbsp;只包含集合&nbsp;<code>{'a', 'b', 'c', 'd', 'e', 'f'}</code>&nbsp;中的小写字母</li>
	<li><code>s2</code> 是 <code>s1</code> 的一个字谜</li>
</ul>

**标签:**  [广度优先搜索](https://leetcode-cn.com/tag/breadth-first-search) [字符串](https://leetcode-cn.com/tag/string) 
 ### 相似题目
- 困难:	[情侣牵手](https://leetcode-cn.com/problems/couples-holding-hands) 
