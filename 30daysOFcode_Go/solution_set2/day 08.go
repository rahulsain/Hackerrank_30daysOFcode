// this challenge requires fast I/O, hence prefer to use bufio, using fmt.Scan wont work
// and will give you time limit exceed error

package main

import (
	"bufio"
	"fmt"
	"os"
)

func main() {
	//Enter your code here. Read input from STDIN. Print output to STDOUT

	var num int            // number of inputs
	var name, phone string // string for name and phone

	// make() is used to create variables on heap
	// here we create a map of [string]string
	phoneBook := make(map[string]string)

	scanner := bufio.NewScanner(os.Stdin)

	fmt.Scanln(&num)
	for i := 0; i < num; i++ {
		fmt.Scanf("%s %s", &name, &phone)
		phoneBook[name] = phone
	}

	for scanner.Scan() {
		str := scanner.Text()
		// when accessing a map, it return 2 things, the value and a boolean telling whether it exist or not
		// we dont need the value right not, just needs the boolean, so we can use '_' in it's place
		_, answer := phoneBook[str]
		if answer == true {
			fmt.Printf("%s=%s\n", str, phoneBook[str])
		} else {
			fmt.Printf("Not found\n")
		}
	}

}
