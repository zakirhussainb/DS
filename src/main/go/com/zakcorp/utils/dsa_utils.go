package utils

import (
	"fmt"
	"math"
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

func AssertEqualsInt64(t *testing.T, got int64, want int64, desc string) {
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

func AssertCompareArrays(t *testing.T, got [][]int, want [][]int, desc string) bool {
	t.Log(desc)
	fmt.Println("got...", got)
	fmt.Println("want...", want)
	if len(got) != len(want) {
		return false
	}
	for i := range got {
		if len(got[i]) != len(want[i]) {
			t.Errorf("got %q, wanted %q", got, want)
			return false
		}
		for j := range got[i] {
			if got[i][j] != want[i][j] {
				t.Errorf("got %q, wanted %q", got, want)
				return false
			}
		}
	}
	return true
}

func AssertTrue(t *testing.T, got bool, desc string) {
	t.Log(desc)
	fmt.Println("got...", got)
	fmt.Println("want...", true)
	if !got {
		t.Errorf("got %t, wanted %t", got, true)
	}
}

func AssertFalse(t *testing.T, got bool, desc string) {
	t.Log(desc)
	fmt.Println("got...", got)
	fmt.Println("want...", false)
	if got {
		t.Errorf("got %t, wanted %t", got, false)
	}
}

func Reverse(str string) string {
	res := make([]rune, len(str))
	end := len(str) - 1
	i := 0
	for end >= 0 {
		res[i] = rune(str[end])
		i++
		end--
	}
	return string(res)
}

func IsPrime(n int) bool {
	if n <= 1 {
		return false
	}
	if n <= 3 {
		return true
	}
	if n%2 == 0 || n%3 == 0 {
		return false
	}
	// Only check up to the square root of n
	sqrtN := int(math.Sqrt(float64(n)))
	for i := 5; i <= sqrtN; i += 6 {
		if n%i == 0 || n%(i+2) == 0 {
			return false
		}
	}
	return true
}
