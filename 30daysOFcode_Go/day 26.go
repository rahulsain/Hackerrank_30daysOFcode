package main

import "fmt"

func main() {
	var y1, y2, m1, m2, d1, d2 int
	fmt.Scanln(&d2, &m2, &y2)
	fmt.Scanln(&d1, &m1, &y1)

	if y2 > y1 {
		fmt.Print(10000)
	} else if m2 > m1 && y2 == y1 {
		fmt.Print(500 * (m2 - m1))
	} else if d2 > d1 && m2 == m1 && y2 == y1 {
		fmt.Print(15 * (d2 - d1))
	} else {
		fmt.Print(0)
	}

}
