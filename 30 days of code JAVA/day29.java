
import java.util.*;

public class day29 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner  sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int max=0;
            for(int i=1;i<n;i++){
                for(int j=i+1;j<=n;j++){
                    int res= i&j;
                    if(res>max && res<k)
                        max=res;
                }
            }
            System.out.println(max);
        }
    }
}