class Calculator {
    // Start of function power
    func power(n: Int, p: Int) throws -> Int {
        // Add your code here
        if (n < 0 || p < 0) {
            throw RangeError.NotInRange("n and p should be non-negative")
        }
        var result = 1
        for _ in 0..<p  {
            result *= n
        }
        return result
    } // End of function power
}
