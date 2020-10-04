package main

import (
	"bufio"
	"fmt"
	"os"
)

func main() {
	//Enter your code here. Read input from STDIN. Print output to STDOUT
	// bufio implements buffered textual I/O
	reader := bufio.NewReader(os.Stdin)
	// to read string till '\n' newline sequence.
	// .Readstring return two values : 1st the string itself and 2nd an error (if it occured else nil)
	inputString, _ := reader.ReadString('\n')
	fmt.Println("Hello, World.")
	fmt.Println(inputString)
}
