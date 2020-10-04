package main
import (
    "fmt"
    "bufio"
    "os"
    "io"
)

func readStr() string {
    var reader *bufio.Reader
    var line []rune
    var char rune
    var err error

    reader = bufio.NewReader(os.Stdin)

    for {
        char, _, err = reader.ReadRune()
        if err == io.EOF || char == '\n' {break}
        if err != nil {
            os.Exit(1)
        }
        line = append(line, char)
    }
    return string(line)
}


func main() {
 var input string
 input = readStr()
 fmt.Printf("Hello, World.\n%s", input)
}
