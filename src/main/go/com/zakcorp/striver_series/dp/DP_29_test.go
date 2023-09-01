package dp

import (
	"testing"

	du "github.com/zakirhussainb/DS/src/main/go/com/zakcorp/utils"
)

func TestMinInsertions_1(t *testing.T) {
	du.AssertEqualsInt(t, minInsertions("zzazz"), 0, "Tabulation Method")
}

func TestMinInsertions_2(t *testing.T) {
	du.AssertEqualsInt(t, minInsertions("mbadm"), 2, "Tabulation Method")
}

func TestMinInsertions_3(t *testing.T) {
	du.AssertEqualsInt(t, minInsertions("leetcode"), 5, "Tabulation Method")
}
