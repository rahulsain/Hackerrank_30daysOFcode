import java.util.*;
//a very compact and simple code which is easy to understand...
public class day07{
    public static void main(String[] args){
        //object creation for memory allocation to variables...
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        //reversing the direction of loop
        //reverses the way in which array gets printed...
        for(int i=n-1;i>=0;i--) System.out.print(a[i]+" ");
    }
}