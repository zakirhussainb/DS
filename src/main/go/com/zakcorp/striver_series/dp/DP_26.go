package dp

import (
	du "github.com/zakirhussainb/DS/src/main/go/com/zakcorp/utils"
)

func findLCS(s1 string, s2 string) string {
	n := len(s1)
	m := len(s2)

	dp := make([][]int, n+1)
	// creating inner array
	for i := range dp {
		dp[i] = make([]int, m+1)
	}
	// Fill the 2D array with -1
	for i := 0; i <= n; i++ {
		for j := 0; j <= m; j++ {
			dp[i][j] = -1
		}
	}
	// Base case seeding
	for i := 0; i <= n; i++ {
		dp[i][0] = 0
	}

	for j := 0; j <= m; j++ {
		dp[0][j] = 0
	}

	for i := 1; i <= n; i++ {
		for j := 1; j <= m; j++ {
			if s1[i-1] == s2[j-1] {
				dp[i][j] = 1 + dp[i-1][j-1]
			} else {
				notMatch1 := dp[i-1][j]
				notMatch2 := dp[i][j-1]
				dp[i][j] = du.Max(notMatch1, notMatch2)
			}
		}
	}
	res := make([]rune, dp[n][m])
	x := dp[n][m] - 1
	for x > 0 {
		res[x] = '0'
		x--
	}
	i := n
	j := m
	index := dp[n][m] - 1
	for i > 0 && j > 0 {
		if s1[i-1] == s2[j-1] {
			res[index] = rune(s1[i-1])
			index--
			i--
			j--
		} else if dp[i-1][j] > dp[i][j-1] {
			i = i - 1
		} else {
			j = j - 1
		}
	}
	return string(res)
}
