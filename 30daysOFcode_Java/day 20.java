import java.util.*;
public class Solution {
    //bubble sort is mentioned in question..
    //else the best sorting algorithm would be quick sort...
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        int numberOfSwaps=0;
        for (int i=0;i<n;i++) 
        {
            for (int j=0;j<n-1;j++)
            {
                if (a[j]>a[j+1])
                {
                    //below three lines are used for swapping...
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    numberOfSwaps++;
                }
            }
            if (numberOfSwaps==0) break;
        }
        System.out.println("Array is sorted in "+numberOfSwaps+" swaps.");
        System.out.println("First Element: "+a[0]);
        System.out.println("Last Element: "+a[n-1]);
    }
}