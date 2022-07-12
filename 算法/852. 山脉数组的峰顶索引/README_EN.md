| English | [简体中文](README.md) |

# [852. Peak Index in a Mountain Array](https://leetcode-cn.com/problems/peak-index-in-a-mountain-array)
 ### Description
<p>An array <code>arr</code> a <strong>mountain</strong> if the following properties hold:</p>

<ul>
	<li><code>arr.length &gt;= 3</code></li>
	<li>There exists some <code>i</code> with <code>0 &lt; i &lt; arr.length - 1</code> such that:
	<ul>
		<li><code>arr[0] &lt; arr[1] &lt; ... &lt; arr[i - 1] &lt; arr[i] </code></li>
		<li><code>arr[i] &gt; arr[i + 1] &gt; ... &gt; arr[arr.length - 1]</code></li>
	</ul>
	</li>
</ul>

<p>Given a mountain array <code>arr</code>, return the index <code>i</code> such that <code>arr[0] &lt; arr[1] &lt; ... &lt; arr[i - 1] &lt; arr[i] &gt; arr[i + 1] &gt; ... &gt; arr[arr.length - 1]</code>.</p>

<p>You must solve it in <code>O(log(arr.length))</code> time complexity.</p>

<p>&nbsp;</p>
<p><strong>Example 1:</strong></p>

<pre>
<strong>Input:</strong> arr = [0,1,0]
<strong>Output:</strong> 1
</pre>

<p><strong>Example 2:</strong></p>

<pre>
<strong>Input:</strong> arr = [0,2,1,0]
<strong>Output:</strong> 1
</pre>

<p><strong>Example 3:</strong></p>

<pre>
<strong>Input:</strong> arr = [0,10,5,2]
<strong>Output:</strong> 1
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>3 &lt;= arr.length &lt;= 10<sup>5</sup></code></li>
	<li><code>0 &lt;= arr[i] &lt;= 10<sup>6</sup></code></li>
	<li><code>arr</code> is <strong>guaranteed</strong> to be a mountain array.</li>
</ul>

**Related Topics**  [Array](https://leetcode-cn.com/tag/array) [Binary Search](https://leetcode-cn.com/tag/binary-search) 

### Similar Question
 - Medium:	[Find Peak Element](https://leetcode-cn.com/problems/find-peak-element) 
