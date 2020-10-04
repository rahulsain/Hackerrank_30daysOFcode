package main

import (
	"bufio"
	"fmt"
	"math"
	"os"
)

func main() {
	var num int
	fmt.Scan(&num)
	scanner := bufio.NewReader(os.Stdin)
	var lines []string
	var i int
	for i <= num {
		line, _ := scanner.ReadString('\n')
		lines = append(lines, line)
		i++
	}

	for _, v := range lines {
		if len(v) > 1 {
			var (
				fword, lword string
			)
			for i := range v {
				if v[i] != '\r' && v[i] != '\n' {
					if math.Mod(float64(i), 2) == 0 {
						fword = fword + string(v[i])
					} else {
						lword = lword + string(v[i])
					}
				}
			}
			fmt.Printf("%s %s\n", fword, lword)
		}
	}
}
