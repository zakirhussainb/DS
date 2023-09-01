package dp

func minInsertions(str string) int {
	n := len(str)

	return n - getLengthOfLongestPalindromicSubsequence(str)
}
