struct Printer<T> {
    func printArray<T>(array: [T]) {
        array.forEach { array.forEach { print($0) } }
    }
}
