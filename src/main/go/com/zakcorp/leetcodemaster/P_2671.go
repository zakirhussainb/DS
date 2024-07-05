package leetcodemaster

type FrequencyTracker struct {
	numMap map[int]int
	hfMap  map[int]int
}

func Constructor() FrequencyTracker {
	return FrequencyTracker{numMap: make(map[int]int),
		hfMap: make(map[int]int)}
}

func (this *FrequencyTracker) Add(number int) {
	if frequency, exists := this.numMap[number]; exists {
		this.numMap[number] = frequency + 1

		// Check this frequency in freqMap now
		if occurrence, exists := this.hfMap[frequency]; exists {
			this.hfMap[frequency] = occurrence - 1
			if this.hfMap[frequency] == 0 {
				delete(this.hfMap, frequency)
			}
			this.hfMap[this.numMap[number]] = 1
		} else {
			this.hfMap[1] = 1
		}

	} else {
		this.numMap[number] = 1
		if value, exists := this.hfMap[1]; exists {
			this.hfMap[1] = value + 1
		} else {
			this.hfMap[1] = 1
		}
	}
}

func (this *FrequencyTracker) DeleteOne(number int) {
	if existingFreq, exists := this.numMap[number]; exists {
		this.numMap[number] = existingFreq - 1
		if this.numMap[number] == 0 {
			delete(this.numMap, number)
		}
		if occurrence, exists := this.hfMap[existingFreq]; exists {
			this.hfMap[existingFreq] = occurrence - 1
			if this.hfMap[existingFreq] == 0 {
				delete(this.hfMap, existingFreq)
				if v, exists := this.hfMap[this.numMap[number]]; exists {
					this.hfMap[this.numMap[number]] = v + 1
				} else {
					this.hfMap[this.numMap[number]] = 1
				}
			}
		}
	}
}

func (this *FrequencyTracker) HasFrequency(frequency int) bool {
	if _, exists := this.hfMap[frequency]; exists {
		return true
	}
	return false
}

/**
 * Your FrequencyTracker object will be instantiated and called as such:
 * obj := Constructor();
 * obj.Add(number);
 * obj.DeleteOne(number);
 * param_3 := obj.HasFrequency(frequency);
 */
