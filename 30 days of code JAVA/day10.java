import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class hackbin {
    
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        int co=n;
        int arr[]= new int[40];
        int i=0;
        
      while(co!=0)
       {  arr[i]=co%2;
          i++; 
          co=co/2;
       }
                    
    // for(i=15;i>-1;i--)
     //    System.out.print(arr[i]);
     int c=0;
     int max=0;
     if(arr[0]==1) {max=1; c=1;}
     
     for(i=1;i<=39;i++)
     {
          if((arr[i]==1 && arr[i+1]==1))
               c++;
        else  if (arr[i-1]==1 && arr[i]==1) c++;
          
          else if(arr[i]==0) c=0;   
               else c=1;  
          if(max<c)
             { max=c;}
     
      }

    //System.out.println();
    System.out.print(max);     

        scanner.close();
    }
}
