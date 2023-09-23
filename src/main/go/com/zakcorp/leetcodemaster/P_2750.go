package leetcodemaster

const MOD = 1000000007

func numberOfGoodSubarraySplits_recursive(arr []int) int {
	n := len(arr)
	return recursive(n-1, 0, arr)
}

func recursive(index, count int, arr []int) int {
	if index < 0 {
		if count == 1 {
			return 1
		}
		return 0
	}
	if arr[index] == 1 {
		count++
	}
	if count > 1 {
		return 0
	}
	pick := recursive(index-1, count, arr)
	notPick := 0

	if count == 1 {
		notPick = recursive(index-1, 0, arr)
	}

	return (pick + notPick) % MOD
}
