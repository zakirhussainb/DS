package zakcorp

import fmt

func createUtils() {
  fmt.Println("Common Utils")
}

func Max(x, y int) int {
	if x > y {
		return x
	}
	return y
}
