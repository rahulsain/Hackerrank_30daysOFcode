import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
       String [] A=new String[N];
       int h=0;
        for (int NItr = 0; NItr < N; NItr++) {
            String[] firstNameEmailID = scanner.nextLine().split(" ");

            String firstName = firstNameEmailID[0];

            String emailID = firstNameEmailID[1];
            int l=emailID.length();
            int v=l-10;
            if(emailID.substring(v,l).equals("@gmail.com"))
               { A[h++] = firstName; }   

        }

        for(int i=0;i<h-1;i++)
        {
          for(int j=0;j<h-1;j++)
          {
            if((A[j].compareTo(A[j+1]))>0)
            {
              String t=A[j];
              A[j]=A[j+1];
              A[j+1]=t;
            }
          }
        }

        for(int i=0;i<h;i++)
        {
          System.out.println(A[i]);
        }
      
        scanner.close();
    }
}
