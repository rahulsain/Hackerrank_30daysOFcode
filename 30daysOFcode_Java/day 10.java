import java.util.*;
public class day10{
//a short and simple code with better understandability...
    public static void main(String[] args) {
        //object creation for memory allocation for variables...
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int sum=0,temp=0;
    while(n!=0)
    {
        int r=n%2;
        if(r==1)
        { 
            sum++;
            if(sum>=temp) temp=sum;
        }
        else sum=0;
        n=n/2;
    }
    System.out.println(temp);
 }
}
