import java.util.Scanner;
import java.time.LocalDate;
public class Solution {
    //LocalDate Function Makes it Extremely easy to manage dates...
    private static LocalDate readDate(Scanner sc) {
        int day   = sc.nextInt();
        int month = sc.nextInt();
        int year  = sc.nextInt();
        return LocalDate.of(year, month, day);
    }
    public static void main(String[] args) {
        //object is called from readDate,
        //then object is read from LocalDate,
        //Finally the value is stored in the variables...
        Scanner sc=new Scanner(System.in);
        LocalDate returnDate=readDate(sc);
        LocalDate expectDate=readDate(sc);
        
        int fine;
        //CASE : 1
        if (returnDate.isEqual(expectDate)||returnDate.isBefore(expectDate))fine=0;
        //CASE : 2
        else if(returnDate.getMonth()==expectDate.getMonth() && 
                returnDate.getYear()==expectDate.getYear()) 
        {
            fine=15*(returnDate.getDayOfMonth()-expectDate.getDayOfMonth());
        }
        //CASE : 3
        else if(returnDate.getYear() == expectDate.getYear()) 
            fine=500*(returnDate.getMonthValue()-expectDate.getMonthValue());
        //CASE : 4
        else fine=10000;
        //OUTPUT...
        System.out.println(fine);
    }
}