package dp

import (
	"testing"

	du "github.com/zakirhussainb/DS/src/main/go/com/zakcorp/utils"
)

func TestGetLengthOfLongestPalindromicSubsequence_1(t *testing.T) {
	du.AssertEqualsInt(t, getLengthOfLongestPalindromicSubsequence("bbabcbcab"), 7, "Tabulation Method")
}

func TestGetLengthOfLongestPalindromicSubsequence_2(t *testing.T) {
	du.AssertEqualsInt(t, getLengthOfLongestPalindromicSubsequence("bbbab"), 4, "Tabulation Method")
}
