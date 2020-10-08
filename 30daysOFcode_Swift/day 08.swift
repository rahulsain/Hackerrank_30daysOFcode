// Day 08 swift 
// read input
var n = Int(readLine()!)!
// phone number
var phoneBook = [String: String]()

for i in 0...n - 1 {
    // read contacts into phone book
    var contact = readLine()!.characters.split(separator: " ").map(String.init)
    phoneBook[contact[0]] = contact[1]
}

var queryName = readLine()
while queryName != nil {
    if let number = phoneBook[queryName!] {
        print("\(queryName!)=\(phoneBook[queryName!]!)")
    }
    else {
        print("Not found")
    }
    queryName = readLine()
}
