package dp

import (
	du "github.com/zakirhussainb/DS/src/main/go/com/zakcorp/utils"
)

func tabulationFindLongestCommonSubstring(s1, s2 string) int {
	// create a 2d dp array
	n := len(s1)
	m := len(s2)

	dp := make([][]int, n+1)

	for i := range dp {
		dp[i] = make([]int, m+1)
	}
	// Fill the array with -1
	for i := 0; i <= n; i++ {
		for j := 0; j <= m; j++ {
			dp[i][j] = -1
		}
	}
	for i := 0; i <= n; i++ {
		dp[i][0] = 0
	}

	for j := 0; j <= m; j++ {
		dp[0][j] = 0
	}

	// Start tabulation
	maxVal := 0
	for i := 1; i <= n; i++ {
		for j := 1; j <= m; j++ {
			if s1[i-1] == s2[j-1] {
				dp[i][j] = 1 + dp[i-1][j-1]
				maxVal = du.Max(maxVal, dp[i][j])
			} else {
				dp[i][j] = 0
			}
		}
	}
	return maxVal
}
