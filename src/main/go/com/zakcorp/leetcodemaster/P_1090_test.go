package leetcodemaster

import (
	"testing"

	. "github.com/zakirhussainb/DS/src/main/go/com/zakcorp/utils"
)

func TestLargestValsFromLabels_1(t *testing.T) {

	AssertEqualsInt(t, largestValsFromLabels([]int{1, 2, 5, 3, 4},
		[]int{1, 1, 2, 2, 3}, 3, 2), 12, "")

}
