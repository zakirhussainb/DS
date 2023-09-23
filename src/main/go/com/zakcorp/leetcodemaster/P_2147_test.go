package leetcodemaster

import (
	"testing"

	. "github.com/zakirhussainb/DS/src/main/go/com/zakcorp/utils"
)

func TestNumberOfWays_1(t *testing.T) {
	AssertEqualsInt(t, numberOfWays_recursive("SSPPSPS"), 3, "Recursive method")
}
