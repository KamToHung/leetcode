package ___最长回文子串

func longestPalindrome(s string) string {
	// 创建二维数组dp[i][j]，代表范围内是否回文子串
	// 状态转移方程式f(x,y) = f(x+1,y-1)
	length := len(s)
	if length < 2 {
		return s
	}
	dp := make([][]bool, length)
	for i := 0; i < length; i++ {
		dp[i] = make([]bool, length)
	}
	start := 0
	maxLength := 1
	for j := 1; j < length; j++ {
		right := s[j]
		for i := 0; i < j; i++ {
			left := s[i]
			if left != right {
				dp[i][j] = false
				continue
			}
			// left == right
			if j-i <= 2 {
				dp[i][j] = true
			} else {
				dp[i][j] = dp[i+1][j-1]
			}
			// 为回文子串才记录
			if dp[i][j] {
				// 计算最大长度
				if maxLength < j-i+1 {
					start = i
					maxLength = j - i + 1
				}
			}
		}
	}
	return s[start : start+maxLength]
}
