package leetcodemaster

import (
	du "github.com/zakirhussainb/DS/src/main/go/com/zakcorp/utils"
)

func longestSemiRepetitiveSubstring(str string) int {
	i := 0
	last := 0
	ans := 1
	for j := 1; j < len(str); j++ {
		if str[j] == str[j-1] {
			if last > 0 {
				i = last
			}
			last = j
		}
		ans = du.Max(ans, j-i+1)
	}
	return ans
}
