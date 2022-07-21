package _73__最长递增子序列的个数

func findNumberOfLIS(nums []int) int {
	//  状态转移方程式：f(x) = v(x) + 1
	// 每个位置代表包含当前位置数字的最长递增子串
	dp := make([]int, len(nums))
	// 每个位置代表包含当前位置数据的最长递增子串的数量
	result := make([]int, len(nums))
	maxLength := 0
	count := 0
	for i := 0; i < len(nums); i++ {
		// 默认最长长度为1
		dp[i] = 1
		// 默认最长长度的数量为1
		result[i] = 1
		// 从i~j之间,获取最长长度和最长长度数量
		for j := 0; j < i; j++ {
			// 因为是递增子串,所以非递增跳过
			if nums[j] >= nums[i] {
				continue
			}
			nowLength := dp[j] + 1
			// 如果当前长度比上次计算出来的长度长则替换并且设置重置最长递增子串的数量
			if nowLength > dp[i] {
				dp[i] = nowLength
				result[i] = result[j]
			} else if nowLength == dp[i] {
				result[i] += result[j]
			}
		}
		if dp[i] > maxLength {
			maxLength = dp[i]
			count = result[i]
		} else if dp[i] == maxLength {
			count += result[i]
		}
	}
	return count
}
