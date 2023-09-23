package leetcodemaster

import (
	"testing"

	. "github.com/zakirhussainb/DS/src/main/go/com/zakcorp/utils"
)

func TestNumberOfGoodSubarraySplits_1(t *testing.T) {
	arr := []int{0, 1, 0, 0, 1}
	AssertEqualsInt(t, numberOfGoodSubarraySplits_recursive(arr), 3, "Recursive method")
	AssertEqualsInt(t, numberOfGoodSubarraySplits_memoized(arr), 3, "Memoized method")
}
