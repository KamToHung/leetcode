| English | [简体中文](README.md) |

# [191. Number of 1 Bits](https://leetcode-cn.com/problems/number-of-1-bits)
 ### Description
<p>Write a function that takes an unsigned integer and returns the number of &#39;1&#39; bits it has (also known as the <a href="http://en.wikipedia.org/wiki/Hamming_weight" target="_blank">Hamming weight</a>).</p>

<p><strong>Note:</strong></p>

<ul>
	<li>Note that in some languages, such as Java, there is no unsigned integer type. In this case, the input will be given as a signed integer type. It should not affect your implementation, as the integer&#39;s internal binary representation is the same, whether it is signed or unsigned.</li>
	<li>In Java, the compiler represents the signed integers using <a href="https://en.wikipedia.org/wiki/Two%27s_complement" target="_blank">2&#39;s complement notation</a>. Therefore, in <strong>Example 3</strong>, the input represents the signed integer. <code>-3</code>.</li>
</ul>

<p>&nbsp;</p>
<p><strong>Example 1:</strong></p>

<pre>
<strong>Input:</strong> n = 00000000000000000000000000001011
<strong>Output:</strong> 3
<strong>Explanation:</strong> The input binary string <strong>00000000000000000000000000001011</strong> has a total of three &#39;1&#39; bits.
</pre>

<p><strong>Example 2:</strong></p>

<pre>
<strong>Input:</strong> n = 00000000000000000000000010000000
<strong>Output:</strong> 1
<strong>Explanation:</strong> The input binary string <strong>00000000000000000000000010000000</strong> has a total of one &#39;1&#39; bit.
</pre>

<p><strong>Example 3:</strong></p>

<pre>
<strong>Input:</strong> n = 11111111111111111111111111111101
<strong>Output:</strong> 31
<strong>Explanation:</strong> The input binary string <strong>11111111111111111111111111111101</strong> has a total of thirty one &#39;1&#39; bits.
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li>The input must be a <strong>binary string</strong> of length <code>32</code>.</li>
</ul>

<p>&nbsp;</p>
<strong>Follow up:</strong> If this function is called many times, how would you optimize it?
**Related Topics**  [Bit Manipulation](https://leetcode-cn.com/tag/bit-manipulation) [Divide and Conquer](https://leetcode-cn.com/tag/divide-and-conquer) 

### Similar Questions
 - Easy:	[Reverse Bits](https://leetcode-cn.com/problems/reverse-bits) 
 - Easy:	[Power of Two](https://leetcode-cn.com/problems/power-of-two) 
 - Easy:	[Counting Bits](https://leetcode-cn.com/problems/counting-bits) 
 - Easy:	[Binary Watch](https://leetcode-cn.com/problems/binary-watch) 
 - Easy:	[Hamming Distance](https://leetcode-cn.com/problems/hamming-distance) 
 - Easy:	[Binary Number with Alternating Bits](https://leetcode-cn.com/problems/binary-number-with-alternating-bits) 
 - Easy:	[Prime Number of Set Bits in Binary Representation](https://leetcode-cn.com/problems/prime-number-of-set-bits-in-binary-representation) 
