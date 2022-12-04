package _36__只出现一次的数字

func singleNumber(nums []int) int {
	if nums == nil || len(nums) == 0 {
		return -1
	}
	memo := make(map[int]int)
	for _, num := range nums {
		memo[num] += 1
	}
	for k, v := range memo {
		if v == 1 {
			return k
		}
	}
	return -1
}
