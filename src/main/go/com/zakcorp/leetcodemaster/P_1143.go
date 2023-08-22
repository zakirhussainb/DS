package leetcodemaster

import (
	dsa_utils "github.com/zakirhussainb/DS/src/main/go/com/zakcorp/utils/dsa_utils"
)

/*
* Brute Force - The time complexity is exponential in nature
* Generate all the subsequences & compare on the way - This is the standard way.

Rules
* Express everything in terms of (ind1 and ind2)
 	-> A single index cannot represent both the strings, so thereby we need to express them with two different indices,
ind1 and ind2.
* Explore all the possibilities
	-> If a character in ind1 is matching with ind2, then add 1 and shrink both the strings by 1 character and perform
the recursion.
	-> If match, then, "1 + recursive(ind1 - 1, ind2 - 1)"
	-> If not match, then, take max( rec(ind1 - 1, ind2), rec(ind1, ind2 - 1) )
*/

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
	return dsa_utils.Max(notMatch1, notMatch2)
}

func memoizedLongestCommonSubsequence(text1 string, text2 string) int {
	n := len(text1)
	m := len(text2)
	memo := make([][]int, n) // creating a 2d array of 'n' rows
	for i := range memo {
		memo[i] = make([]int, m) // and 'm' columns
	}
	// Filling the 2d array with -1 values
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
Shifted the index to one right, that is creating the dp array with 1 extra size
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

func spaceOptimizationLCS(text1 string, text2 string) int {
	n := len(text1)
	m := len(text2)
	prev := make([]int, m+1)
	// Base case seeding
	for j := 0; j <= m; j++ {
		prev[j] = 0
	}

	for i := 1; i <= n; i++ {
		curr := make([]int, m+1)
		for j := 1; j <= m; j++ {
			if text1[i-1] == text2[j-1] {
				curr[j] = 1 + prev[j-1]
			} else {
				notMatch1 := prev[j]
				notMatch2 := curr[j-1]
				curr[j] = Max(notMatch1, notMatch2)
			}
		}
		prev = curr
	}
	return prev[m]
}
