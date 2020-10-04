import Foundation

let mealCost = Double(readLine()!)!; // original meal price
let tipPercent = Double(readLine()!)!; // tip percentage
let taxPercent = Double(readLine()!)!; // tax percentage

// Calculate Tax and Tip doubles:
let tip = mealCost * tipPercent / 100;
let tax = mealCost * taxPercent / 100;

// cast the result of the rounding operation to an int and save it as totalCost 
let totalCost = Int(round(mealCost + tax + tip));

print("The total meal cost is \(totalCost) dollars.");
