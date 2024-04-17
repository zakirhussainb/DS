package leetcodemaster

import (
	"testing"

	. "github.com/zakirhussainb/DS/src/main/go/com/zakcorp/utils"
)

func TestMaximumLength_1(t *testing.T) {
	AssertEqualsInt(t, maximumLength("aaaa"), 2, "")
}
