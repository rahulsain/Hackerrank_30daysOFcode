package main
import (
	"fmt"
	"math"
)

type AdvancedArithmetic interface {
	divisorSum(n int) int
}

type impl struct{}
func (impl) divisorSum(n int) int {
	sum := 0
	for i := 1; i <= int(math.Sqrt(float64(n))); i++ {
		if n % i == 0 {
			sum += i
			if i != n/i {
				sum += n/i
			}
		}
	}
	return sum
}

func main() {
	var n int
	fmt.Scan(&n)
	
	obj := impl{}
	fmt.Println("I implemented: AdvancedArithmetic")
	fmt.Println(obj.divisorSum(n))
}
