package dp

import (
	"testing"

	. "github.com/zakirhussainb/DS/src/main/go/com/zakcorp/utils"
)

func TestLongestCommonSubsequence_1(t *testing.T) {

	AssertEqualsStr(t, findLCS("abcde", "ace"), "ace", "Tabulation method")

}
