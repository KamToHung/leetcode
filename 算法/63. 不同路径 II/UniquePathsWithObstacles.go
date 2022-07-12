package _3__不同路径_II

func uniquePathsWithObstacles(obstacleGrid [][]int) int {
	if len(obstacleGrid) == 0 || obstacleGrid[0][0] == 1 {
		return 0
	}
	column := len(obstacleGrid)
	row := len(obstacleGrid[0])
	dp := make([][]int, column)
	for i := 0; i < column; i++ {
		dp[i] = make([]int, row)
	}
	dp[0][0] = 1
	for i := 0; i < column; i++ {
		for j := 0; j < row; j++ {
			if obstacleGrid[i][j] == 1 {
				dp[i][j] = 0
				continue
			}
			if i == 0 && j > 0 {
				dp[i][j] = dp[i][j-1]
			} else if j == 0 && i > 0 {
				dp[i][j] = dp[i-1][j]
			} else if i > 0 && j > 0 {
				dp[i][j] = dp[i-1][j] + dp[i][j-1]
			}
		}
	}
	return dp[column-1][row-1]
}
