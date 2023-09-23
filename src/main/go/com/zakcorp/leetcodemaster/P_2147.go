package leetcodemaster

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
