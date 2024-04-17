package leetcodemaster

import (
	"testing"

	. "github.com/zakirhussainb/DS/src/main/go/com/zakcorp/utils"
)

func TestLongestSubsequence_1(t *testing.T) {
	arr := []int{1, 2, 3, 4}
	AssertEqualsInt(t, longestSubsequence(arr, 1), 4, "Recursive method")
}

func TestLongestSubsequence_2(t *testing.T) {
	arr := []int{1, 3, 5, 7}
	AssertEqualsInt(t, longestSubsequence(arr, 1), 1, "Recursive method")
}

func TestLongestSubsequence_3(t *testing.T) {
	arr := []int{1, 5, 7, 8, 5, 3, 4, 2, 1}
	AssertEqualsInt(t, longestSubsequence(arr, -2), 4, "Recursive method")
}

func TestLongestSubsequence_4(t *testing.T) {
	arr := []int{3, 4, -3, -2, -4}
	AssertEqualsInt(t, longestSubsequence(arr, -5), 2, "Recursive method")
}
