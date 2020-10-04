//extremely simple code demonstrating loops
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        //object creation and variable creation
        //then memory allocation to the variable...
        Scanner scanner=new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i=1;i<11;i++)
            System.out.println(n+" x "+i+" = "+(n*i));
    }
}
