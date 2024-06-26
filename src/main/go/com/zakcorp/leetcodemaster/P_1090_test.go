package leetcodemaster

import (
	"testing"

	. "github.com/zakirhussainb/DS/src/main/go/com/zakcorp/utils"
)

func TestLargestValsFromLabels_1(t *testing.T) {

	AssertEqualsInt(t, largestValsFromLabels([]int{1, 2, 5, 3, 4},
		[]int{1, 1, 2, 2, 3}, 3, 2), 12, "")

}

func TestLargestValsFromLabels_2(t *testing.T) {

	AssertEqualsInt(t, largestValsFromLabels([]int{5, 4, 3, 2, 1},
		[]int{1, 1, 2, 2, 3}, 3, 1), 9, "")

}

func TestLargestValsFromLabels_3(t *testing.T) {

	AssertEqualsInt(t, largestValsFromLabels([]int{3, 2, 3, 2, 1},
		[]int{1, 0, 2, 2, 1}, 2, 1), 6, "")

}
