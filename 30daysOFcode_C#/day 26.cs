using System;
using System.Collections.Generic;
using System.Globalization;
using System.IO;
class Solution {
    static void Main(String[] args) {
        
         CultureInfo provider = new CultureInfo("fr-FR");
        
        DateTime returnedDate = DateTime.Parse(Console.ReadLine(), provider);
        DateTime expireDate = DateTime.Parse(Console.ReadLine(), provider);
        
        if (returnedDate < expireDate)
            Console.WriteLine(0);
        else if (returnedDate.Year > expireDate.Year)
            Console.WriteLine(10000);
        else if (returnedDate.Month > expireDate.Month)
            Console.WriteLine(500 * (returnedDate.Month - expireDate.Month));
        else if (returnedDate.Day > expireDate.Day)
            Console.WriteLine(15 * (returnedDate.Day - expireDate.Day));
    
    }
}