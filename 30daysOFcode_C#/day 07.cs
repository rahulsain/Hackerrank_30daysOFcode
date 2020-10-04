using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;

class Solution {

    static void Main(String[] args) {
        
        int n = Convert.ToInt32(Console.ReadLine());
        string[] arr_temp = Console.ReadLine().Split(' ');
        int[] arr = Array.ConvertAll(arr_temp,Int32.Parse);

        string o = "";

        for(int i = n-1; i >= 0; i--){
            if(i > 0){
                o += arr[i] + " ";
            }else{
                o += arr[i];
            }
        }

        Console.WriteLine(o);