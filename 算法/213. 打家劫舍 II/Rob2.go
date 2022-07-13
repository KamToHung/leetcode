package _13__打家劫舍_II

func rob(nums []int) int {
	if len(nums) == 1 {
		return nums[0]
	}
	if len(nums) == 2 {
		return max(nums[0], nums[1])
	}
	firstNums := nums[0 : len(nums)-1]
	firstDp := make([]int, len(firstNums))
	firstDp[0] = firstNums[0]
	firstDp[1] = max(firstNums[0], firstNums[1])
	for i := 2; i < len(firstNums); i++ {
		firstDp[i] = max(firstNums[i]+firstDp[i-2], firstDp[i-1])
	}
	secondNums := nums[1:]
	secondDp := make([]int, len(secondNums))
	secondDp[0] = secondNums[0]
	secondDp[1] = max(secondNums[0], secondNums[1])
	for i := 2; i < len(secondNums); i++ {
		secondDp[i] = max(secondNums[i]+secondDp[i-2], secondDp[i-1])
	}
	return max(firstDp[len(firstNums)-1], secondDp[len(secondNums)-1])
}

func max(a, b int) int {
	if a > b {
		return a
	}
	return b
}
