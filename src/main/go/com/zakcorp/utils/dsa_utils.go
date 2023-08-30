package utils

import (
	"fmt"
	"testing"
)

func Max(x, y int) int {
	if x > y {
		return x
	}
	return y
}

func AssertEqualsInt(t *testing.T, got int, want int, desc string) {
	t.Log(desc)
	fmt.Println("got...", got)
	fmt.Println("want...", want)
	if got != want {
		t.Errorf("got %q, wanted %q", got, want)
	}
}

func AssertEqualsStr(t *testing.T, got string, want string, desc string) {
	t.Log(desc)
	fmt.Println("got...", got)
	fmt.Println("want...", want)
	if got != want {
		t.Errorf("got %q, wanted %q", got, want)
	}
}

func Reverse(str string) string {
	res := make([]rune, len(str))
	end := len(str) - 1
	i := 0
	for end > 0 {
		res[i] = rune(str[end])
		i++
	}
	return string(res)
}
