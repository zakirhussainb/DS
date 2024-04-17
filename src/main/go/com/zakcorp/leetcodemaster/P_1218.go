package leetcodemaster

import du "github.com/zakirhussainb/DS/src/main/go/com/zakcorp/utils"

func longestSubsequence(arr []int, difference int) int {
	n := len(arr)
	return recursive1218(n-1, -10000, difference, arr)
}

func recursive1218(index, prevNum, diff int, arr []int) int {
	if index < 0 {
		return 0
	}
	pick := 0
	notPick := 0
	if prevNum == -10000 {
		notPick = recursive1218(index-1, prevNum, diff, arr)
		pick = 1 + recursive1218(index-1, arr[index], diff, arr)
	} else {
		notPick = recursive1218(index-1, prevNum, diff, arr)
		if arr[index]-prevNum == diff {
			pick = 1 + recursive1218(index-1, arr[index], diff, arr)
		}
	}

	return du.Max(pick, notPick)
}
