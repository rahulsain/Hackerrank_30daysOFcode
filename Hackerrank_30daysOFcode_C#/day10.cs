using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;

class Solution {

    static void Main(String[] args) {

        int n = Convert.ToInt32(Console.ReadLine());
        string binary = Convert.ToString(n, 2);

        string[] ones = binary.Split('0');

        int sum = 0;
        int sumMax = 0;

        foreach (string o in ones){

            for(int i=0; i < o.Length; i++){
                if (o[i] == '1'){
                    sum++;
                }
            }

            sumMax = sumMax >= sum ? sumMax : sum;
            sum = 0;
        }

        Console.WriteLine(sumMax);
    }
}