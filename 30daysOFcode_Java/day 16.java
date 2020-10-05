import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int l=S.length();
        
     try{ 
            int A = Integer.parseInt(S);
          
           System.out.print(S);
           
     }
     catch(java.lang.NumberFormatException e)
     {
            System.out.print("Bad String");
     }


    }
}

