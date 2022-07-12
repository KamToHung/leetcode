package ___两数之和

func twoSum(nums []int, target int) []int {
	memo := make(map[int]int)
	for key, value := range nums {
		result := target - value
		if value, ok := memo[result]; ok {
			return []int{value, key}
		}
		memo[value] = key
	}
	return []int{}
}
