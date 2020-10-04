import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        int[] nums = new int[N];
        for (int i = 0; i< N; i++)
            nums[i] = sc.nextInt();
        int swapNum = 0;
        for (int i = 0; i < N; i++) {
            int numberOfSwaps = 0;
            for (int j = 0; j < N - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    numberOfSwaps++;
                }
            }
            swapNum += numberOfSwaps;
            if (numberOfSwaps == 0) break;
        }
        System.out.println("Array is sorted in " + swapNum + " swaps.");
        System.out.println("First Element: " + nums[0]);
        System.out.println("Last Element: " + nums[nums.length - 1]);
    
        sc.close();
    }
}

