package main

import (
	"fmt"
)

func main() {
	//Enter your code here. Read input from STDIN. Print output to STDOUT
	var number uint32
	fmt.Scan(&number)
	// condition : If n is odd, print Weird
	if number%2 == 1 {
		fmt.Println("Weird")
	} else {
		// to apply second given condition
		if number < 6 && number > 2 {
			fmt.Println("Not Weird")
		}
		// to apply third given condition
		if number <= 20 && number > 6 {
			fmt.Println("Weird")
		}
		// to apply fourth given condition
		if number > 21 {
			fmt.Println("Not Weird")
		}
	}
}
