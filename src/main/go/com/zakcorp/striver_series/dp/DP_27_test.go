package dp

import (
	"testing"

	. "github.com/zakirhussainb/DS/src/main/go/com/zakcorp/utils"
)

func TestTabulationFindLongestCommonSubstring(t *testing.T) {

	AssertEqualsInt(t, tabulationFindLongestCommonSubstring("abcd", "abzd"), 2, "Tabulation method")
	AssertEqualsInt(t, tabulationFindLongestCommonSubstring("abcd", "abcd"), 4, "Tabulation method")

}
