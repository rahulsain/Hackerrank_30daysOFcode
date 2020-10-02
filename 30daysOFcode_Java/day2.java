import java.util.*;
public class day2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double meal_cost=sc.nextDouble();
        int tip_percent=sc.nextInt();
        int tax_percent=sc.nextInt();
        solve(meal_cost,tip_percent,tax_percent);
    }
    public static void solve(double meal_cost,int tip_percent,int tax_percent){
        float tip,tax;
        int totalCost;
        tax=(float)meal_cost*tax_percent/100;
        tip=(float)meal_cost*tip_percent/100;
        totalCost=(int)(meal_cost+tip+tax);
        System.out.println(totalCost);
    }
}
