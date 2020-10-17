// Enter your code here 
import Foundation
var n = Int(readLine()!)!
var rows = [String]()
while n-- > 0 {
    rows.append(readLine()!)
}
//
let predicate = NSPredicate(format: "SELF contains[c] %@", "@gmail.com")
var filteredArray = rows.filter { predicate.evaluateWithObject($0) }.sort()

for var element in filteredArray {
    print(element.componentsSeparatedByString(" ").first! as String)
}
