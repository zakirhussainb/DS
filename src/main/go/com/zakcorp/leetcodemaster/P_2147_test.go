package leetcodemaster

import (
	"testing"

	. "github.com/zakirhussainb/DS/src/main/go/com/zakcorp/utils"
)

func TestNumberOfWays_1(t *testing.T) {
	AssertEqualsInt(t, numberOfWays_recursive("SSPPSPS"), 3, "Recursive method")
	AssertEqualsInt(t, numberOfWays_memoized("SSPPSPS"), 3, "Memoized method")
}

func TestNumberOfWays_2(t *testing.T) {
	AssertEqualsInt(t, numberOfWays_recursive("PPSPSP"), 1, "Recursive method")
	AssertEqualsInt(t, numberOfWays_memoized("PPSPSP"), 1, "Memoized method")
}

func TestNumberOfWays_3(t *testing.T) {
	AssertEqualsInt(t, numberOfWays_recursive("S"), 0, "Recursive method")
	AssertEqualsInt(t, numberOfWays_memoized("S"), 0, "Memoized method")
}

func TestNumberOfWays_4(t *testing.T) {
	// AssertEqualsInt(t, numberOfWays_recursive("PPPPPSPPSPPSPPPSPPPPSPPPPSPPPPSPPSPPPSPSPPPSPSPPPSPSPPPSPSPPPPSPPPPSPPPSPPSPPPPSPSPPPPSPSPPPPSPSPPPSPPSPPPPSPSPSS"), 919999993, "Recursive method")
	AssertEqualsInt(t, numberOfWays_memoized("PPPPPSPPSPPSPPPSPPPPSPPPPSPPPPSPPSPPPSPSPPPSPSPPPSPSPPPSPSPPPPSPPPPSPPPSPPSPPPPSPSPPPPSPSPPPPSPSPPPSPPSPPPPSPSPSS"), 919999993, "Memoized method")
}
