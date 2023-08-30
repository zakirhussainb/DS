package dp

import (
	"testing"

	du "github.com/zakirhussainb/DS/src/main/go/com/zakcorp/utils"
)

func TestLongestCommonSubsequence_1(t *testing.T) {

	du.AssertEqualsStr(t, findLCS("abcde", "ace"), "ace", "Tabulation method")

}
