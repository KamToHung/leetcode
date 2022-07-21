package ___整数反转

func reverse(x int) int {
	result := 0
	for x != 0 {
		a := x % 10
		result = result*10 + a
		x /= 10
	}
	if int(int32(result)) != result {
		return 0
	}
	return result
}
