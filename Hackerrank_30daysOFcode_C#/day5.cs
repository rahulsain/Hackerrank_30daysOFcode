using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;

class Solution {
    
    static void Main(String[] args) {

        int N = Convert.ToInt32(Console.ReadLine());

        for(int i = 1; i < 11; i++){
            Console.WriteLine(N + " x " + i + " = " + N*i);
        }
    }
}