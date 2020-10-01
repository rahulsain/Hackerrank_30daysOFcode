import java.util.*;
public class day3 {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        if(n %2!=0||(n%2==0 && n>=6 && n<=20)){
            System.out.println("Weird");
        }
        else if(n%2==0 && n<=5 && n>=2 || n>20){
            System.out.println("Not Weird");
        }
    }
}
