using System.CodeDom.Compiler;
using System.Collections.Generic;
using System.Collections;
using System.ComponentModel;
using System.Diagnostics.CodeAnalysis;
using System.Globalization;
using System.IO;
using System.Linq;
using System.Reflection;
using System.Runtime.Serialization;
using System.Text.RegularExpressions;
using System.Text;
using System;

class Solution {

    static void solve(int n, int k) {
        int b = k - 1, maxVal = 0;

        for(int a = 2; a <= n; ++a) {
            if(a == b) continue;
            if(maxVal < (a & b)) {
                maxVal = a & b;
            }
        }
        Console.WriteLine(maxVal);
    }

    static void Main(string[] args) {
        int t = Convert.ToInt32(Console.ReadLine());

        for (int tItr = 0; tItr < t; tItr++) {
            string[] nk = Console.ReadLine().Split(' ');

            int n = Convert.ToInt32(nk[0]);

            int k = Convert.ToInt32(nk[1]);

            Solution.solve(n, k);
        }   
    }
}
