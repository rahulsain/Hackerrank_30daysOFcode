import java.io.*;
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        //creating an object to allocate memory space for input variables...
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t!=0){
            String s=sc.next();
            String s1="",s2="";
            for(int i=0;i<s.length();i++){
                //charAt() function returns the character
                //found at index "i"...
                if(i%2!=0) s2=s2+s.charAt(i);
                else s1=s1+s.charAt(i);
            }
            //adding a space between the strings and printing it...
            System.out.println(s1+" "+s2);
            t--;
        }
    }
}