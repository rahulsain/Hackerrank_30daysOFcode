using System;
using System.Collections.Generic;
using System.IO;

class Solution {
    
    static void Main(String[] args) {

        double mealCost = double.Parse(Console.ReadLine());
        int tipPercent = int.Parse(Console.ReadLine());
        int taxPercent = int.Parse(Console.ReadLine());

        double tip = mealCost * tipPercent / 100;
        double tax = mealCost * taxPercent / 100;

        double totalCost = Math.Round(mealCost + tip + tax, 0);

        Console.WriteLine("The total meal cost is " + totalCost + " dollars.");
    }
}