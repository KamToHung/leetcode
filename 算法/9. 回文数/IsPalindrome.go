package ___回文数

func isPalindrome(x int) bool {
	if x < 0 || (x > 0 && x%10 == 0) {
		return false
	}
	result := 0
	temp := x
	for {
		if temp == 0 {
			break
		}
		result = result*10 + temp%10
		temp = temp / 10
	}
	return result == x
}
