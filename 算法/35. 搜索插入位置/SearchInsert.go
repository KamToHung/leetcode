package _5__搜索插入位置

func searchInsert(nums []int, target int) int {
	left := 0
	right := len(nums)
	for left < right {
		mid := left + (right-left)/2
		if target > nums[mid] {
			left = mid + 1
		} else {
			right = mid
		}
	}
	return left
}
