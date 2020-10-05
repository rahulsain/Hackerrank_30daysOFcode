using System;
using System.Linq;

class Difference {
    private int[] elements;
    public int maximumDifference;


    public Difference(int[] elements){
        this.elements = elements;
    }

    public void computeDifference(){
        int maxDiff = 0;

        foreach(int n in this.elements){
            for(int i=0; i < this.elements.Length;i++){
                maxDiff = n - this.elements[i];
                this.maximumDifference = maxDiff > this.maximumDifference ? maxDiff : this.maximumDifference;
            }
        }
    }

} // End of Difference Class

class Solution {
    static void Main(string[] args) {
        Convert.ToInt32(Console.ReadLine());

        int[] a = Console.ReadLine().Split(' ').Select(x=>Convert.ToInt32(x)).ToArray();

        Difference d = new Difference(a);

        d.computeDifference();

        Console.Write(d.maximumDifference);
    }
}