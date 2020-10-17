package main

import (
	"fmt"
)

func main() {
	var numbers int
	var number int
	fmt.Scanln(&numbers)
	for i := 0; i < numbers; i++ {
		fmt.Scanln(&number)
		isPrime := true
		if number <= 1 {
			fmt.Println("Not prime")
		} else if number <= 3 {
			fmt.Println("Prime")
		} else if number%3 == 0 || number%2 == 0 {
			fmt.Println("Not prime")
		} else {
			for i := 5; i*i <= number; i = i + 1 {
				if number%i == 0 {
					fmt.Println("Not prime")
					isPrime = false
					break
				}
			}
			if isPrime == true {
				fmt.Println("Prime")
			}
		}
	}
}
