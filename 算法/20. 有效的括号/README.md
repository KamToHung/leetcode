| [English](README_EN.md) | 简体中文 |

# [20. 有效的括号](https://leetcode-cn.com/problems/valid-parentheses)
<p>给定一个只包括 <code>'('</code>，<code>')'</code>，<code>'{'</code>，<code>'}'</code>，<code>'['</code>，<code>']'</code> 的字符串 <code>s</code> ，判断字符串是否有效。</p>

<p>有效字符串需满足：</p>

<ol>
	<li>左括号必须用相同类型的右括号闭合。</li>
	<li>左括号必须以正确的顺序闭合。</li>
</ol>

<p> </p>

<p><strong>示例 1：</strong></p>

<pre>
<strong>输入：</strong>s = "()"
<strong>输出：</strong>true
</pre>

<p><strong>示例 2：</strong></p>

<pre>
<strong>输入：</strong>s = "()[]{}"
<strong>输出：</strong>true
</pre>

<p><strong>示例 3：</strong></p>

<pre>
<strong>输入：</strong>s = "(]"
<strong>输出：</strong>false
</pre>

<p><strong>示例 4：</strong></p>

<pre>
<strong>输入：</strong>s = "([)]"
<strong>输出：</strong>false
</pre>

<p><strong>示例 5：</strong></p>

<pre>
<strong>输入：</strong>s = "{[]}"
<strong>输出：</strong>true</pre>

<p> </p>

<p><strong>提示：</strong></p>

<ul>
	<li><code>1 <= s.length <= 10<sup>4</sup></code></li>
	<li><code>s</code> 仅由括号 <code>'()[]{}'</code> 组成</li>
</ul>

**标签:**  [栈](https://leetcode-cn.com/tag/stack) [字符串](https://leetcode-cn.com/tag/string) 
 ### 相似题目
- 中等:	[括号生成](https://leetcode-cn.com/problems/generate-parentheses) 
- 困难:	[最长有效括号](https://leetcode-cn.com/problems/longest-valid-parentheses) 
- 困难:	[删除无效的括号](https://leetcode-cn.com/problems/remove-invalid-parentheses) 
- 中等:	[检查替换后的词是否有效](https://leetcode-cn.com/problems/check-if-word-is-valid-after-substitutions) 
