package _18__零钱兑换_II

func change(amount int, coins []int) int {
	// 状态转移方程式f(x) = f(x) + f(x - coin)
	dp := make([]int, amount+1)
	// 当amount=0的时候，只有一种方案
	dp[0] = 1
	for _, coin := range coins {
		for i := 1; i <= amount; i++ {
			if i < coin {
				continue
			}
			dp[i] = dp[i] + dp[i-coin]
		}
	}
	return dp[amount]
}
