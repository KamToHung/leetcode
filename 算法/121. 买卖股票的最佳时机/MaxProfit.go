package _21__买卖股票的最佳时机

func maxProfit(prices []int) int {
	minNumber := prices[0]
	maxNumber := 0
	for i := 1; i < len(prices); i++ {
		maxNumber = max(maxNumber, prices[i]-minNumber)
		minNumber = min(minNumber, prices[i])
	}
	return maxNumber
}

func max(a, b int) int {
	if a > b {
		return a
	}
	return b
}

func min(a, b int) int {
	if a < b {
		return a
	}
	return b
}
