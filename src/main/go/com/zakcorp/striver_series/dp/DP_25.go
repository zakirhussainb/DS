package dp

import du "github.com/zakirhussainb/DS/src/main/go/com/zakcorp/utils"

func getLengthOfLongestCommonSubsequence_tabulation(s1, s2 string) int {
	n := len(s1)
	m := len(s2)

	// construct 2d dp array
	dp := make([][]int, n+1)
	for i := range dp {
		dp[i] = make([]int, m+1)
	}
	// Fill the array with -1 as default value
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
	// Start tabulation
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
	return dp[n][m]
}
