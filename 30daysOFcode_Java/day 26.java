
import java.time.LocalDate;
import java.util.Scanner;
public class day26 {
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

import java.util.Scanner;

public class solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner sc = new Scanner(System.in);
        //System.out.println("Please enter Actual day");
        int actualDay = sc.nextInt();
        //System.out.println("Please enter Actual Month");
        int actualMonth = sc.nextInt();
        //System.out.println("Please enter Actual Year");
        int actualYear = sc.nextInt();

        //System.out.println("Please enter Expected Day");
        int expectedDay = sc.nextInt();
        //System.out.println("Please enter Expected Month");
        int expectedMonth = sc.nextInt();
        //System.out.println("Please enter Expected Year");
        int expectedYear = sc.nextInt();


        int fine = computeFine(actualDay, actualMonth, actualYear, expectedDay, expectedMonth, expectedYear);

        System.out.println(fine);
    }
    /**
     * This is a simple system that defines how much fine 
     * one has to pay if
     * he is delayed for years ,months ,days.
     * @param actualDay
     * @param actualMonth
     * @param actualYear
     * @param expectedDay
     * @param expectedMonth
     * @param expectedYear
     * @return 10000 {actualYear > expectedYear } 
     * @return (actualMonth - expectedMonth) * 500 { given actualYear = expectedYear } 
     * @return (actualDay - expectedDay) * 15 {given actualYear = expectedYear &&actualMonth = expectedMonth}
     */

    static int computeFine(int actualDay, int actualMonth, int actualYear, int expectedDay, int expectedMonth, int expectedYear) {

        int fine = 0;

        if (actualYear > expectedYear) {
            fine = 10000;
        }
        else if (actualYear == expectedYear) {

            if (actualMonth > expectedMonth) {
                fine = (actualMonth - expectedMonth) * 500;
            }
            else if (actualMonth == expectedMonth) {

                if (actualDay > expectedDay) {
                    fine = (actualDay - expectedDay) * 15;
                }
            }}
        //CASE : 3
        else if(returnDate.getYear() == expectDate.getYear()) 
            fine=500*(returnDate.getMonthValue()-expectDate.getMonthValue());
        //CASE : 4
        else fine=10000;
        //OUTPUT...
        System.out.println(fine);
    }
}
}
