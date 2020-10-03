package main

import "fmt"

type AdvancedArithmatic interface {
		DivisorSum(n int) int
}

type Calculator struct {
	n int
}

func(c *Calculator) DivisorSum(n int) int {
	sum := 0
	for i:=1; i<=n; i++ {
		if n%i == 0 {
			sum += i
		}
	}
	return sum
}

func main() {
	a := Calculator{5}
	fmt.Println(a.DivisorSum(a.n))

}