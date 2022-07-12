| [English](README_EN.md) | 简体中文 |

# [241. 为运算表达式设计优先级](https://leetcode-cn.com/problems/different-ways-to-add-parentheses)
<p>给你一个由数字和运算符组成的字符串&nbsp;<code>expression</code> ，按不同优先级组合数字和运算符，计算并返回所有可能组合的结果。你可以 <strong>按任意顺序</strong> 返回答案。</p>

<p>生成的测试用例满足其对应输出值符合 32 位整数范围，不同结果的数量不超过 <code>10<sup>4</sup></code> 。</p>

<p>&nbsp;</p>

<p><strong>示例 1：</strong></p>

<pre>
<strong>输入：</strong>expression = "2-1-1"
<strong>输出：</strong>[0,2]
<strong>解释：</strong>
((2-1)-1) = 0 
(2-(1-1)) = 2
</pre>

<p><strong>示例 2：</strong></p>

<pre>
<strong>输入：</strong>expression = "2*3-4*5"
<strong>输出：</strong>[-34,-14,-10,-10,10]
<strong>解释：</strong>
(2*(3-(4*5))) = -34 
((2*3)-(4*5)) = -14 
((2*(3-4))*5) = -10 
(2*((3-4)*5)) = -10 
(((2*3)-4)*5) = 10
</pre>

<p>&nbsp;</p>

<p><strong>提示：</strong></p>

<ul>
	<li><code>1 &lt;= expression.length &lt;= 20</code></li>
	<li><code>expression</code> 由数字和算符 <code>'+'</code>、<code>'-'</code> 和 <code>'*'</code> 组成。</li>
	<li>输入表达式中的所有整数值在范围 <code>[0, 99]</code>&nbsp;</li>
</ul>

**标签:**  [递归](https://leetcode-cn.com/tag/recursion) [记忆化搜索](https://leetcode-cn.com/tag/memoization) [数学](https://leetcode-cn.com/tag/math) [字符串](https://leetcode-cn.com/tag/string) [动态规划](https://leetcode-cn.com/tag/dynamic-programming) 
 ### 相似题目
- 中等:	[不同的二叉搜索树 II](https://leetcode-cn.com/problems/unique-binary-search-trees-ii) 
- 困难:	[基本计算器](https://leetcode-cn.com/problems/basic-calculator) 
- 困难:	[给表达式添加运算符](https://leetcode-cn.com/problems/expression-add-operators) 
