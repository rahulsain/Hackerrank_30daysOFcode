import java.util.*;
public class day09{
    //defining a recursive function to find factorial...
    static int factorial(int n){
        if(n<=1) return 1;       //terminating case...
        return (n*factorial(n-1));
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //calling the function in the print statement...
        System.out.println(factorial(n));
    }
}