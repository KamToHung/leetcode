package ___无重复字符的最长子串

func lengthOfLongestSubstring(s string) int {
	left, right, maxValue := 0, 0, 0
	memo := make(map[uint8]int)
	for right < len(s) {
		value := s[right]
		memo[value] = memo[value] + 1
		for memo[value] > 1 {
			leftValue := s[left]
			memo[leftValue] = memo[leftValue] - 1
			left++
		}
		maxValue = max(maxValue, right-left+1)
		right++
	}
	return maxValue
}

func max(a, b int) int {
	if a > b {
		return a
	}
	return b
}
