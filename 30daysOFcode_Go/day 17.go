package main
import (
    "fmt"
    "math"
    "errors"
)

func main() {
	var num int
    
    fmt.Scan(&num)
    
    for i := 0; i < num; i++ {
        var n, p int
        fmt.Scan(&n, &p)
        val, err := calcPower(float64(n), float64(p))
        if err != nil {
            fmt.Println(err.Error())
            continue
        }
        fmt.Println(val)
    }
}

func calcPower(n, p float64) (float64, error) {
    if n < 0 || p < 0 {
        return -1, errors.New("n and p should be non-negative")
    }
    return math.Pow(n, p), nil
}