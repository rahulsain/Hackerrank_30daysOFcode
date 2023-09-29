using System;
using System.Collections.Generic;

class Solution {

    static void Main(String[] args) {
             
        int n = int.Parse(Console.ReadLine());
        string s = "";
        string value = "";

        Dictionary<string, string> phoneBook = new Dictionary<string, string>();

        for (int i = 0; i < n; i++) {
            s = Console.ReadLine();

            string[] keyValue = s.Split(' ');

            // Check if the key already exists in the dictionary before adding it
            if (keyValue.Length == 2) {
                phoneBook[keyValue[0]] = keyValue[1];
            }
        }

        s = Console.ReadLine();

        while (!string.IsNullOrEmpty(s)) {
            // Check if the key exists in the dictionary
            if (phoneBook.TryGetValue(s, out value)) {
                Console.WriteLine(s + "=" + value);
            } else {
                Console.WriteLine("Not found");
            }

            s = Console.ReadLine();
        }
    }
}
