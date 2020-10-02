package main

import (
    "bufio"
    "fmt"
    "io"
    "os"
    "strconv"
    "strings"
    "sort"
)



func main() {
    reader := bufio.NewReaderSize(os.Stdin, 1024 * 1024)

    NTemp, err := strconv.ParseInt(readLine(reader), 10, 64)
    checkError(err)
    N := int32(NTemp)
    var names []string 
    for NItr := 0; NItr < int(N); NItr++ {
        firstNameEmailID := strings.Split(readLine(reader), " ")

        firstName := firstNameEmailID[0]

        emailID := firstNameEmailID[1]
        i := 0; n := len(emailID)
        for i < n && emailID[i] != '@'{
            i++;
        }

        if(i+6 < n && emailID[i+1:i+6] == "gmail" && i+10 <= n && emailID[i+7:i+10] == "com"){
            names = append(names, firstName)
        }
    }
    sort.Strings(names)
    for i := 0; i < len(names); i++{
        fmt.Println(names[i])
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
