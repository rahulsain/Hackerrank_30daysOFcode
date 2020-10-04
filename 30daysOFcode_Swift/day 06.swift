// Day - 6 Let's review

import Foundation
let t = Int(readLine()!)!

for i in 1...t{
    var str = String(readLine()!)
    var len = str.count
//    var string:[Character] = str
    
    var even:[Character] = []
    var odd:[Character] = []
    var i = 0
    
    for char in str{
        if(i % 2 == 0) {
            even.append(char)
        }
        else{
            odd.append(char)
        }
        i += 1
    }
    
    let even_string = String(even)
    let odd_string = String(odd)
    
    print("\(even_string) \(odd_string)")
    
}
