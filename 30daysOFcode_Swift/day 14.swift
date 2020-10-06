import Foundation

class Difference {
    private var elements = [Int]()
    var maximumDifference: Int

    init(a: [Int]) {
        elements = a
        maximumDifference = 0
    }

    func computeDifference() {
        maximumDifference = elements.reduce(0) { result, element in
            max(result, elements.map { abs(element - $0) }.max() ?? 0)
        }
    }
} // End of Difference class

let n = Int(readLine()!)!
let a = readLine()!.components(separatedBy: " ").map{ Int($0)! }

let d = Difference(a: a)

d.computeDifference()

print(d.maximumDifference)
