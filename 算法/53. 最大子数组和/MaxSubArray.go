package _3__最大子数组和

func maxSubArray(nums []int) int {
	res := nums[0]
	pre := 0
	for _, value := range nums {
		pre = max(value, pre+value)
		res = max(res, pre)
	}
	return res
}

func max(a, b int) int {
	if a > b {
		return a
	}
	return b
}
