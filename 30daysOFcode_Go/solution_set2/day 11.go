package main

import (
	"bufio"
	"fmt"
	"io"
	"os"
	"strconv"
	"strings"
)

// Go by defualt doesnt have min max int's, so this is a work around :|
const maxInt = int(^uint(0) >> 1)
const minInt = -maxInt - 1

func main() {
	reader := bufio.NewReaderSize(os.Stdin, 1024*1024)

	var arr [][]int32
	for i := 0; i < 6; i++ {
		arrRowTemp := strings.Split(readLine(reader), " ")

		var arrRow []int32
		for _, arrRowItem := range arrRowTemp {
			arrItemTemp, err := strconv.ParseInt(arrRowItem, 10, 64)
			checkError(err)
			arrItem := int32(arrItemTemp)
			arrRow = append(arrRow, arrItem)
		}

		if len(arrRow) != int(6) {
			panic("Bad input")
		}

		arr = append(arr, arrRow)
	}

	max := minInt
	for i := 0; i < 4; i++ {
		for j := 0; j < 4; j++ {
			a := arr[i][j] + arr[i][j+1] + arr[i][j+2]
			b := arr[i+1][j+1]
			c := arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2]
			if max < int(a+b+c) {
				max = int(a + b + c)
			}
		}
	}
	fmt.Println(max)
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
