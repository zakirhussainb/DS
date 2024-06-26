package leetcodemaster

func maximumSumOfHeights(heights []int) int64 {
	// Find index and maxNum of maximum number in the array
	maxNum := 0
	maxNumInd := -1
	mulPeaks := 1
	for i := 0; i < len(heights); i++ {
		if heights[i] > maxNum {
			maxNum = heights[i]
			maxNumInd = i
			continue
		}
		if heights[i] == maxNum {
			mulPeaks++
		}
	}
	leftNeighborInd := -1
	rightNeighborInd := -1
	if maxNumInd > 0 {
		leftNeighborInd = maxNumInd - 1
	}
	if maxNumInd != -1 || maxNumInd != heights[len(heights)-1] {
		i := maxNumInd
		for i < len(heights) {
			if heights[i] == heights[maxNumInd] {
				i++
			} else {
				break
			}
		}
		if i != maxNumInd {
			rightNeighborInd = i
		} else {
			rightNeighborInd = maxNumInd + 1
		}

	}
	rightSideTot := 0
	if rightNeighborInd != -1 {
		if rightNeighborInd == len(heights)-1 {
			rightSideTot += heights[rightNeighborInd]
		} else {
			for i := rightNeighborInd; i < len(heights); i++ {
				if heights[i] >= heights[rightNeighborInd] {
					rightSideTot += heights[rightNeighborInd]
				} else {
					rightSideTot += heights[i]
				}
			}
		}
	}

	leftSideTot := 0
	if leftNeighborInd != -1 {
		if leftNeighborInd == 0 {
			leftSideTot += heights[leftNeighborInd]
		} else {
			for i := leftNeighborInd; i >= 0; i-- {
				if heights[i] >= heights[leftNeighborInd] {
					leftSideTot += heights[leftNeighborInd]
				} else {
					leftSideTot += heights[i]
				}
			}
		}
	}
	sum := mulPeaks * heights[maxNumInd]
	sum += leftSideTot + rightSideTot
	return int64(sum)

	// leastLeftNum := math.MaxInt32
	// for i := 0; i < maxNumInd; i++ {
	// 	if heights[i] < leastLeftNum {
	// 		leastLeftNum = heights[i]
	// 	}
	// }
	// leastRightNum := math.MaxInt32
	// for i := maxNumInd; i < len(heights); i++ {
	// 	if heights[i] < leastRightNum {
	// 		leastRightNum = heights[i]
	// 	}
	// }
	// sum := 0
	// foundMaxNumInd := false
	// for i := 0; i < len(heights); i++ {
	// 	if maxNumInd == i {
	// 		foundMaxNumInd = true
	// 	}
	// 	if foundMaxNumInd {
	// 		if maxNumInd == i {
	// 			sum += heights[i]
	// 		} else {
	// 			sum += leastRightNum
	// 		}
	// 	} else {
	// 		sum += leastLeftNum
	// 	}
	// }
	return int64(sum)
}
