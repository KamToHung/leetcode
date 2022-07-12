| [English](README_EN.md) | 简体中文 |

# [76. 最小覆盖子串](https://leetcode-cn.com/problems/minimum-window-substring)
<p>给你一个字符串 <code>s</code> 、一个字符串 <code>t</code> 。返回 <code>s</code> 中涵盖 <code>t</code> 所有字符的最小子串。如果 <code>s</code> 中不存在涵盖 <code>t</code> 所有字符的子串，则返回空字符串 <code>""</code> 。</p>

<p> </p>

<p><strong>注意：</strong></p>

<ul>
	<li>对于 <code>t</code> 中重复字符，我们寻找的子字符串中该字符数量必须不少于 <code>t</code> 中该字符数量。</li>
	<li>如果 <code>s</code> 中存在这样的子串，我们保证它是唯一的答案。</li>
</ul>

<p> </p>

<p><strong>示例 1：</strong></p>

<pre>
<strong>输入：</strong>s = "ADOBECODEBANC", t = "ABC"
<strong>输出：</strong>"BANC"
</pre>

<p><strong>示例 2：</strong></p>

<pre>
<strong>输入：</strong>s = "a", t = "a"
<strong>输出：</strong>"a"
</pre>

<p><strong>示例 3:</strong></p>

<pre>
<strong>输入:</strong> s = "a", t = "aa"
<strong>输出:</strong> ""
<strong>解释:</strong> t 中两个字符 'a' 均应包含在 s 的子串中，
因此没有符合条件的子字符串，返回空字符串。</pre>

<p> </p>

<p><strong>提示：</strong></p>

<ul>
	<li><code>1 <= s.length, t.length <= 10<sup>5</sup></code></li>
	<li><code>s</code> 和 <code>t</code> 由英文字母组成</li>
</ul>

<p> </p>
<strong>进阶：</strong>你能设计一个在 <code>o(n)</code> 时间内解决此问题的算法吗？
**标签:**  [哈希表](https://leetcode-cn.com/tag/hash-table) [字符串](https://leetcode-cn.com/tag/string) [滑动窗口](https://leetcode-cn.com/tag/sliding-window) 
 ### 相似题目
- 困难:	[串联所有单词的子串](https://leetcode-cn.com/problems/substring-with-concatenation-of-all-words) 
- 中等:	[长度最小的子数组](https://leetcode-cn.com/problems/minimum-size-subarray-sum) 
- 困难:	[滑动窗口最大值](https://leetcode-cn.com/problems/sliding-window-maximum) 
- 中等:	[字符串的排列](https://leetcode-cn.com/problems/permutation-in-string) 
- 困难:	[最小窗口子序列](https://leetcode-cn.com/problems/minimum-window-subsequence) 
