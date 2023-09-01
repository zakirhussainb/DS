package dp

func minInsertionsAndDeletions(s1, s2 string) int {
	lcs := getLengthOfLongestCommonSubsequence_tabulation(s1, s2)
	deletions := len(s1) - lcs
	insertions := len(s2) - lcs

	return deletions + insertions
}
