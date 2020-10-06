using System;
using System.Collections.Generic;
using System.IO;
class Solution {
        static void Main(string[] args)
        {
            int Counter = int.Parse(Console.ReadLine());

            for (int i = 0; i < Counter; i++)
            { 
                int Number= int.Parse(Console.ReadLine());

                if (IsPrime(Number))
                    Console.WriteLine("Prime");
                else
                    Console.WriteLine("Not prime");
            }
        }
        public static bool IsPrime(int n)
        {
            if (n < 2)
                return false;
            for (int i = 2; i * i <= n; i++)
                if (n % i == 0)
                    return false;
            return true;
        }  
}