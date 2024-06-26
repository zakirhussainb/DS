package utils

import "sort"

// Define a structure to hold the map and the sorted keys
type SortedIntMap struct {
	keys []int
	data map[int]int
}

// NewSortedIntMap creates a new SortedIntMap
func NewSortedIntMap() *SortedIntMap {
	return &SortedIntMap{
		keys: make([]int, 0),
		data: make(map[int]int),
	}
}

// Insert inserts a key-value pair into the SortedIntMap
// By default the sortOrder is ascending and the value is false
func (sm *SortedIntMap) Insert(key int, value int, sortOrder bool) {
	// Insert the key-value pair into the map
	sm.data[key] = value

	// Insert the key into the slice if it is not already present
	i := sort.SearchInts(sm.keys, key)

	if sortOrder {
		i = sort.Search(len(sm.keys), func(i int) bool { return sm.keys[i] <= key })
	}

	if i < len(sm.keys) && sm.keys[i] == key {
		// Key already exists in the slice, no need to insert
		return
	}

	// Insert the key at the correct position to maintain sorted order
	sm.keys = append(sm.keys, 0)
	copy(sm.keys[i+1:], sm.keys[i:])
	sm.keys[i] = key
}

// Get retrieves a value from the SortedIntMap
func (sm *SortedIntMap) Get(key int) (int, bool) {
	value, ok := sm.data[key]
	return value, ok
}

// Keys returns the sorted keys
func (sm *SortedIntMap) Keys() []int {
	return sm.keys
}
