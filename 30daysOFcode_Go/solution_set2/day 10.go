package main

import (
	"bufio"
	"fmt"
	"io"
	"os"
	"strconv"
	"strings"
)

func main() {
	reader := bufio.NewReaderSize(os.Stdin, 1024*1024)

	nTemp, err := strconv.ParseInt(readLine(reader), 10, 64)
	checkError(err)
	n := int32(nTemp)
	// to convert the number to binary, use %b with fmt.Sprint, it return the binary number as a string
	binaryString := fmt.Sprintf("%b", n)
	// to iterate over the binary string
	counter := 0
	maxString := 0
	for _, value := range binaryString {
		if string(value) == "1" {
			counter++
		} else {
			// if the maxstring of "1" is less than the current counter of maxstring
			// then make the maxstring = current mex length of  "1"
			if maxString < counter {
				maxString = counter
			}
			// reseting becuase if in-countered a 0
			counter = 0
		}
	}

	if counter > maxString {
		fmt.Println(counter)
	} else {
		fmt.Println(maxString)
	}
}

func readLine(reader *bufio.Reader) string {
	str, _, err := reader.ReadLine()
	if err == io.EOF {
		return ""
	}

	return strings.TrimRight(string(str), "\r\n")
}

func checkError(err error) {
	if err != nil {
		panic(err)
	}
}
