package main

import "fmt"

func main() {
	//Enter your code here. Read input from STDIN. Print output to STDOUT
	// reading the number of string to be given
	var numberOfString int
	fmt.Scanln(&numberOfString)

	for i := 0; i < numberOfString; i++ {
		// reading the string in same variable again and again
		var inputString string
		fmt.Scanln(&inputString)

		for x := 0; x < len(inputString); x++ {
			//printing even position charaters
			if x%2 == 0 {
				// remember to convert to string because inputString[x] returns thier ASCII code/number
				fmt.Print(string(inputString[x]))
			}
		}
		fmt.Print(" ")
		for x := 0; x < len(inputString); x++ {
			//printing odd position charaters
			if x%2 != 0 {
				fmt.Print(string(inputString[x]))
			}
		}
		fmt.Print("\n")
	}
}
