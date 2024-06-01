package leetcodemaster

import (
	"testing"

	. "github.com/zakirhussainb/DS/src/main/go/com/zakcorp/utils"
)

func TestLongestSemiRepetitiveSubstring_1(t *testing.T) {
	AssertEqualsInt(t, longestSemiRepetitiveSubstring("12345"), 5, "")
}

func TestLongestSemiRepetitiveSubstring_2(t *testing.T) {
	AssertEqualsInt(t, longestSemiRepetitiveSubstring("3330157"), 6, "")
}

func TestLongestSemiRepetitiveSubstring_3(t *testing.T) {
	AssertEqualsInt(t, longestSemiRepetitiveSubstring("1111111"), 2, "")
}

func TestLongestSemiRepetitiveSubstring_4(t *testing.T) {
	AssertEqualsInt(t, longestSemiRepetitiveSubstring("002020"), 6, "")
}

func TestLongestSemiRepetitiveSubstring_5(t *testing.T) {
	AssertEqualsInt(t, longestSemiRepetitiveSubstring("2002"), 4, "")
}

func TestLongestSemiRepetitiveSubstring_6(t *testing.T) {
	AssertEqualsInt(t, longestSemiRepetitiveSubstring("54944"), 5, "")
}

func TestLongestSemiRepetitiveSubstring_7(t *testing.T) {
	AssertEqualsInt(t, longestSemiRepetitiveSubstring("52233"), 4, "")
}

func TestLongestSemiRepetitiveSubstring_8(t *testing.T) {
	AssertEqualsInt(t, longestSemiRepetitiveSubstring("5223345678"), 8, "")
}

func TestLongestSemiRepetitiveSubstring_9(t *testing.T) {
	AssertEqualsInt(t, longestSemiRepetitiveSubstring("0111"), 3, "")
}

func TestLongestSemiRepetitiveSubstring_10(t *testing.T) {
	AssertEqualsInt(t, longestSemiRepetitiveSubstring("3076888"), 6, "")
}

func TestLongestSemiRepetitiveSubstring_11(t *testing.T) {
	AssertEqualsInt(t, longestSemiRepetitiveSubstring("24489929009"), 7, "")
}
