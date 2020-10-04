//Day 3 - Intro to connditional Statements

import Foundation

let n:Int = Int(readLine()!)!

if n % 2 != 0 {
    print("Weird")
}
else{
    //nested if-else
    if n>=2 && n<=5 {
        print("Not Weird")
    }
    else if n>=6 && n<=20{
        print("Weird")
    }
    else if n>20{
        print("Not Weird")
    }
}


