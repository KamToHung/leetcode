| [English](README_EN.md) | 简体中文 |

# [424. 替换后的最长重复字符](https://leetcode-cn.com/problems/longest-repeating-character-replacement)
<p>给你一个字符串 <code>s</code> 和一个整数 <code>k</code> 。你可以选择字符串中的任一字符，并将其更改为任何其他大写英文字符。该操作最多可执行 <code>k</code> 次。</p>

<p>在执行上述操作后，返回包含相同字母的最长子字符串的长度。</p>

<p>&nbsp;</p>

<p><strong>示例 1：</strong></p>

<pre>
<strong>输入：</strong>s = "ABAB", k = 2
<strong>输出：</strong>4
<strong>解释：</strong>用两个'A'替换为两个'B',反之亦然。
</pre>

<p><strong>示例 2：</strong></p>

<pre>
<strong>输入：</strong>s = "AABABBA", k = 1
<strong>输出：</strong>4
<strong>解释：</strong>
将中间的一个'A'替换为'B',字符串变为 "AABBBBA"。
子串 "BBBB" 有最长重复字母, 答案为 4。
</pre>

<p>&nbsp;</p>

<p><strong>提示：</strong></p>

<ul>
	<li><code>1 &lt;= s.length &lt;= 10<sup>5</sup></code></li>
	<li><code>s</code> 仅由大写英文字母组成</li>
	<li><code>0 &lt;= k &lt;= s.length</code></li>
</ul>

**标签:**  [哈希表](https://leetcode-cn.com/tag/hash-table) [字符串](https://leetcode-cn.com/tag/string) [滑动窗口](https://leetcode-cn.com/tag/sliding-window) 
 ### 相似题目
- 中等:	[至多包含 K 个不同字符的最长子串](https://leetcode-cn.com/problems/longest-substring-with-at-most-k-distinct-characters) 
- 中等:	[最大连续1的个数 III](https://leetcode-cn.com/problems/max-consecutive-ones-iii) 
