package leetcodemaster

import (
	"testing"

	. "github.com/zakirhussainb/DS/src/main/go/com/zakcorp/utils"
)

func TestShortestCommonSupersequence_1(t *testing.T) {

	AssertEqualsStr(t, shortestCommonSupersequence("abac", "cab"), "cabac", "Tabulation method")

}
