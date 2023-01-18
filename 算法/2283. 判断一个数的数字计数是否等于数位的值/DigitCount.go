package _283__判断一个数的数字计数是否等于数位的值

func digitCount(num string) bool {
	// 1210 -> 0->1个 1->2个 2->1个 3->0个 true
	// 使用散列表即可 0<=n<10
	numbers := make(map[int32]int32)
	for _, a := range num {
		//ascii
		numbers[a-'0']++
	}
	for index, value := range num {
		cur := numbers[int32(index)]
		if cur != int32(value-'0') {
			return false
		}
	}
	return true
}
