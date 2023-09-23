package dp

import (
	"testing"

	du "github.com/zakirhussainb/DS/src/main/go/com/zakcorp/utils"
)

func TestTabulationFindShortestCommonSuperSequence_1(t *testing.T) {
	du.AssertEqualsStr(t, shortestCommonSuperSequence("abac", "cab"), "cabac", "Tabulation method")
}

func TestTabulationFindShortestCommonSuperSequence_2(t *testing.T) {
	du.AssertEqualsStr(t, shortestCommonSuperSequence("aaaaaaaa", "aaaaaaaa"), "aaaaaaaa", "Tabulation method")
}

func TestTabulationFindShortestCommonSuperSequence_3(t *testing.T) {
	// TODO:- This test case is failing fix it
	du.AssertEqualsStr(t, shortestCommonSuperSequence("bbbaaaba", "bbababbb"), "bbabaaababb", "Tabulation method")
}
