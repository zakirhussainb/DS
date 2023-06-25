package P_1143

import (
	"fmt"
	"testing"
)

func TestLongestCommonSubsequence_1(t *testing.T) {

	assertEquals(t, recursiveLongestCommonSubsequence("abcde", "ace"), 3, "Recursive method")
	assertEquals(t, memoizedLongestCommonSubsequence("abcde", "ace"), 3, "Memoized method")
	assertEquals(t, tabulationLongestCommonSubsequence("abcde", "ace"), 3, "Tabulation method")
	assertEquals(t, spaceOptimizationLCS("abcde", "ace"), 3, "Space Optimization method")

}

func assertEquals(t *testing.T, got int, want int, desc string) {
	t.Log(desc)
	fmt.Println("got...", got)
	fmt.Println("want...", want)
	if got != want {
		t.Errorf("got %q, wanted %q", got, want)
	}
}
