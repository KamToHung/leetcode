| [English](README_EN.md) | 简体中文 |

# [面试题 16.14. 最佳直线](https://leetcode-cn.com/problems/best-line-lcci)
<p>给定一个二维平面及平面上的 N 个点列表<code>Points</code>，其中第<code>i</code>个点的坐标为<code>Points[i]=[X<sub>i</sub>,Y<sub>i</sub>]</code>。请找出一条直线，其通过的点的数目最多。</p>
<p>设穿过最多点的直线所穿过的全部点编号从小到大排序的列表为<code>S</code>，你仅需返回<code>[S[0],S[1]]</code>作为答案，若有多条直线穿过了相同数量的点，则选择<code>S[0]</code>值较小的直线返回，<code>S[0]</code>相同则选择<code>S[1]</code>值较小的直线返回。</p>
<p><strong>示例：</strong></p>
<pre><strong>输入：</strong> [[0,0],[1,1],[1,0],[2,0]]
<strong>输出：</strong> [0,2]
<strong>解释：</strong> 所求直线穿过的3个点的编号为[0,2,3]
</pre>
<p><strong>提示：</strong></p>
<ul>
<li><code>2 <= len(Points) <= 300</code></li>
<li><code>len(Points[i]) = 2</code></li>
</ul>

**标签:**  [几何](https://leetcode-cn.com/tag/geometry) [数组](https://leetcode-cn.com/tag/array) [哈希表](https://leetcode-cn.com/tag/hash-table) [数学](https://leetcode-cn.com/tag/math) 