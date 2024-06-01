package leetcodemaster

import (
	du "github.com/zakirhussainb/DS/src/main/go/com/zakcorp/utils"
)

func findPrimePairs(n int) [][]int {
	result := [][]int{}
	pMap := make(map[int]int)
	for i := 2; i < n; i++ {
		if du.IsPrime(i) {
			res := n - i
			if du.IsPrime(res) {
				keyFound := i
				if value, exists := pMap[keyFound]; exists {
					if res == value {
						continue
					}
				} else if value, exists := pMap[res]; exists {
					if keyFound == value {
						continue
					}
				} else {
					pMap[i] = res
				}
				result = append(result, []int{i, res})
			}
		}
	}
	return result
}
