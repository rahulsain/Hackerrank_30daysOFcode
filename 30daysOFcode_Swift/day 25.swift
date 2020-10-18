// Enter your code here 
func findPrime(input:Int) -> String {
    if input <= 1 {
        return "Not prime"
    }
    if input <= 3 {
        return "Prime"
    }
    var i = 2
    while i*i <= input {
        if input % i == 0 {
            return "Not prime"
        }
        i = i + 1
    }
    return "Prime"
}

var t = Int(readLine()!)!

for _ in 0...t-1 {
    print(findPrime(Int(readLine()!)!))
}
