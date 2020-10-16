package main

import "fmt"

func main() {
	var a []int = []int{}
	var i, j, e, n int

	fmt.Scan(&n)

	for i = 0; i < n; i++ {
		fmt.Scan(&e)
		a = append(a, e)
	}

	totalSwaps := 0

	for i = 0; i < n; i++ {
		numberOfSwaps := 0

		for j = 0; j < n-1; j++ {
			if a[j] > a[j+1] {
				a[j], a[j+1] = a[j+1], a[j]
				numberOfSwaps++
				totalSwaps++
			}
		}

		if numberOfSwaps == 0 {
			break
		}
	}

	fmt.Printf("Array is sorted in %d swaps.\n", totalSwaps)
	fmt.Printf("First Element: %d\n", a[0])
	fmt.Printf("Last Element: %d\n", a[len(a)-1])
}
