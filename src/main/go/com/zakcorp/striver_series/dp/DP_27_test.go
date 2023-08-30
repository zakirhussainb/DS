package dp

import (
	"testing"

	. "github.com/zakirhussainb/DS/src/main/go/com/zakcorp/utils"
)

func TestTabulationFindLongestCommonSubstring(t *testing.T) {

	AssertEqualsInt(t, tabulationFindLongestCommonSubstring("abcd", "abzd"), 2, "Tabulation method")
	AssertEqualsInt(t, tabulationFindLongestCommonSubstring("abcd", "abcd"), 4, "Tabulation method")

}

func TestSpaceOptimizationFindLongestCommonSubstring(t *testing.T) {

	AssertEqualsInt(t, spaceOptimizationLongestCommonSubstring("abcd", "abzd"), 2, "Space Optimization method")
	AssertEqualsInt(t, spaceOptimizationLongestCommonSubstring("abcd", "abcd"), 4, "Space Optimization method")

}
