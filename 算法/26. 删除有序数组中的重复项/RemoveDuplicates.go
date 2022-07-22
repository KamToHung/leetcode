package _6__删除有序数组中的重复项

func removeDuplicates(nums []int) int {
	index := 1
	for i := 1; i < len(nums); i++ {
		if nums[i] == nums[i-1] {
			continue
		} else {
			nums[index] = nums[i]
			index++
		}
	}
	return index
}
