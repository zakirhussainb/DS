package leetcodemaster

import (
	"fmt"
	"sort"
)

type FrequencyTracker struct {
	cnt  []int
	freq []int
}

func Constructor() FrequencyTracker {
	return FrequencyTracker{cnt: make([]int, 100001), freq: make([]int, 100001)}
}

func (this *FrequencyTracker) Add(number int) {
	this.freq[this.cnt[number]]
}

func (this *FrequencyTracker) DeleteOne(number int) {
	this.hashtable[number]--
}

func (this *FrequencyTracker) HasFrequency(frequency int) bool {
	sort.Ints(this.hashtable)
	result := this.BinarySearch(frequency)
	return result != -1
}

// BinarySearch performs a binary search on the sorted slice of the set.
func (this *FrequencyTracker) BinarySearch(target int) int {
	fmt.Println("hash...", this.hashtable)
	low := 1
	high := len(this.hashtable) - 1
	for low <= high {
		med := low + (high-low)/2
		if this.hashtable[med] < target {
			low = med + 1
		} else if this.hashtable[med] > target {
			high = med - 1
		} else {
			return med
		}
	}
	return -1
}

/**
 * Your FrequencyTracker object will be instantiated and called as such:
 * obj := Constructor();
 * obj.Add(number);
 * obj.DeleteOne(number);
 * param_3 := obj.HasFrequency(frequency);
 */
