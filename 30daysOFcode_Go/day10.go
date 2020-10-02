package main
import "fmt"

func main() {
    var n int
    
    fmt.Scan(&n)
    
    max := 0
    current := 0
    for _, c := range fmt.Sprintf("%b", n) {
        if (string(c) == "1") {
            current++
        } else {
            if current > max {
                max = current
            }
            current = 0
        }
    }
    if current > max {
        max = current
    }
    fmt.Println(max)
}
