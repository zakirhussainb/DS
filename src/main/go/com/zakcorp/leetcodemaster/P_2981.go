package leetcodemaster

type st struct {
	char   byte
	length int
}

func maximumLength(str string) int {
	spMap := make(map[st]int)
	n := len(str)
	count := 0
	for i := 0; i < n; i++ {
		spMap[st{char: str[i], length: count}]++
		for j := i; j < n-1; j++ {
			if str[j] == str[j+1] {
				count++
				spMap[st{char: str[i], length: count}]++
			} else {
				break
			}
		}
	}
	ans := 0
	for k, v := range spMap {
		if v >= 3 {
			if k.length > ans {
				ans = k.length
			}
		}
	}
	if ans == 0 {
		return -1
	}
	return ans
}
