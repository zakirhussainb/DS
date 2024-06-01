package leetcodemaster

import (
	"testing"

	. "github.com/zakirhussainb/DS/src/main/go/com/zakcorp/utils"
)

func TestFirstCompleteIndex_1(t *testing.T) {
	AssertEqualsInt(t, firstCompleteIndex([]int{1, 3, 4, 2}, [][]int{{1, 4}, {2, 3}}), 2, "")
}

func TestFirstCompleteIndex_2(t *testing.T) {
	AssertEqualsInt(t, firstCompleteIndex([]int{2, 8, 7, 4, 1, 3, 5, 6, 9},
		[][]int{{3, 2, 5}, {1, 4, 6}, {8, 7, 9}}), 3, "")
}

func TestFirstCompleteIndex_3(t *testing.T) {
	AssertEqualsInt(t, firstCompleteIndex([]int{1, 4, 5, 2, 6, 3},
		[][]int{{4, 3, 5}, {1, 2, 6}}), 1, "")
}
