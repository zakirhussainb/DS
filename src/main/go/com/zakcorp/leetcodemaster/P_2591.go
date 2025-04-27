package leetcodemaster

func distMoney(money int, children int) int {
	ans := 0
	for money > children && children >= 1 {
		money -= 8
		if money == 4 {
			return ans
		}
		children--
		ans++
	}
	return ans
}
