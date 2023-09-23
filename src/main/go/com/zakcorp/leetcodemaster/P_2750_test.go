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

func TestNumberOfGoodSubarraySplits_2(t *testing.T) {
	arr := []int{0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1}
	AssertEqualsInt(t, numberOfGoodSubarraySplits_recursive(arr), 8, "Recursive method")
	AssertEqualsInt(t, numberOfGoodSubarraySplits_memoized(arr), 8, "Memoized method")
}

func TestNumberOfGoodSubarraySplits_3(t *testing.T) {
	arr := []int{1}
	AssertEqualsInt(t, numberOfGoodSubarraySplits_recursive(arr), 1, "Recursive method")
	AssertEqualsInt(t, numberOfGoodSubarraySplits_memoized(arr), 1, "Memoized method")
}
