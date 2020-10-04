using System;
using System.Collections.Generic;
using System.IO;

class Solution {

    static void Main(String[] args) {
             
        int n = int.Parse(Console.ReadLine());
        string s = "";
        string value = "";

        Dictionary<string, string> phoneBook = new Dictionary<string, string>();

        for(int i=0; i < n; i++){
            s = Console.ReadLine();

            string[] keyValue = s.Split(' ');
            phoneBook.Add(keyValue[0], keyValue[1]);
        }

        s = Console.ReadLine();

        while(s != ""){
            if(phoneBook.TryGetValue(s, out value)){
                Console.WriteLine(s + "=" + value);
            }
            else{
                Console.WriteLine("Not found");
            }

            s = Console.ReadLine();
        }
    }
}