package leetcodemaster

import (
	"fmt"

	utils "github.com/zakirhussainb/DS/src/main/go/com/zakcorp/utils"
)

func largestValsFromLabels(values []int, labels []int,
	numWanted int, useLimit int) int {
	mVL := utils.NewSortedIntMap()
	for i := 0; i < len(values); i++ {
		mVL.Insert(values[i], labels[i], true)
	}
	// Retrieve and print the values
	for _, key := range mVL.Keys() {
		value, _ := mVL.Get(key)
		fmt.Printf("Key: %d, Value: %d\n", key, value)
	}
	return 0
}
