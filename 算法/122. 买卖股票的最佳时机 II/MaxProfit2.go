package _22__买卖股票的最佳时机_II

func maxProfit(prices []int) int {
	sum := 0
	for i := 1; i < len(prices); i++ {
		if prices[i-1] < prices[i] {
			sum += prices[i] - prices[i-1]
		}
	}
	return sum
}
