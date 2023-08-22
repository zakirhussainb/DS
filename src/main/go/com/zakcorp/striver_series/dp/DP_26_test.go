package dp

import (
	. "github.com/onsi/ginkgo/v2"
	. "github.com/onsi/gomega"
)

var _ = Describe("Get Hello World result", func() {
	It("Now", func() {
		res := helloWorld()
		Expect(res).To(Equal("Zakir Hello World"))
	})
})
