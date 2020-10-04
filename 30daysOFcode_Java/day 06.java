import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
               Scanner sc=new Scanner(System.in);
           int n=sc.nextInt();
              sc.nextLine();
      int i;
        int x=1;
     while(x<=n)
      { 
        
        char[] se=new char[10000];
        char[] so=new char[10000];
        char[] ss=new char[10000] ;
        String s=sc.nextLine();
         if(s.equals(null)) break;
      else{
               ss= s.toCharArray();
       
        int j=0;
        int k=0; 
        for(i=0;i<s.length();i++)
        {
            if(i%2==0)
                {se[j]=ss[i]; j++;}
            else
                {so[k]=ss[i]; k++;}
        }
        
      
     for(i=0;se[i]!='\0';i++)
        System.out.print(se[i]);
    
      System.out.print(" ");
      
       for(i=0;so[i]!='\0';i++)
        System.out.print(so[i]);
        System.out.println(); 
       x++; 
      }  
        
       
          
           }  
         
        
        
      }

        
        
        
        
        
    
}