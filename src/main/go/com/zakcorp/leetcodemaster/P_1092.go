package leetcodemaster

func shortestCommonSupersequence(s1 string, s2 string) string {
	lcs := longestCommonSubsequence(s1, s2)
	return lcs
}

func longestCommonSubsequence(s1, s2 string) string {
	n := len(s1)
	m := len(s2)
	// construct 2d dp array
	dp := make([][]string, n+1)
	for i := range dp {
		dp[i] = make([]string, m+1)
	}
	// Fill the array with "" as default value
	for i := 0; i <= n; i++ {
		for j := 0; j <= m; j++ {
			dp[i][j] = ""
		}
	}
	// Start tabulation
	for i := 1; i <= n; i++ {
		for j := 1; j <= m; j++ {
			if string(s1[i-1]) == string(s2[j-1]) {
				dp[i][j] = string(s1[i-1]) + string(dp[i-1][j-1])
			} else {
				if len(dp[i-1][j]) > len(dp[i][j-1]) {
					dp[i][j] = dp[i-1][j]
				} else {
					dp[i][j] = dp[i][j-1]
				}
			}
		}
	}
	return dp[n][m]
}
