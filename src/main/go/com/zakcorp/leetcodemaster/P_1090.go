package leetcodemaster

import (
	"sort"
)

/*
Lessons learnt in this problem:
	-> Whenever you need to map two arrays, wherein you need to sort one array in
	asc/desc order, without compromising on the mapped values order, then,
		-> you can use a 2D array instead of a key-value map
		-> because when you sort a 2D array by 1 column, it will sort
*/

// The below solution doesn't work as there are values with duplicate entries
// and map doesn't store keys as duplicates
/*
func largestValsFromLabels(values []int, labels []int,
	numWanted int, useLimit int) int {
	hashTab := make([]int, 20001)
	mVL := utils.NewSortedIntMap()
	for i := 0; i < len(values); i++ {
		mVL.Insert(values[i], labels[i], true)
	}

	maxSum := 0
	for _, key := range mVL.Keys() {
		value, _ := mVL.Get(key)
		if numWanted > 0 && hashTab[value] < useLimit {
			maxSum += key
			hashTab[value]++
			numWanted--
		}
		fmt.Printf("numWanted: %d", numWanted)
		fmt.Printf("Key: %d, Value: %d\n", key, value)
	}
	return maxSum
}
*/
func largestValsFromLabels(values []int, labels []int,
	numWanted int, useLimit int) int {
	// map of labels
	hashTable := make(map[int]int)
	for _, label := range labels {
		hashTable[label] = 0
	}
	size := len(values)
	// Declare 2D array
	valLab := make([][]int, size)
	for i := range valLab {
		valLab[i] = make([]int, 2)
	}

	// Fill in the 2D array
	for i := 0; i < size; i++ {
		valLab[i][0] = values[i]
		valLab[i][1] = labels[i]
	}

	// Sort 2D array based on 1st column, where 1st col is sorted in desc order
	sort.Slice(valLab, func(i, j int) bool {
		return valLab[i][0] > valLab[j][0]
	})

	sum := 0
	for i := 0; i < size; i++ {
		value := valLab[i][0]
		label := valLab[i][1]
		if numWanted <= 0 {
			break
		}
		if numWanted > 0 && hashTable[label] < useLimit {
			sum += value
			hashTable[label] += 1
			numWanted--
		}
	}
	return sum
}
