package _293__极大极小游戏

func minMaxGame(nums []int) int {
	n := len(nums)
	if n == 1 {
		return nums[0]
	}
	newLen := n / 2
	newNums := make([]int, newLen)
	for i := 0; i < newLen; i++ {
		if i%2 == 0 {
			newNums[i] = min(nums[i*2], nums[i*2+1])
		} else {
			newNums[i] = max(nums[i*2], nums[i*2+1])
		}
	}
	return minMaxGame(newNums)
}

func min(a, b int) int {
	if a > b {
		return b
	}
	return a
}

func max(a, b int) int {
	if a > b {
		return a
	}
	return b
}
