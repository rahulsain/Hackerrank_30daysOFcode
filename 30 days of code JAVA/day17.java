import java.util.*;
import java.io.*;
import java.math.*;
//Write your code here

class Calculator extends Exception
{
    int power (int n,int p) throws Exception {
      
        if(n<0 || p<0)
           { String ans ="n and p should be non-negative"; throw new Exception(ans) ;}
            


       else return (int)Math.pow(n, p);

     // return 1;
    }
}

class Solution{