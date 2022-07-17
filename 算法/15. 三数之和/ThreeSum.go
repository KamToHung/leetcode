package _5__三数之和

import "sort"

func threeSum(nums []int) [][]int {
	result := make([][]int, 0)
	// 先排序
	sort.Ints(nums)
	for i := 0; i < len(nums)-2; i++ {
		if i > 0 && nums[i] == nums[i-1] {
			continue
		}
		left := i + 1
		right := len(nums) - 1
		for left < right {
			if left > i+1 && nums[left] == nums[left-1] {
				left++
				continue
			}
			sum := nums[i] + nums[left] + nums[right]
			if sum == 0 {
				numbers := make([]int, 3)
				numbers[0] = nums[i]
				numbers[1] = nums[left]
				numbers[2] = nums[right]
				result = append(result, numbers)
				left++
				right--
			} else if sum > 0 {
				right--
			} else {
				left++
			}
		}
	}
	return result
}
