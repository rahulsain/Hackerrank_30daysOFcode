package main
import (
    "fmt"
    "bufio"
    "os"
)

func main() {
 //Enter your code here. Read input from STDIN. Print output to STDOUT
 var n int
 var k,v string
 m := make(map[string]string)
 scanner := bufio.NewScanner(os.Stdin)
 fmt.Scan(&n)
 for i := 0; i < n; i++ {
    fmt.Scanf("%s %s", &k, &v)
    m[k] = v
 }

 for scanner.Scan() {
    s := scanner.Text()
    if m[s] == "" {
        fmt.Println("Not found")
    } else {
        fmt.Printf("%s=%s\n",s,m[s])
    }
 }

}