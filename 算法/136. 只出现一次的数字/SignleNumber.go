package _36__只出现一次的数字

func singleNumber(nums []int) int {
	numLen := len(nums)
	if nums == nil || numLen == 0 {
		return 0
	}
	value := nums[0]
	for i := 1; i < numLen; i++ {
		value ^= nums[i]
	}
	return value
}
