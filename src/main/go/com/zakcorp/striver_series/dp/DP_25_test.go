package dp

import (
	"testing"

	du "github.com/zakirhussainb/DS/src/main/go/com/zakcorp/utils"
)

func TestGetLengthOfLongestCommonSubsequence_tabulation(t *testing.T) {
	du.AssertEqualsInt(t, getLengthOfLongestCommonSubsequence_tabulation("abcd", "abzd"), 3, "Tabulation Method")
}
