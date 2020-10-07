import java.util.*;
//most precised and simple code for this problem...
//simplicity of the code makes it extremely easy to understand...
public class Solution {
    public static void main(String[] args) {
        //object crreation  for memory allocation to variables...
        Scanner sc=new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=1;i<=t;i++){
        int n,k,max=0;
        n=sc.nextInt();
        k=sc.nextInt();
            for(int j=1;j<n;j++)
            {
                for(int l=j+1;l<=n;l++){
                    //bitwise-and operation...
                    int temp=l&j;
                    if((temp<k) && (temp>max)) max=temp;
                }}
            System.out.println(max);
}}}