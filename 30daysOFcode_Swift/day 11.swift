import Foundation

let arr: [[Int]] = AnyIterator{ readLine() }.prefix(6).map {
    let arrRow: [Int] = $0.split(separator: " ").map {
        if let arrItem = Int($0.trimmingCharacters(in: .whitespacesAndNewlines)) {
            return arrItem
        } else { fatalError("Bad input") }
    }

    guard arrRow.count == 6 else { fatalError("Bad input") }

    return arrRow
}

guard arr.count == 6 else { fatalError("Bad input") }

let hourglasses = (0 ... arr.count - 3).reduce([[Int]]()) { result, row -> [[Int]] in
    let hourglassesInRow = (0 ... arr[row].count - 3).map { col -> [Int] in
        [
            arr[row][col], // topLeft
            arr[row][col + 1], // topMiddle
            arr[row][col + 2], // topRight
            arr[row + 1][col + 1], // middle
            arr[row + 2][col], // bottomLeft
            arr[row + 2][col + 1], // bottomMiddle
            arr[row + 2][col + 2], // bottomRight
        ]
    }
    return result + hourglassesInRow
}

let maxSum = hourglasses
    .map { $0.reduce(0, +) }
    .max()!

print(maxSum)
