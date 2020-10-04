package main

import (
	"bufio"
	"fmt"
	"os"
    "strings"
)

func main() {
	var num int
	fmt.Scan(&num)
	scanner := bufio.NewReader(os.Stdin)
	buffer, _ := scanner.ReadString('\n')
	buffer = strings.Trim(buffer, "\r\n")
	bufferSlice := strings.Split(buffer, " ")
	for i := num - 1; i >= 0; i-- {
		fmt.Printf("%s ", bufferSlice[i])
	}
}
