package leetcodemaster

import (
	"testing"

	. "github.com/zakirhussainb/DS/src/main/go/com/zakcorp/utils"
)

func TestFrequencyTracker_1(t *testing.T) {
	obj := Constructor()
	obj.Add(3)
	obj.Add(3)
	AssertTrue(t, obj.HasFrequency(2), "")
}
