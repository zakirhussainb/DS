package leetcodemaster

import "fmt"

func firstCompleteIndex(arr []int, mat [][]int) int {
	m := len(mat)    // no. of rows
	n := len(mat[0]) // no. of cols
	rcMap := make(map[string]int)

	i := 0
	for i < len(arr) {
		for r := 0; r < m; r++ {
			for c := 0; c < n; c++ {
				if arr[i] == mat[r][c] {
					rowStr := fmt.Sprintf("%s%d", "r_", r)
					colStr := fmt.Sprintf("%s%d", "c_", c)
					if value, exists := rcMap[rowStr]; exists {
						rcMap[rowStr] = value + 1
					} else {
						rcMap[rowStr] = 1
					}
					if value, exists := rcMap[colStr]; exists {
						rcMap[colStr] = value + 1
					} else {
						rcMap[colStr] = 1
					}
					if rcMap[rowStr] == n {
						return i
					}
					if rcMap[colStr] == m {
						return i
					}
					i++
				}
			}
		}
	}
	return 0
}
