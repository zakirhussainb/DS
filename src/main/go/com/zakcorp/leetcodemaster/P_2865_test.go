package leetcodemaster

import (
	"testing"

	. "github.com/zakirhussainb/DS/src/main/go/com/zakcorp/utils"
)

func TestMaximumSumOfHeights_1(t *testing.T) {
	AssertEqualsInt64(t, maximumSumOfHeights([]int{5, 3, 4, 1, 1}), 13, "")
}

func TestMaximumSumOfHeights_2(t *testing.T) {
	AssertEqualsInt64(t, maximumSumOfHeights([]int{6, 5, 3, 9, 2, 7}), 22, "")
}

func TestMaximumSumOfHeights_3(t *testing.T) {
	AssertEqualsInt64(t, maximumSumOfHeights([]int{3, 2, 5, 5, 2, 3}), 18, "")
}

func TestMaximumSumOfHeights_4(t *testing.T) {
	AssertEqualsInt64(t, maximumSumOfHeights([]int{1, 2, 3, 4, 5}), 15, "")
}

func TestMaximumSumOfHeights_5(t *testing.T) {
	AssertEqualsInt64(t, maximumSumOfHeights([]int{3, 4, 2}), 9, "")
}

func TestMaximumSumOfHeights_6(t *testing.T) {
	AssertEqualsInt64(t, maximumSumOfHeights([]int{3, 2, 5, 2, 7, 3, 9, 8, 4}), 35, "")
}
