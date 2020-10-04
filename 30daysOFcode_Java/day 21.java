import java.util.*;

class Printer <T> {

    /**
    *    Method Name: printArray
    *    Print each element of the generic array on a new line. Do not return anything.
    *    @param A generic array
    **/
    
    // Write your code here

    public static <E> void printArray(E[] a)
    {
        for(E elements: a)
        {
            System.out.println(elements);
        }
    }
    


}
