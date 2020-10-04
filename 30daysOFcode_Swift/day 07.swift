// Day 7 - Arrays

import Foundation


var size = Int(readLine()!)!

var str = String(readLine()!)
var arr = [Int]()

for i in str.reversed(){
    if i != " " {
        arr.append(Int(String(i))!)
    }
}
for i in arr{
    print(i, terminator: " ")
}
