package dp

import (
	"testing"

	du "github.com/zakirhussainb/DS/src/main/go/com/zakcorp/utils"
)

func TestMinInsertionsAndDeletions_1(t *testing.T) {
	du.AssertEqualsInt(t, minInsertionsAndDeletions("abcd", "anc"), 3, "Tabulation Method")
}

func TestMinInsertionsAndDeletions_2(t *testing.T) {
	du.AssertEqualsInt(t, minInsertionsAndDeletions("aaa", "aa"), 1, "Tabulation Method")
}

func TestMinInsertionsAndDeletions_3(t *testing.T) {
	du.AssertEqualsInt(t, minInsertionsAndDeletions("edl", "xcqja"), 8, "Tabulation Method")
}
