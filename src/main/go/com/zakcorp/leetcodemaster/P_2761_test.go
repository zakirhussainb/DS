package leetcodemaster

import (
	"testing"

	. "github.com/zakirhussainb/DS/src/main/go/com/zakcorp/utils"
)

func TestFindPrimePairs_1(t *testing.T) {
	AssertCompareArrays(t, findPrimePairs(10), [][]int{{3, 7}, {5, 5}}, "")
}

func TestFindPrimePairs_2(t *testing.T) {
	AssertCompareArrays(t, findPrimePairs(2), [][]int{}, "")
}
