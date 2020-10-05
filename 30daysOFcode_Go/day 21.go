// Go 1.15 doesn't yet support generics so this is implemented using interface{} which allows you to appends any type to the array
// For example, you can append both ints and strings to the same array.
// Once Go is updated to support generics, this solution can be updated as well
// See: https://blog.golang.org/generics-next-step, https://go.googlesource.com/proposal/+/refs/heads/master/design/go2draft-contracts.md

package main
import "fmt"

func printArray(arr []interface{}) {
	for _, v := range arr {
		fmt.Println(v)
	}
}

func main() {
	var size int
	fmt.Scan(&size)
	
	arr := make([]interface{}, size)
	for i := 0; i < size; i++ {
		var n int
		fmt.Scan(&n)
		arr[i] = n
	}

	printArray(arr)
}
