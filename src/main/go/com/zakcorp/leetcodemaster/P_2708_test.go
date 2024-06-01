package leetcodemaster

import (
	"testing"

	. "github.com/zakirhussainb/DS/src/main/go/com/zakcorp/utils"
)

func TestMaxStrength_1(t *testing.T) {
	AssertEqualsInt(t, int(maxStrength([]int{3, -1, -5, 2, 5, -9})), 1350, "")
}

func TestMaxStrength_2(t *testing.T) {
	AssertEqualsInt(t, int(maxStrength([]int{-4, -5, -4})), 20, "")
}

func TestMaxStrength_3(t *testing.T) {
	AssertEqualsInt(t, int(maxStrength([]int{-6, -8, -9, -7})), 3024, "")
}

func TestMaxStrength_4(t *testing.T) {
	AssertEqualsInt(t, int(maxStrength([]int{-2, -3, 8, 9})), 432, "")
}

func TestMaxStrength_5(t *testing.T) {
	AssertEqualsInt(t, int(maxStrength([]int{-8})), -8, "")
}

func TestMaxStrength_6(t *testing.T) {
	AssertEqualsInt(t, int(maxStrength([]int{9})), 9, "")
}

func TestMaxStrength_7(t *testing.T) {
	AssertEqualsInt(t, int(maxStrength([]int{-9, 9})), 9, "")
}

func TestMaxStrength_8(t *testing.T) {
	AssertEqualsInt(t, int(maxStrength([]int{8, 7})), 56, "")
}

func TestMaxStrength_9(t *testing.T) {
	AssertEqualsInt(t, int(maxStrength([]int{-8, -7})), 56, "")
}

func TestMaxStrength_10(t *testing.T) {
	AssertEqualsInt(t, int(maxStrength([]int{8, 6, 0, 5, -4, -8, -4, 9, -1, 6, -4, 8, -5})), 265420800, "")
}

func TestMaxStrength_11(t *testing.T) {
	AssertEqualsInt(t, int(maxStrength([]int{2, 2, 7, 0, -4, 9, 4})), 1008, "")
}

func TestMaxStrength_12(t *testing.T) {
	AssertEqualsInt(t, int(maxStrength([]int{0, -1})), 0, "")
}

func TestMaxStrength_13(t *testing.T) {
	AssertEqualsInt(t, int(maxStrength([]int{0, -1, 0, -1})), 1, "")
}

func TestMaxStrength_14(t *testing.T) {
	AssertEqualsInt(t, int(maxStrength([]int{0, 0, 0, 0})), 0, "")
}
