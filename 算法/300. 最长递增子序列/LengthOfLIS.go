package _00__最长递增子序列

func lengthOfLIS(nums []int) int {
	// f(x)为当前位置最长递增子序列
	maxLength := 0
	dp := make([]int, len(nums))
	for j := 0; j < len(nums); j++ {
		nowMax := 1
		for i := 0; i < j; i++ {
			if nums[j] <= nums[i] {
				continue
			}
			value := dp[i] + 1
			nowMax = max(nowMax, value)
		}
		dp[j] = nowMax
		maxLength = max(maxLength, nowMax)
	}
	return maxLength
}

func max(a, b int) int {
	if a > b {
		return a
	}
	return b
}
