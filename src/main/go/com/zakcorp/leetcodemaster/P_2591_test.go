package leetcodemaster

import (
	"testing"

	. "github.com/zakirhussainb/DS/src/main/go/com/zakcorp/utils"
)

func TestDistMoney_1(t *testing.T) {
	AssertEqualsInt(t, distMoney(20, 3), 1, "")
}
func TestDistMoney_2(t *testing.T) {
	AssertEqualsInt(t, distMoney(16, 2), 2, "")
}
func TestDistMoney_3(t *testing.T) {
	AssertEqualsInt(t, distMoney(200, 2), 1, "")
}
func TestDistMoney_4(t *testing.T) {
	AssertEqualsInt(t, distMoney(57, 9), 6, "")
}
func TestDistMoney_5(t *testing.T) {
	AssertEqualsInt(t, distMoney(77, 25), 7, "")
}
