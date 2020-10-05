import java.util.*;
public class Arithmetic {
    public static void main(String[] args){
        //creating an object "sc" to call it later
        //this saves time
        Scanner sc=new Scanner(System.in);
        //allocating memory space using the object "sc"
        double mealCost = sc.nextDouble();
        int tipPercent = sc.nextInt();
        int taxPercent = sc.nextInt();
        //net cost calculation done in single line saves time
        //and helps to make the code look clear and short
        double netCost =mealCost+(mealCost*tipPercent/100)+(mealCost*taxPercent/100);
        //using round function to round-off the answer\
        //then casting it into integer type
        System.out.println((int) Math.round(netCost));
    }
}