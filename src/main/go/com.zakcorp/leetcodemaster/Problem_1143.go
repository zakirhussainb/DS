package leetcodemaster

func recursiveLongestCommonSubsequence(text1 string, text2 string) int {
	n := len(text1)
	m := len(text2)
	return recursiveLCS(n-1, m-1, text1, text2)
}

func recursiveLCS(ind1 int, ind2 int, text1 string, text2 string) int {
	if ind1 < 0 || ind2 < 0 {
		return 0
	}
	if text1[ind1] == text2[ind2] {
		return 1 + recursiveLCS(ind1-1, ind2-1, text1, text2)
	}
	notMatch1 := recursiveLCS(ind1-1, ind2, text1, text2)
	notMatch2 := recursiveLCS(ind1-1, ind2, text1, text2)
	return Max(notMatch1, notMatch2)
}

func memoizedLongestCommonSubsequence(text1 string, text2 string) int {
	n := len(text1)
	m := len(text2)
	memo := make([][]int, n)
	for i := range memo {
		memo[i] = make([]int, m)
	}
	for i := range memo {
		for j := range memo[i] {
			memo[i][j] = -1
		}
	}
	return memoizedLCS(n-1, m-1, text1, text2, memo)
}

func memoizedLCS(ind1 int, ind2 int, text1 string, text2 string, memo [][]int) int {
	if ind1 < 0 || ind2 < 0 {
		return 0
	}

	if memo[ind1][ind2] != -1 {
		return memo[ind1][ind2]
	}

	if text1[ind1] == text2[ind2] {
		memo[ind1][ind2] = 1 + memoizedLCS(ind1-1, ind2-1, text1, text2, memo)
		return memo[ind1][ind2]
	}

	notMatch1 := memoizedLCS(ind1-1, ind2, text1, text2, memo)
	notMatch2 := memoizedLCS(ind1, ind2-1, text1, text2, memo)
	memo[ind1][ind2] = Max(notMatch1, notMatch2)
	return memo[ind1][ind2]
}

/*
Using shifting of index for writing the base case for tabulation approach
Shifted the index to one right
*/
func tabulationLongestCommonSubsequence(text1 string, text2 string) int {
	n := len(text1)
	m := len(text2)
	dp := make([][]int, n+1)
	for i := range dp {
		dp[i] = make([]int, m+1)
	}
	for i := 0; i <= n; i++ {
		for j := 0; j <= m; j++ {
			dp[i][j] = -1
		}
	}
	// Base Case seeding
	for i := 0; i <= n; i++ {
		dp[i][0] = 0
	}
	for j := 0; j <= m; j++ {
		dp[0][j] = 0
	}
	for i := 1; i <= n; i++ {
		for j := 1; j <= m; j++ {
			if text1[i-1] == text2[j-1] {
				dp[i][j] = 1 + dp[i-1][j-1]
			} else {
				notMatch1 := dp[i-1][j]
				notMatch2 := dp[i][j-1]
				dp[i][j] = Max(notMatch1, notMatch2)
			}
		}
	}
	return dp[n][m]
}

func Max(x, y int) int {
	if x > y {
		return x
	}
	return y
}
