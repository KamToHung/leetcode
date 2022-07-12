| [English](README_EN.md) | 简体中文 |

# [56. 合并区间](https://leetcode-cn.com/problems/merge-intervals)
<p>以数组 <code>intervals</code> 表示若干个区间的集合，其中单个区间为 <code>intervals[i] = [start<sub>i</sub>, end<sub>i</sub>]</code> 。请你合并所有重叠的区间，并返回&nbsp;<em>一个不重叠的区间数组，该数组需恰好覆盖输入中的所有区间</em>&nbsp;。</p>

<p>&nbsp;</p>

<p><strong>示例 1：</strong></p>

<pre>
<strong>输入：</strong>intervals = [[1,3],[2,6],[8,10],[15,18]]
<strong>输出：</strong>[[1,6],[8,10],[15,18]]
<strong>解释：</strong>区间 [1,3] 和 [2,6] 重叠, 将它们合并为 [1,6].
</pre>

<p><strong>示例&nbsp;2：</strong></p>

<pre>
<strong>输入：</strong>intervals = [[1,4],[4,5]]
<strong>输出：</strong>[[1,5]]
<strong>解释：</strong>区间 [1,4] 和 [4,5] 可被视为重叠区间。</pre>

<p>&nbsp;</p>

<p><strong>提示：</strong></p>

<ul>
	<li><code>1 &lt;= intervals.length &lt;= 10<sup>4</sup></code></li>
	<li><code>intervals[i].length == 2</code></li>
	<li><code>0 &lt;= start<sub>i</sub> &lt;= end<sub>i</sub> &lt;= 10<sup>4</sup></code></li>
</ul>

**标签:**  [数组](https://leetcode-cn.com/tag/array) [排序](https://leetcode-cn.com/tag/sorting) 
 ### 相似题目
- 中等:	[插入区间](https://leetcode-cn.com/problems/insert-interval) 
- 简单:	[会议室](https://leetcode-cn.com/problems/meeting-rooms) 
- 中等:	[会议室 II](https://leetcode-cn.com/problems/meeting-rooms-ii) 
- 简单:	[提莫攻击](https://leetcode-cn.com/problems/teemo-attacking) 
- 中等:	[给字符串添加加粗标签](https://leetcode-cn.com/problems/add-bold-tag-in-string) 
- 困难:	[Range 模块](https://leetcode-cn.com/problems/range-module) 
- 困难:	[员工空闲时间](https://leetcode-cn.com/problems/employee-free-time) 
- 中等:	[划分字母区间](https://leetcode-cn.com/problems/partition-labels) 
- 中等:	[区间列表的交集](https://leetcode-cn.com/problems/interval-list-intersections) 
