package leetcodemaster

import (
	"testing"

	. "github.com/zakirhussainb/DS/src/main/go/com/zakcorp/utils"
)

func TestLongestCommonSubsequence_1(t *testing.T) {

	AssertEqualsInt(t, recursiveLongestCommonSubsequence("abcde", "ace"), 3, "Recursive method")
	AssertEqualsInt(t, memoizedLongestCommonSubsequence("abcde", "ace"), 3, "Memoized method")
	AssertEqualsInt(t, tabulationLongestCommonSubsequence("abcde", "ace"), 3, "Tabulation method")
	AssertEqualsInt(t, spaceOptimizationLCS("abcde", "ace"), 3, "Space Optimization method")

}
