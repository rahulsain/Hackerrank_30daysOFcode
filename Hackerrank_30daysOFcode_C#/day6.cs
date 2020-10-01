using System;
using System.Collections.Generic;
using System.IO;

class Solution {
    
    static void Main(String[] args) {

        int n = int.Parse(Console.ReadLine());
        string[] strings = new string[n];
        string s0;
        string s1;

        for(int i = 0; i < n; i++){
            strings[i] = Console.ReadLine();

            s0 = "";
            s1 = "";

            for(int x = 0; x <= strings[i].Length - 1; x++){
                if(x % 2 == 0){
                    s0 += strings[i][x];
                }else{
                    s1 += strings[i][x];
                }
            }

            Console.WriteLine(s0 + " " + s1);
        }
    }
}