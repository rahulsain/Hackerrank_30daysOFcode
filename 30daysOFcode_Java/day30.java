import java.util.*;

public class day30{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);

        //Part 1 => Take array input
        int size = scn.nextInt();
        int[] arr = new int[size];
        for(int idx = 0; idx < size; idx++)
        {
            arr[idx] = scn.nextInt();
        }

        //Part 2 => Print all sub arrays
        for(int si = 0; si < arr.length; si++)//si -> start index of every subarray
        {
            for(int ei = si; ei < arr.length; ei++)//ei -> end index. this loop will go from 'si' till the 'ei'
            {
                for(int idx = si; idx <= ei; idx++)
                {
                    System.out.print(arr[idx] + "	");
                }
                System.out.println();
            }
        }
        scn.close();
 }

}