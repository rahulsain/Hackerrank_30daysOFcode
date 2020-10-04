package main

import (
	"fmt"
	"math"
)

func main() {
	//Enter your code here. Read input from STDIN. Print output to STDOUT
	var num float64
	fmt.Scan(&num)
	//odd
	if math.Mod(num, 2) == 1 {
		fmt.Println("Weird")
	} else {
		if num < 6 && num > 1 {
			fmt.Println("Not Weird")
		}
		if num < 21 && num > 5 {
			fmt.Println("Weird")
		}
		if num > 20 {
			fmt.Println("Not Weird")
		}
	}
}
