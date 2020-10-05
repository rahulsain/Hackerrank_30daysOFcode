using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;

class Solution {

    static void Main(String[] args) {

        int[][] arr = new int[6][];
        
        for(int arr_i = 0; arr_i < 6; arr_i++){
           string[] arr_temp = Console.ReadLine().Split(' ');
           arr[arr_i] = Array.ConvertAll(arr_temp,Int32.Parse);
        }

        int sum = 0;
        int sumMax = -64;

        for(int i=0; i < 6;i++){
            for(int j=0; j < 6; j++){
                if(i+1 < 6 && i+2 < 6 && j+1 < 6 && j+2 < 6){
                    sum = arr[i][j] + arr[i][j+1] + arr[i][j+2] +
                                arr[i+1][j+1] +
                    arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
                }
                sumMax = sum > sumMax ? sum : sumMax;
            }
        }
        Console.WriteLine(sumMax);
    }
}