package dp

import (
	du "github.com/zakirhussainb/DS/src/main/go/com/zakcorp/utils"
)

func getLengthOfLongestPalindromicSubsequence(str string) int {
	s2 := du.Reverse(str)
	return getLengthOfLongestCommonSubsequence_tabulation(str, s2)

}
