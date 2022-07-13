package _22__零钱兑换

func coinChange(coins []int, amount int) int {
	dp := make([]int, amount+1)
	for i := 1; i < amount+1; i++ {
		minNumber := amount + 1
		for _, value := range coins {
			if i >= value {
				number := dp[i-value] + 1
				minNumber = min(minNumber, number)
			}
		}
		dp[i] = minNumber
	}
	if dp[amount] == amount+1 {
		return -1
	}
	return dp[amount]
}

func min(a, b int) int {
	if a < b {
		return a
	}
	return b
}
