package main

import "fmt"

func main() {
	arr := []int{5, 3, 8, 6, 2, 7, 1, 4}
	fmt.Println("Original array:", arr)
	sortedArr := mergeSort(arr)
	fmt.Println("Sorted array:", sortedArr)
}

// 合并排序
func mergeSort(arr []int) []int {
	// 如果长度小于等于1则返回
	if len(arr) <= 1 {
		return arr
	}
	// 迭代，每次划分数组左右两边进行排序
	mid := len(arr) >> 1
	left := mergeSort(arr[:mid])
	right := mergeSort(arr[mid:])
	return merge(left, right)
}

// 合并
func merge(left, right []int) []int {
	result := make([]int, 0, len(left)+len(right))
	l, r := 0, 0
	for l < len(left) && r < len(right) {
		if left[l] <= right[r] {
			result = append(result, left[l])
			l++
		} else {
			result = append(result, right[r])
			r++
		}
	}
	// 还有一些剩余元素需要补充上去
	if l < len(left) {
		result = append(result, left[l:]...)
	}
	if r < len(right) {
		result = append(result, right[r:]...)
	}
	return result
}
