package dp

import (
	"testing"

	du "github.com/zakirhussainb/DS/src/main/go/com/zakcorp/utils"
)

func TestGetLengthOfLongestPalindromicSubsequence(t *testing.T) {
	du.AssertEqualsInt(t, getLengthOfLongestPalindromicSubsequence("bbabcbcab"), 7, "Tabulation Method")
}
