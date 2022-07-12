| [English](README_EN.md) | 简体中文 |

# [763. 划分字母区间](https://leetcode-cn.com/problems/partition-labels)
<p>字符串 <code>S</code> 由小写字母组成。我们要把这个字符串划分为尽可能多的片段，同一字母最多出现在一个片段中。返回一个表示每个字符串片段的长度的列表。</p>

<p> </p>

<p><strong>示例：</strong></p>

<pre>
<strong>输入：</strong>S = "ababcbacadefegdehijhklij"
<strong>输出：</strong>[9,7,8]
<strong>解释：</strong>
划分结果为 "ababcbaca", "defegde", "hijhklij"。
每个字母最多出现在一个片段中。
像 "ababcbacadefegde", "hijhklij" 的划分是错误的，因为划分的片段数较少。
</pre>

<p> </p>

<p><strong>提示：</strong></p>

<ul>
	<li><code>S</code>的长度在<code>[1, 500]</code>之间。</li>
	<li><code>S</code>只包含小写字母 <code>'a'</code> 到 <code>'z'</code> 。</li>
</ul>

**标签:**  [贪心](https://leetcode-cn.com/tag/greedy) [哈希表](https://leetcode-cn.com/tag/hash-table) [双指针](https://leetcode-cn.com/tag/two-pointers) [字符串](https://leetcode-cn.com/tag/string) 
 ### 相似题目
- 中等:	[合并区间](https://leetcode-cn.com/problems/merge-intervals) 
