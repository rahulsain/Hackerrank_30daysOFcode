package main

import (
	"strconv"
	"fmt"
)

func conversion(s string) int {
	n, err := strconv.Atoi(s)
	if err != nil {
		fmt.Println("Bad String")
		return 0
	} else {
		return n
	}
}

func main() {

	fmt.Println(conversion("32"))
}