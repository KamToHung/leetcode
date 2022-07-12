package _98__打家劫舍

func rob(nums []int) int {
	//状态转移方程式 f(x) = max(v(x)+f(x-2), f(x-1))
	//出口: f(0) = v(0), f(1) = max(v(0), v(1))
	if len(nums) < 2 {
		return nums[0]
	}
	dp := make([]int, len(nums))
	dp[0] = nums[0]
	dp[1] = max(nums[0], nums[1])
	for i := 2; i < len(nums); i++ {
		dp[i] = max(nums[i]+dp[i-2], dp[i-1])
	}
	return dp[len(nums)-1]
}

func max(a int, b int) int {
	if a > b {
		return a
	}
	return b
}
