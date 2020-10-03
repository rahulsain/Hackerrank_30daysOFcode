package main

import (
	"fmt"
	"sort"
)

type Difference struct {
	elements          []int
	maximumDiffernece int
}

func (d *Difference) ComputeDifference() int {
	sort.Ints(d.elements)
	d.maximumDiffernece = d.elements[len(d.elements)-1] - d.elements[0]
	return d.maximumDiffernece
}

func main() {
	a := Difference{[]int{3, 2, 5},0}
	fmt.Println(a.ComputeDifference())

}