//possibly the cleanest code for this program...
import java.util.*;
public class day3
{
    public static void main(String[] args)
    {
        //Object Creation, variable declaration and memory allocation
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //crisp two conditionals covering all 4 cases
        if(n%2!=0 || (n>5 && n<21)) System.out.println("Weird");
        else System.out.println("Not Weird");
    }
}