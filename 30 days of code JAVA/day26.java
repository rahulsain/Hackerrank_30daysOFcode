

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner sc = new Scanner(System.in);

        int actualDay = sc.nextInt();
        int actualMonth = sc.nextInt();
        int actualYear = sc.nextInt();

        int expectedDay = sc.nextInt();
        int expectedMonth = sc.nextInt();
        int expectedYear = sc.nextInt();


        int fine = computeFine(actualDay, actualMonth, actualYear, expectedDay, expectedMonth, expectedYear);

        System.out.println(fine);
    }

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
            }
        }

        return fine;
    }
}

