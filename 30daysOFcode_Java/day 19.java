import java.io.*;
import java.util.*;

interface AdvancedArithmetic{
   int divisorSum(int n);
}

class Calculator implements AdvancedArithmetic {
    public int divisorSum(int n) {
     // System.out.println("I implemented: AdvancedArithematic");
int A[]=new int[10000];
int h=0;
int i=1;
for(;i<=n;i++)
{
    if(n%i==0)
    {
       A[h]=i;
       h++;
    }
}

int sum=0;

for(i=0;i<n;i++)
{
    sum+=A[i];
}


        return sum;
    }
}

class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        
      	AdvancedArithmetic myCalculator = new Calculator(); 
        int sum = myCalculator.divisorSum(n);
        System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName() );
        System.out.println(sum);
    }
}