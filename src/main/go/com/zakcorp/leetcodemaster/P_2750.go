package leetcodemaster

// TODO:- Need to implement the tabulation and space optimization solution, because the memoized solution is
// still not that efficient

const MOD = 1000000007

func numberOfGoodSubarraySplits_memoized(arr []int) int {
	n := len(arr)
	memo := make([][]int, n)
	for i := range memo {
		memo[i] = make([]int, 2)
	}
	for i := 0; i < n; i++ {
		for j := 0; j < 2; j++ {
			memo[i][j] = -1
		}
	}
	return memoized(n-1, 0, arr, memo)
}

func memoized(index, count int, arr []int, memo [][]int) int {
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
	if memo[index][count] != -1 {
		return memo[index][count]
	}
	pick := memoized(index-1, count, arr, memo)
	notPick := 0

	if count == 1 {
		notPick = memoized(index-1, 0, arr, memo)
	}
	memo[index][count] = (pick + notPick) % MOD
	return memo[index][count]
}

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
