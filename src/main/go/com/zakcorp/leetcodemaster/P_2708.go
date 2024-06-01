package leetcodemaster

import (
	"sort"
)

func maxStrength(arr []int) int64 {
	sort.Ints(arr)
	findOddNegInd := -1
	countNegs := 0
	n := len(arr)
	if n == 1 {
		return int64(arr[0])
	}
	for i := 0; i < n; i++ {
		if arr[i] < 0 {
			countNegs++
		} else {
			if countNegs%2 != 0 {
				findOddNegInd = i - 1
			}
			break
		}

	}
	if findOddNegInd == -1 {
		if arr[n-1] < 0 && countNegs%2 != 0 {
			findOddNegInd = n - 1
		}
	}
	prod := 1
	prodFound := false
	for i := 0; i < len(arr); i++ {
		if i == findOddNegInd || arr[i] == 0 {
			continue
		}
		prod *= arr[i]
		prodFound = true
	}
	if !prodFound {
		return int64(arr[n-1])
	}
	return int64(prod)
}
