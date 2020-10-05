import java.io.*;
import java.util.*;
//The Code is crisp and to the point...
/*
note: the solution of this program on hackerrank is
provided wrong, by the problem setter. As, the test solution
adds an extra line at the end of the program but it must not...
*/
public class Person {
    private int age;    
     public Person(int initialAge) {
          age=(initialAge>=0)?initialAge:0;
          if(age==0) System.out.println("Age is not valid, setting age to 0.");
    }
    public void amIOld() {
        //use of a String object saves us from giving
        //multiple print commands...
        String s="";
        if(age<13) s="young.";
        else if(age>12 && age<18) s="teenager.";
        else s="old";
        System.out.println("You are "+s);
    }
    public void yearPasses() {
         age++;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int age = sc.nextInt();
			Person p = new Person(age);
			p.amIOld();
			for (int j = 0; j < 3; j++) {
				p.yearPasses();
			}
			p.amIOld();
			System.out.println();
        }
		sc.close();
    }
}