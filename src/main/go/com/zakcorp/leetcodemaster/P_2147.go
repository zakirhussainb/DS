package leetcodemaster

func numberOfWays_memoized(corridor string) int {
	n := len(corridor)
	memo := make([][]int, n+1)
	for i := range memo {
		memo[i] = make([]int, 3)
	}

	// Fill with -1
	for i := 0; i <= n; i++ {
		for j := 0; j <= 2; j++ {
			memo[i][j] = -1
		}
	}

	return memoized2147(n-1, 0, corridor, memo)
}

func memoized2147(index, count int, corridor string, memo [][]int) int {
	if index < 0 {
		if count == 2 {
			return 1
		}
		return 0
	}
	if corridor[index] == 'S' {
		count++
	}
	if count > 2 {
		return 0
	}
	if memo[index][count] != -1 {
		return memo[index][count]
	}
	pick := memoized2147(index-1, count, corridor, memo)
	notPick := 0

	if count == 2 {
		notPick = memoized2147(index-1, 0, corridor, memo)
	}

	memo[index][count] = (pick + notPick) % MOD

	return memo[index][count]
}

func numberOfWays_recursive(corridor string) int {
	n := len(corridor)
	return recursive2147(n-1, 0, corridor)
}

func recursive2147(index, count int, corridor string) int {
	if index < 0 {
		if count == 2 {
			return 1
		}
		return 0
	}
	if corridor[index] == 'S' {
		count++
	}
	if count > 2 {
		return 0
	}
	pick := recursive2147(index-1, count, corridor)
	notPick := 0

	if count == 2 {
		notPick = recursive2147(index-1, 0, corridor)
	}

	return (pick + notPick) % MOD
}
