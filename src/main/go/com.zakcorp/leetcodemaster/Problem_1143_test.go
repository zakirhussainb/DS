package leetcodemaster

import (
	"testing"
)

func TestLongestCommonSubsequence_1(t *testing.T) {

	assertEquals(t, recursiveLongestCommonSubsequence("abcde", "ace"), 3, "Recursive method")
	assertEquals(t, memoizedLongestCommonSubsequence("abcde", "ace"), 3, "Memoized method")
	assertEquals(t, tabulationLongestCommonSubsequence("abcde", "ace"), 3, "Tabulation method")

}

func assertEquals(t *testing.T, got int, want int, desc string) {
	t.Log(desc)
	if got != want {
		t.Errorf("got %q, wanted %q", got, want)
	}
}
