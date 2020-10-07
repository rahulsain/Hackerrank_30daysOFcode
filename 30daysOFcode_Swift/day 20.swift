// Bubble Sort Solution
import Foundation

// read the integer n
let n = Int(readLine()!)!

// read the array
var arr = readLine()!.components(separatedBy: " ").map{ Int($0)! }

// SOLUTION:
var numberOfSwaps = 0

public func bubbleSort<T> (_ elements: [T]) -> [T] where T: Comparable {
  return bubbleSort(elements, <)
}

public func bubbleSort<T> (_ elements: [T], _ comparison: (T,T) -> Bool) -> [T]  {
  var array = elements
  
  for i in 0..<array.count {
    for j in 1..<array.count-i {
      if comparison(array[j], array[j-1]) {
        let tmp = array[j-1]
        array[j-1] = array[j]
        array[j] = tmp
        numberOfSwaps += 1
      }
    }
    if numberOfSwaps == 0 {
        break
    }
  }
  
  return array
}

var sortedArray = bubbleSort(arr)
print("Array is sorted in \(numberOfSwaps) swaps.")
print("First Element: \(sortedArray[0])")
print("Last Element: \(sortedArray[n - 1])")
