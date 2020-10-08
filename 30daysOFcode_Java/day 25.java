import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

public static void isPrime(int a)
{
     int i;
     
if(a>1000000000)
{     double c=0;
    for(i=1;i<=a/4;i++)
    {
        if(a%i==0)
        c++;
        if(c>2) break;
    }
    if(c==1)
    System.out.println("Prime");
    else 
    System.out.println("Not prime");

   return;
}

    double c=0;
    for(i=1;i<=a;i++)
    {
        if(a%i==0)
        c++;
        if(c>2) break;
    }
    if(c==2)
    System.out.println("Prime");
    else 
    System.out.println("Not prime");
}


    public static void main(String[] args) {
        /* Enter your code here. */
      Scanner sc=new Scanner(System.in);
    
      int n=sc.nextInt();
      int A[]=new int[n];
    
      for(int i=0;i<n;i++)
      {
             A[i]=sc.nextInt();
      }

     for(int i=0;i<n;i++)
         Solution.isPrime(A[i]);

    }
}



